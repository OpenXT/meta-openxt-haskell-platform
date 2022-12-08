DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1f146cd05e812322fbcf9b679fa56636"

inherit hackage

SRC_URI[md5sum] = "bd5f179155a183e3075dccf3c1b980f6"
SRC_URI[sha256sum] = "1b27bec5e0d522b27a6029ebf4c4a6d40acbc083c787008e32fb55c4b1d128d2"

DEPENDS_append = "\
    hkg-hashable \
"

PR = "r1"
