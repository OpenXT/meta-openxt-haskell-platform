DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1afd51745437e2440759a2a91d1ebe26"

inherit hackage

DEPENDS_append = "hkg-hashable hkg-integer-logarithms hkg-primitive"

SRC_URI[md5sum] = "a06f86fd0faae56f2b932a234fbc8a44"
SRC_URI[sha256sum] = "a3a121c4b3d68fb8b9f8c709ab012e48f090ed553609247a805ad070d6b343a9"

PR = "r1"
