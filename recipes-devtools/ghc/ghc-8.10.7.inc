require ghc-common.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI = " \
    https://downloads.haskell.org/~ghc/${PV}/ghc-${PV}-src.tar.xz \
    file://template-hsc-install-race.patch \
    file://build.mk \
"
SRC_URI[md5sum] = "d618250bf956bb6ea2628f7ec97c6ed4"
SRC_URI[sha256sum] = "e3eef6229ce9908dfe1ea41436befb0455fefb1932559e860ad4c606b0d03c9d"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7cb08deb79c4385547f57d6bb2864e0f"

do_compile_prepend() {
    cp ${WORKDIR}/build.mk ${S}/mk/
}

do_install() {
    # There is a race somewhere triggered when installing utils/hsc2hs/template-hsc.h
    # Work-around until upgrade.
    install -m 0755 -d ${D}/${libdir}/${BPN}-${PV}
    oe_runmake install DESTDIR="${D}"
}
