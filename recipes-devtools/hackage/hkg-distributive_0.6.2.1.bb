DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d07e1e18c455f048ef0b3106ec3a8f3c"

inherit hackage

SRC_URI[md5sum] = "f4a48b3d918dec64cdabc3e6f1678ad0"
SRC_URI[sha256sum] = "d7351392e078f58caa46630a4b9c643e1e2e9dddee45848c5c8358e7b1316b91"

DEPENDS_append = "\
    hkg-base-orphans \
    hkg-tagged \
"

PR = "r1"
