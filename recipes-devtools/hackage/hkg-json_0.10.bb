DESCRIPTION = "JSON library."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fc842e62515f35f232f237038e679cb2"

inherit hackage

RDEPENDS_${HPN} = "ghc-runtime"

SRC_URI[md5sum] = "a30006f2e673b29852be7c001cfc2bfa"
SRC_URI[sha256sum] = "0c046a3c03c9332816d3c9e50319b1d1eb3c2c1baba1123a7650d047b26856ba"

PR = "r1"
