DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f058b31ee036b2c2174433412c9a7d65"

inherit hackage

SRC_URI[md5sum] = "8e3fb44334194b9f6287d11a4132131e"
SRC_URI[sha256sum] = "12dea4ff94dd475d4249e93abb385d9c0399c13e3cb3f4132d316e0b32700e72"

DEPENDS_append = "\
    hkg-bifunctors \
    hkg-comonad \
    hkg-distributive \
    hkg-exceptions \
    hkg-indexed-traversable \
    hkg-profunctors \
    hkg-semigroupoids \
    hkg-semigroups \
    hkg-th-abstraction \
    hkg-transformers-base \
    hkg-transformers-compat \
"

PR = "r1"
