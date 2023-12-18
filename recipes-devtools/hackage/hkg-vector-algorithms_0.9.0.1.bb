DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ee3dc0bded531d9e889868a40306fb97"

inherit hackage

SRC_URI[md5sum] = "70bfafbb6fae8cf09a02b884f92b514c"
SRC_URI[sha256sum] = "2ba7c0d3a8f26ef3ada24ff4abe81609225ecbab3b5754f048f8a0a3ecc33841"

DEPENDS_append = "\
    hkg-bitvec \
    hkg-vector \
"

PR = "r1"
