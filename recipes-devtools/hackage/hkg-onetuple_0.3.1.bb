DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f88889c89aa512dca1603380237b6358"

inherit hackage

SRC_URI[md5sum] = "efa3a0fb0712f6560201331db8579faf"
SRC_URI[sha256sum] = "98853682d52fb4cc37a45cd186fbd77cf2565d3df5171acc4cf026427e103eef"

DEPENDS_append = "\
    hkg-base-orphans \
    hkg-hashable \
"

HPN = "OneTuple"
PR = "r1"
