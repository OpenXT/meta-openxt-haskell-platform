DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9fa0ccb0991fbfe8846c027a053d8cd8"

inherit hackage

SRC_URI[md5sum] = "238bd8d349b2353da531b211c1307197"
SRC_URI[sha256sum] = "dff6abc08ad637e51891bb8b475778c40926c51219eda60fd64f0d9680226241"

DEPENDS_append = "\
    hkg-assoc \
    hkg-hashable \
    hkg-these \
"

PR = "r1"
