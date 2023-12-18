DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7d48758567ecd86752167f3f96728ddf"

inherit hackage

SRC_URI[md5sum] = "ccd18e2c0f04a1360d67f69f788bcc0e"
SRC_URI[sha256sum] = "1c4c3af50a1fcf46e46e2fa9e0493fffaf62de3607ae7553d18015f8a1a60551"

DEPENDS_append = "\
    hkg-primitive \
    hkg-vector \
"

PR = "r1"
