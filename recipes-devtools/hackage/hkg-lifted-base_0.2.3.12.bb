DESCRIPTION = "Lifted-base exports IO operations from the base library lifted to any instance of MonadBase or MonadBaseControl."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=167e598e7d6aab2d167b4246f744a8bd"

inherit hackage

SRC_URI[md5sum] = "fc74e75a2d8ab5171f801ba80c86ab82"
SRC_URI[sha256sum] = "c134a95f56750aae806e38957bb03c59627cda16034af9e00a02b699474317c5"

DEPENDS += " \
    hkg-base-unicode-symbols \
    hkg-monad-control \
    hkg-transformers-base \
"

PR = "r1"
