DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=323cf7ab22ce7915c87d2a7a25bc025c"

inherit hackage

SRC_URI[md5sum] = "ed4d41a944f677dbd47ea84e56bb5f3d"
SRC_URI[sha256sum] = "56099c8a8aa01d2ee914b670c97c1f818186dbb886e2025b73d9c2afe3496b1d"

DEPENDS_append = "\
    hkg-basement \
    hkg-memory \
"

PR = "r1"
