DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6c37089f81fabdd487821cbf6ddc5ef6"

inherit hackage

SRC_URI[md5sum] = "3d1180846e087af1f392d6740b8f5c00"
SRC_URI[sha256sum] = "8950c38049d892c38590d389bed49ecf880671f58ec63dd4709d9fe3d4b8f153"

DEPENDS_append = "\
    hkg-async \
    hkg-attoparsec \
    hkg-conduit \
    hkg-network \
    hkg-primitive \
    hkg-resourcet \
    hkg-streaming-commons \
    hkg-typed-process \
    hkg-unliftio-core \
"

PR = "r1"
