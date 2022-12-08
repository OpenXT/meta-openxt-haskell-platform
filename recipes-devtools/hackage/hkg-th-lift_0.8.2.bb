DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://BSD3;md5=198185823509f45d2c499cbfb553caa0"

inherit hackage

SRC_URI[md5sum] = "74e7a3fc5f96d55eba07eb1daf905172"
SRC_URI[sha256sum] = "3a5927037a10ae63e605c02228c4027c32b7bab1985ae7b5379e6363b3cd5ce4"

DEPENDS_append = "\
    hkg-th-abstraction \
"

PR = "r1"
