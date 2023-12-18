DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7bd5b9bd1eb743b2fef83af75de60046"

inherit hackage

SRC_URI[md5sum] = "5ac0edb289ccb830ab5060c3f4c58654"
SRC_URI[sha256sum] = "d8988dc6e8718c7a3456515b769c9336aeeec730cf86fc5175247969ff8f144f"

DEPENDS_append = "\
    hkg-bifunctors \
    hkg-tagged \
"

PR = "r1"
