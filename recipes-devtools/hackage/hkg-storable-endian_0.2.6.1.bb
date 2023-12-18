DESCRIPTION = "Storable instances with endianness."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4f801f10bb1613d14b5f06070c0d1f58"

inherit hackage

SRC_URI[md5sum] = "a3d265d4c6ba0ff86c85f322cdd7593a"
SRC_URI[sha256sum] = "ceb1a8a9109b837cc66f0a1b61fe2289a224a7afdb69d9952d537098f8709e45"

DEPENDS += "hkg-byteorder"

PR = "r1"
