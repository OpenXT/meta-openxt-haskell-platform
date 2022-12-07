DESCRIPTION = "This library encourages an error-handling style that directly uses the type system, rather than out-of-band exceptions."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f2c465dc64718d1b4a7e98fc58603417"

inherit hackage

SRC_URI[md5sum] = "43bec23a661dd4a5eefb5549b4fad8a8"
SRC_URI[sha256sum] = "6772e5689f07e82077ffe3339bc672934d83d83a97a7d4f1349de1302cb71f75"

DEPENDS += " \
    hkg-either \
    hkg-safe \
    hkg-transformers-compat \
"

PR = "r1"
