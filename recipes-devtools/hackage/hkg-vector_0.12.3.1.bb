DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e7ab0300579b7aa42a9148282d87c89e"

inherit hackage

SRC_URI[md5sum] = "c4ee7467d1321724948d968f2a3f82f0"
SRC_URI[sha256sum] = "fb4a53c02bd4d7fdf155c0604da9a5bb0f3b3bfce5d9960aea11c2ae235b9f35"

DEPENDS_append = "\
    hkg-primitive \
    hkg-vector-stream \
"

PR = "r1"
