DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6c37089f81fabdd487821cbf6ddc5ef6"

inherit hackage

SRC_URI[md5sum] = "5a7c909aedd049a67c6eab099ff58e0e"
SRC_URI[sha256sum] = "aca2a086a6ee065a5d1f1efc0632bccf52a8f961e4134a4fb60447765987907d"

DEPENDS_append = "\
    hkg-exceptions \
    hkg-mono-traversable \
    hkg-resourcet \
    hkg-unliftio-core \
    hkg-vector \
"

PR = "r1"
