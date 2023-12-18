DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=665943ef0936d1f4cb25cc0f27a04fa8"

inherit hackage

SRC_URI[md5sum] = "c3e90102ffa1c79f6a96b62e473cdf09"
SRC_URI[sha256sum] = "98b220f3313d74227a4249210c8818e839678343e62b3ebb1b8c867cf2b974b7"

DEPENDS_append = "\
    hkg-hashable \
    hkg-split \
    hkg-unordered-containers \
    hkg-vector \
    hkg-vector-algorithms \
"

PR = "r1"
