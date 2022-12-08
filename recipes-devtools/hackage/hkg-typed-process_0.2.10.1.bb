DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9eacb1d6c7ea8be0f8c4fdadde9546d0"

inherit hackage

SRC_URI[md5sum] = "721e0211271d72032cd8cb63af2ec4d1"
SRC_URI[sha256sum] = "e436875ccd6664d4111e601c8e2ec6ba9473979eac49b23a1bdb88f80e95099e"

DEPENDS_append = "\
    hkg-async \
    hkg-unliftio-core \
"

PR = "r1"
