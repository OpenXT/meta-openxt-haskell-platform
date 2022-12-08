DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e9f8d3f87866b04e973a51b26d3ce825"

inherit hackage

SRC_URI[md5sum] = "7d811e6b76d70de37bc93b089c4de921"
SRC_URI[sha256sum] = "147b5f8db810bca0ea8952ef974982ffc447cecd21f01e1ea1121df77e276518"

DEPENDS_append = "\
    hkg-comonad \
    hkg-contravariant \
    hkg-distributive \
    hkg-free \
    hkg-profunctors \
    hkg-semigroupoids \
    hkg-semigroups \
    hkg-tagged \
    hkg-transformers-compat \
    hkg-void \
"

PR = "r1"
