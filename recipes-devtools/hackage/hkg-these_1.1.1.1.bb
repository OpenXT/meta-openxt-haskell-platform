DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a285bc4848d68b3733efbe16a442c4e8"

inherit hackage

SRC_URI[md5sum] = "a487840acba6e905a9c8e7eb1f44eeac"
SRC_URI[sha256sum] = "d798c9f56e17def441e8f51e54cc11afdb3e76c6a9d1e9ee154e9a78da0bf508"

DEPENDS_append = "\
    hkg-assoc \
    hkg-hashable \
"

PR = "r1"
