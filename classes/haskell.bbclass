# Some Haskell packages will require case-sensitive name handling (e.g.
# hackage), but bitbake will not handle that. So these should define HPN.
HPN ?= "${PN}"
HPV ?= "${PV}"

SECTION = "devel/haskell"

DEPENDS_append_class-target += " \
    ghc-runtime \
"
DEPENDS_append = " \
    ghc-native \
"
PACKAGES = " \
    ${PN} \
    ${PN}-doc \
    ${PN}-staticdev \
    ${PN}-dbg \
    ${PN}-dev \
"
FILES_${PN}_append = " \
    ${libdir}/ghc-*/${HPN}-${HPV}/libH*.so \
    ${libdir}/ghc-*/package.conf.d/*.conf \
    ${bindir}/* \
"
FILES_${PN}-doc_append = " \
    ${datadir}/* \
"
FILES_${PN}-staticdev_append = " \
    ${libdir}/ghc-*/${HPN}-${HPV}/libHS*.a \
"
FILES_${PN}-dbg_append = " \
    ${libdir}/ghc-*/${HPN}-${HPV}/*.o \
    ${libdir}/ghc-*/${HPN}-${HPV}/.debug \
    ${prefix}/src/debug \
"
FILES_${PN}-dev_append = " \
    ${libdir}/ghc-*/${HPN}-${HPV}/* \
"

CONFIGURE_FILES += " \
    ${S}/Setup.hs \
    ${S}/Setup.lhs \
    ${S}/${HPN}.cabal \
"

RUNGHC = "runghc"

GHC_PACKAGE_PATH_class-native = "${STAGING_LIBDIR_NATIVE}/ghc-8.10.7/package.conf.d"
GHC_PACKAGE_PATH_class-target = "${STAGING_LIBDIR}/ghc-8.10.7/package.conf.d"
export GHC_PACKAGE_PATH

# GHC has been patched to disable generating PIE code, so we need to disable
# PIE to be able to link any haskell programs.
SECURITY_CFLAGS = "${SECURITY_NOPIE_CFLAGS}"
SECURITY_LDFLAGS = ""

get_ghc_version() {
    ghc_version=$(ghc-pkg --version)
    echo "${ghc_version##* }"
}

# Bitbake will amend the WORKDIR paths it finds (staging stage 2). This works to
# our advantage for native class, target class need to be configured with their
# target dependencies, so substitute the target paths for WORKDIR starging so
# ghc-pkg finds them.
do_configure_prepend_class-target() {
    ghc_version=$(get_ghc_version)
    for pkgconf in ${STAGING_LIBDIR}/ghc-${ghc_version}/package.conf.d/*.conf; do
        if [ -f "${pkgconf}" ]; then
            sed -i \
                -e "s| /usr/lib| ${STAGING_LIBDIR}|" \
                -e "s| /usr/include| ${STAGING_INCDIR}|" \
                $pkgconf
        fi
    done
}

do_configure() {
    ghc-pkg recache

    ${RUNGHC} Setup.*hs clean --verbose
    ${RUNGHC} Setup.*hs configure \
        ${EXTRA_CABAL_CONF} \
        --disable-executable-stripping \
        --ghc-options='-dynload sysdep
                       -pgmc ghc-cc
                       -pgml ghc-ld' \
        --with-gcc="ghc-cc" \
        --enable-shared \
        --prefix="${prefix}" \
        --verbose
}

do_compile() {
    ${RUNGHC} Setup.*hs build \
        --ghc-options='-dynload sysdep
                       -pgmc ghc-cc
                       -pgml ghc-ld' \
        --with-gcc="ghc-cc" \
        --verbose
}

do_local_package_conf() {
    ${RUNGHC} Setup.*hs register \
        --gen-pkg-conf \
        --verbose
    if [ -f "${S}/${HPN}-${HPV}.conf" ]; then
        sed -i -e "s| ${D}${prefix}| ${prefix}|" ${S}/${HPN}-${HPV}.conf
    fi
}
addtask do_local_package_conf before do_install after do_compile
do_local_package_conf[doc] = "Generate Haskell package configuration."
do_local_package_conf[dirs] = "${B}"

# Amend the rpath to match target environment. This is because a lot of dynamic
# libraries will be installed in non-standard sub-directories of ${libdir}.  It
# could be configured through LD_LIBRARY_PATH, ld.so.conf, etc... but the
# easiest, since we are aware of the target system configuration is to embedded
# a valid RPATH in the binary.
do_fixup_rpath() {
    :
}
do_fixup_rpath_class-target() {
    ghc_version=$(get_ghc_version)

    for f in \
        ${D}${libdir}/ghc-${ghc_version}/${HPN}-${HPV}/libHS${HPN}-${HPV}*.so \
        ${D}${bindir}/* \
        ${D}${sbindir}/*
    do
        if [ ! -e ${f} ]; then
            continue
        fi

        f_type="$(file -b ${f})"
        if [ "${f_type%% *}" = "ELF" ]; then
            if ! RPATH="$(chrpath ${f})" ; then
                continue
            fi
            RPATH=${RPATH##*RPATH=}
            FIXED_RPATH=$(echo $RPATH | sed -e "s|${STAGING_DIR_HOST}||g")
            chrpath -r "${RPATH}" --replace "${FIXED_RPATH}" "${f}"
        fi
    done

}
addtask do_fixup_rpath after do_install before do_package
do_fixup_rpath[doc] = "Amend rpath set by GHC to comply with target's environment."
do_fixup_rpath[dirs] = "${B}"

do_install() {
    ${RUNGHC} Setup.*hs copy --copy-prefix="${D}/${prefix}" --verbose

    # Prepare GHC package database files.
    if [ -f "${B}/${HPN}-${HPV}.conf" ]; then
        ghc_version=$(get_ghc_version)
        install -m 755 -d ${D}${libdir}/ghc-${ghc_version}/package.conf.d
        install -m 644 ${B}/${HPN}-${HPV}.conf ${D}${libdir}/ghc-${ghc_version}/package.conf.d
    fi
}
