DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a71ff249d0afe89749fce1d22c6fbba3"

inherit hackage

SRC_URI[md5sum] = "3c19a74718f48ffa210a556fe2d8d8d1"
SRC_URI[sha256sum] = "b52b2a798c514e2f3bb37d9d629078f433745fa8a25756198c4d33751d7bce1d"

DEPENDS_append = "\
    hkg-bifunctors \
    hkg-comonad \
    hkg-contravariant \
    hkg-profunctors \
    hkg-statevar \
    hkg-tagged \
    hkg-th-abstraction \
    hkg-transformers-compat \
    hkg-unordered-containers \
"

PR = "r1"
