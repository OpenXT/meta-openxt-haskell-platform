require ghc-common.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI = " \
    https://downloads.haskell.org/~ghc/${PV}/ghc-${PV}-src.tar.xz \
    file://build.mk \
    file://gcc-4.9-fomit-frame-pointer.patch \
    file://use-order-only-constraints-for-directories.patch \
    file://linux-host-os-need-pthread.patch \
    file://binutils-2.24-config-guard.patch \
    file://integer-simple-noinline-pragmas.patch \
    file://0001-fix-a-bug-introduced-in-1fb38442d3a55ac92795aa6c5ed4.patch \
    file://0002-Fix-a-retainer-profiling-segfault.patch \
    file://0003-Run-finalizers-after-updating-the-stable-pointer-tab.patch \
    file://0004-Fix-crash-with-large-objects-7919.patch \
    file://0005-Fix-an-arithmetic-overflow-bug-causing-crashes-with-.patch \
    file://0006-stdcall-x86-64.patch \
    file://0007-x64-more-stack.patch \
    file://0008-7919-large-objects.patch \
    file://0009-Fix-segfault-in-retainer-profiling-when-using-multiple-cores-5909.patch \
    file://compile-ghc-with-no-pie.patch \
    file://force-ghc-to-compile-code-with-no-pie.patch \
    file://rts-no-hidden.patch \
    file://template-hsc-install-race.patch \
"
SRC_URI[md5sum] = "d618250bf956bb6ea2628f7ec97c6ed4"
SRC_URI[sha256sum] = "e3eef6229ce9908dfe1ea41436befb0455fefb1932559e860ad4c606b0d03c9d"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7cb08deb79c4385547f57d6bb2864e0f"
do_compile() {
    cp ${WORKDIR}/build.mk ${S}/mk/
    oe_runmake DESTDIR="${D}"
}

do_install() {
    # There is a race somewhere triggered when installing utils/hsc2hs/template-hsc.h
    # Work-around until upgrade.
    install -m 0755 -d ${D}/${libdir}/${BPN}-${PV}
    oe_runmake install DESTDIR="${D}"
}
