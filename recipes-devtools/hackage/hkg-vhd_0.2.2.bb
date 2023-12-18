DESCRIPTION = "Provides functions to inspect and manipulate virtual hard disk (VHD) files, according to the VHD specification (version 1.0)."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENCE;md5=cc8224b3041a54c20bd7becce249bb02"

EXTRA_CABAL_CONF += "--flag=executable"

inherit hackage

SRC_URI[md5sum] = "693b3f5e3af835a29f411741af3e9e7e"
SRC_URI[sha256sum] = "7c678f076395f44d853f87a4538635bc83d7a10319933dec9e06b40ce409ea7c"
DEPENDS += " \
    hkg-byteable \
    hkg-cipher-aes \
    hkg-cryptohash \
    hkg-random \
    hkg-mmap \
    hkg-storable-endian \
    hkg-cereal \
"
