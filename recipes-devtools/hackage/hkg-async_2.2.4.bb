DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ea4d1c46e8600f4e1d226415039a868"

inherit hackage

SRC_URI[md5sum] = "ab045e22a02b07d8806086053c9a7fe0"
SRC_URI[sha256sum] = "484df85be0e76c4fed9376451e48e1d0c6e97952ce79735b72d54297e7e0a725"

DEPENDS_append = "hkg-hashable hkg-scientific"

PR = "r1"
