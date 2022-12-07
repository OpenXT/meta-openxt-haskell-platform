DESCRIPTION = "Provides a wide array of (semi)groupoids and operations for working with them."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a38bfee1357b68d214d9aab35f38aa98"

inherit hackage

SRC_URI[md5sum] = "ad1cb3d716db7bc180dfde60babedb5d"
SRC_URI[sha256sum] = "6d45cdb6c58c75ca588859b80b2c92b6f48590a03e065c24ce5d767a6a963799"

DEPENDS += " \
    hkg-base-orphans \
    hkg-bifunctors \
    hkg-comonad \
    hkg-contravariant \
    hkg-distributive \
    hkg-hashable \
    hkg-semigroups \
    hkg-unordered-containers \
"

PR = "r1"
