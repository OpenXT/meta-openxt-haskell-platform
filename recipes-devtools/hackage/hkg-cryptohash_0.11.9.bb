DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=38235ba18366f4bf93b5d86e58fc6b0c"

inherit hackage

SRC_URI[md5sum] = "93b11e5a525d53dd30b153d2ec96adea"
SRC_URI[sha256sum] = "c28f847fc1fcd65b6eea2e74a100300af940919f04bb21d391f6a773968f22fb"

DEPENDS_append = "hkg-byteable hkg-cryptonite hkg-memory"

PR = "r1"
