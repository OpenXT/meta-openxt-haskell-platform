DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78dd98be72709820ee0098ba6a71a888"

inherit hackage

SRC_URI[md5sum] = "587603f94c56e0f38d3090fa1d45eb57"
SRC_URI[sha256sum] = "57856db93608a4d419f681b881c9b8d4448800d5a687587dc37e8a9e0b223584"

DEPENDS_append = "\
    hkg-th-compat \
"

PR = "r1"
