DESCRIPTION = "The posix regex backend for regex-base."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5a9760d05990120048023e30741b4d71"

inherit hackage

SRC_URI[md5sum] = "94ad7a602666e6dce3aa3c86e5edfed7"
SRC_URI[sha256sum] = "c7827c391919227711e1cff0a762b1678fd8739f9c902fc183041ff34f59259c"

DEPENDS += "\
    hkg-regex-base \
"

RDEPENDS_${HPN} += "\
    libc6 \
"

PR = "r1"
