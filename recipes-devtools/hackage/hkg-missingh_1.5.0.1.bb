DESCRIPTION = "MissingH is a library of all sorts of utility functions for Haskell programmers."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM="file://LICENSE;md5=627898c68e4e827265f834a5ebc07132"

HPN = "MissingH"

inherit hackage

SRC_URI[md5sum] = "ac185359cd7a5da35309fe63a5a8593b"
SRC_URI[sha256sum] = "cb2fa4a62a609ec6bcfa2eab6ae6d34c6f5bfba523fed8dc0c055b3176732231"

DEPENDS_append = "\
    hkg-hunit \
    hkg-hslogger \
    hkg-old-time \
    hkg-regex-compat \
"
