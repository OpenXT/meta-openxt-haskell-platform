DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=19995a119336e4d109f10b27898fe699"

inherit hackage

SRC_URI[md5sum] = "36800157d23a5588ba574b2c62bda9ed"
SRC_URI[sha256sum] = "65955d7b50525a4a3bccdab1d982d2ae342897fd38140d5a94b5ef3800d8c92a"

DEPENDS_append = "\
    hkg-base-orphans \
    hkg-bifunctors \
    hkg-comonad \
    hkg-contravariant \
    hkg-distributive \
    hkg-tagged \
"

PR = "r1"
