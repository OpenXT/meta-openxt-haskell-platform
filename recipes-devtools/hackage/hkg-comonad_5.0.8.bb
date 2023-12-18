DESCRIPTION = "Comonads."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=21de4606c146e14c8ca6e65ae2ef3ccf"

inherit hackage

SRC_URI[md5sum] = "efeead553b0b007a5d256f3a054953dd"
SRC_URI[sha256sum] = "ef6cdf2cc292cc43ee6aa96c581b235fdea8ab44a0bffb24dc79ae2b2ef33d13"

DEPENDS += " \
    hkg-distributive \
    hkg-indexed-traversable \
    hkg-semigroups \
    hkg-tagged \
    hkg-transformers-compat \
"

PR = "r1"
