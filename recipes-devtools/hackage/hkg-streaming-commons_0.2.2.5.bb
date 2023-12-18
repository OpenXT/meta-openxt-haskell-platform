DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8fecaaa26c3014c6cdc42cc7db406fc1"

inherit hackage

SRC_URI[md5sum] = "36a88b98c403a450a138b995220c4b2d"
SRC_URI[sha256sum] = "ca50819bdb2b248ced790e9faab07a3a5369ef702d9f9a932f26438bbeeca704"

DEPENDS_append = "\
    hkg-async \
    hkg-bytestring-builder \
    hkg-network \
    hkg-random \
    hkg-zlib \
"

PR = "r1"
