DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9ba37c8c3c66d04fc82aabe1ffe17aa7"

inherit hackage

SRC_URI[md5sum] = "81ec52b7b6ffcd1d04c0cee8700ca477"
SRC_URI[sha256sum] = "bdb117606c0b56ca735564465b14b50f77f84c9e52e31d966ac8d4556d3ff0ff"

DEPENDS_append = "\
    hkg-attoparsec \
    hkg-blaze-html \
    hkg-blaze-markup \
    hkg-conduit \
    hkg-conduit-extra \
    hkg-data-default-class \
    hkg-resourcet \
    hkg-xml-types \
"

PR = "r1"
