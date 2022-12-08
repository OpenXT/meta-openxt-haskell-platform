DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a334afc29ca5fa43de3ec039a04dca8b"

inherit hackage

SRC_URI[md5sum] = "e7d1d7e50b6aa2a3dcc081511433dbc8"
SRC_URI[sha256sum] = "baaad82cd4271b197016bdbe76f22d5c3d3913fe38534cec7d817db9bae19886"

DEPENDS_append = "\
    hkg-base-orphans \
"

PR = "r1"
