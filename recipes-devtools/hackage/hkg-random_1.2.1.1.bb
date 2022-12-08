DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cb903892d930c0f44a9ed9d706a544e4"

inherit hackage

SRC_URI[md5sum] = "c54b311b1dad1e5eccfda09d0b63abcd"
SRC_URI[sha256sum] = "3e1272f7ed6a4d7bd1712b90143ec326fee9b225789222379fea20a9c90c9b76"

DEPENDS_append = "hkg-splitmix"

PR = "r1"
