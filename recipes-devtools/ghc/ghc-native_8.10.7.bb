inherit native
require ghc-${PV}.inc

# This is oddly required because there is no good way to pass ${CC} as set per
# bitbake to runghc. One might think of using --ghc-options="-pgmc ${CC%% *}
# -otpc ${CC#* }", but it does not manage to parse the options correctly...
SRC_URI += " \
    file://ghc-cc \
    file://ghc-ld \
    file://ghc-pkg-wrapper \
"

# This requires a ghc6 capable compiler to be already installed on the host in
# order to bootstrap the build.
# ghc-8.10.7 can be found: https://www.haskell.org/ghc/download_ghc_8_10_7.html
# Get the binary package as it is not trivial to get it to build as intended, I
# also recommend
# http://www.edsko.net/2013/02/10/comprehensive-haskell-sandboxes/ to separate
# the installation from the host rootfs.
#

BUILD_RANLIB_remove = "-D"

do_configure() {
    ./configure --prefix=${prefix} \
                --with-intree-gmp \
                CC=`which gcc` \
                LD=`which ld`
    echo "STANDARD_OPTS += \"-I${STAGING_INCDIR_NATIVE}\"" >> rts/ghc.mk
}

do_install_append() {
    install -m 755 "${WORKDIR}/ghc-cc" "${D}${bindir}/ghc-cc"
    install -m 755 "${WORKDIR}/ghc-ld" "${D}${bindir}/ghc-ld"
    install -m 755 "${WORKDIR}/ghc-pkg-wrapper" "${D}${bindir}/ghc-pkg-wrapper"
}
