DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=be052d1697f9a4e66303aa44f24294f3"

inherit hackage

SRC_URI[md5sum] = "d84fe712345d6b6b60a75fb70bbf6a19"
SRC_URI[sha256sum] = "b914dccc040caf1d8764b99df1028dad3e4fdf46c262192e54b59c9da66ead22"

DEPENDS_append = "\
    hkg-adjunctions \
    hkg-comonad \
    hkg-contravariant \
    hkg-distributive \
    hkg-free \
    hkg-invariant \
    hkg-profunctors \
    hkg-semigroupoids \
    hkg-tagged \
    hkg-transformers-compat \
"

PR = "r1"
