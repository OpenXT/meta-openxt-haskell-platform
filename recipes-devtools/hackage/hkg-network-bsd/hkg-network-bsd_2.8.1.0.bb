DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d8791e0b8e1117b0591ad6c2862b2d92"

inherit hackage

SRC_URI[md5sum] = "53572973c4c5d52e19bcd1a1f71593c3"
SRC_URI[sha256sum] = "d94961ca15c42c798d19cde540ec12b25cc43435fb95e682399d6c1a02022d4e"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI += "\
    file://bump-supported-network-version.patch \
"

DEPENDS_append = "\
    hkg-network \
"

PR = "r1"
