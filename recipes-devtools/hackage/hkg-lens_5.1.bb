DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d17cf045ce59697fc2ae811b58fb5f5f"

inherit hackage

SRC_URI[md5sum] = "b86dab709b3791bb37b8a2fe49036f44"
SRC_URI[sha256sum] = "922021de1a995fe663b25b9821da4d83ce2ffe01b465e794c113e80db4e335bd"

DEPENDS_append = "\
    hkg-assoc \
    hkg-base-orphans \
    hkg-bifunctors \
    hkg-call-stack \
    hkg-comonad \
    hkg-contravariant \
    hkg-distributive \
    hkg-exceptions \
    hkg-free \
    hkg-hashable \
    hkg-indexed-traversable \
    hkg-indexed-traversable-instances \
    hkg-kan-extensions \
    hkg-parallel \
    hkg-profunctors \
    hkg-reflection \
    hkg-semigroupoids \
    hkg-strict \
    hkg-tagged \
    hkg-th-abstraction \
    hkg-these \
    hkg-transformers-compat \
    hkg-unordered-containers \
    hkg-vector \
"

PR = "r1"
