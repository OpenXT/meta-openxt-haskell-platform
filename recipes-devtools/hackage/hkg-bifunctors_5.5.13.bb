DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=89de2f52941a4bc8f5e2156db40f03e2"

inherit hackage

SRC_URI[md5sum] = "57c47d4bb236a6cbdf863c2082631fef"
SRC_URI[sha256sum] = "26cc27ade3796cf03bd680f98ebb7b8c0d7fd1b67c1894dc3635f734fba7dbd7"

DEPENDS_append = "\
    hkg-base-orphans \
    hkg-comonad \
    hkg-th-abstraction \
"

PR = "r1"
