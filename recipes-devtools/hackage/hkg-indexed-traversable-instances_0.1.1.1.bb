DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d17cf045ce59697fc2ae811b58fb5f5f"

inherit hackage

SRC_URI[md5sum] = "cb6a9c30e3864e20f3c95b2c21872997"
SRC_URI[sha256sum] = "895ee5063d59e2b58930ca6fa54885bb11f19c8b7c7ba6c7b014f9431cdcc0b0"

DEPENDS_append = "\
    hkg-indexed-traversable \
    hkg-onetuple \
    hkg-tagged \
    hkg-unordered-containers \
    hkg-vector \
"

PR = "r1"
