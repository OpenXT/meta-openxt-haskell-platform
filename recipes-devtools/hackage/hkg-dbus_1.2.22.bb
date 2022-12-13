DESCRIPTION = ""
LICENSE = "Apache"
LIC_FILES_CHKSUM = "file://license.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

inherit hackage

SRC_URI[md5sum] = "c0001f5bf4adc5d9c0513bb9c9d445f7"
SRC_URI[sha256sum] = "2aae45cf6cf26410aad5f7d1ced3db9255a540fb0a36186bd187122c5fdb770d"

DEPENDS_append = "\
    hkg-cereal \
    hkg-conduit \
    hkg-exceptions \
    hkg-lens \
    hkg-network \
    hkg-random \
    hkg-split \
    hkg-th-lift \
    hkg-vector \
    hkg-xml-conduit \
    hkg-xml-types \
"

DISABLE_GHC_WRAPPERS = "1"

PR = "r1"
