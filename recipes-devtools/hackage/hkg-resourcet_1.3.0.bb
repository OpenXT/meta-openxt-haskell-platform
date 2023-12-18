DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=63b20997a2f725bfb516803d87db724d"

inherit hackage

SRC_URI[md5sum] = "41b25cab71a9ecfcb291e4d3017e5630"
SRC_URI[sha256sum] = "ec601785ee42a201f32adb205b8685c983f18757b1bd33d2e806d571e0f9996b"

DEPENDS_append = "\
    hkg-exceptions \
    hkg-primitive \
    hkg-unliftio-core \
"

PR = "r1"
