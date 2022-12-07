DESCRIPTION = "A logging framework for Haskell, roughly similar to Python's logging module."
LICENSE = "LGPL"
LIC_FILES_CHKSUM="file://LICENSE;md5=4caeb2dab378336aa0ab4f6af6a04617"

inherit hackage

SRC_URI[md5sum] = "4988eed9369f71dda1fba137f5476d9d"
SRC_URI[sha256sum] = "7f2364f6c0b9c5b85a257267a335816126ef2471c817a42797a5d3c57acaca5b"

DEPENDS += "\
    hkg-network \
    hkg-network-bsd \
    hkg-old-locale \
"

EXTRA_CABAL_CONF_append = "-fnetwork--gt-3_0_0"
