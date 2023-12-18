DESCRIPTION = "Contravariant functors."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7d61d6ba3edb07f32ff749898db116c0"

inherit hackage

SRC_URI[md5sum] = "ee2c73fa9a2a280303a43fe70689906f"
SRC_URI[sha256sum] = "062fd66580d7aad0b5ba93e644ffa7feee69276ef50f20d4ed9f1deb7642dffa"

DEPENDS_append = "\
    hkg-statevar \
"

PR = "r1"
