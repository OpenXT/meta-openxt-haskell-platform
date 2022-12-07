# This recipe only provides the runtime libraries.
# installed-vs-shipped set to silence everything not packaged on purpose.

require ghc-${PV}.inc

PACKAGES = " \
    ${PN} \
"
FILES_${PN} = " \
    ${libdir}/ghc-${PV}/array-*/*.so \
    ${libdir}/ghc-${PV}/base-*/*.so \
    ${libdir}/ghc-${PV}/bytestring-*/*.so \
    ${libdir}/ghc-${PV}/containers-*/*.so \
    ${libdir}/ghc-${PV}/directory-*/*.so \
    ${libdir}/ghc-${PV}/filepath-*/*.so \
    ${libdir}/ghc-${PV}/ghc-prim-*/*.so \
    ${libdir}/ghc-${PV}/haskell98-*/*.so \
    ${libdir}/ghc-${PV}/integer-gmp-*/*.so \
    ${libdir}/ghc-${PV}/integer-simple-*/*.so \
    ${libdir}/ghc-${PV}/libHSffi-ghc${PV}.so \
    ${libdir}/ghc-${PV}/libHSrts-ghc${PV}.so \
    ${libdir}/ghc-${PV}/libHSrts_debug-ghc${PV}.so \
    ${libdir}/ghc-${PV}/libHSrts_thr-ghc${PV}.so \
    ${libdir}/ghc-${PV}/libHSrts_thr_debug-ghc${PV}.so \
    ${libdir}/ghc-${PV}/old-locale-*/*.so \
    ${libdir}/ghc-${PV}/old-time-*/*.so \
    ${libdir}/ghc-${PV}/pretty-*/*.so \
    ${libdir}/ghc-${PV}/process-*/*.so \
    ${libdir}/ghc-${PV}/random-*/*.so \
    ${libdir}/ghc-${PV}/syb-*/*.so \
    ${libdir}/ghc-${PV}/time-*/*.so \
    ${libdir}/ghc-${PV}/unix-*/*.so \
    ${libdir}/ghc-${PV}/utf8-string-*/*.so \
"
INSANE_SKIP_${PN} = "installed-vs-shipped"

DEPENDS += " \
    ghc-native \
"
do_configure() {
    ./configure --prefix=${prefix} --enable-shared
}

do_sysroot_ghc_pkg_db() {
    ghc-pkg recache
}
addtask do_sysroot_ghc_pkg_db before do_configure after do_prepare_recipe_sysroot
do_sysroot_ghc_pkg_db[doc] = "Amend the paths in the package database local to the recipes' sysroot."
do_sysroot_ghc_pkg_db[dirs] = "${B}"
