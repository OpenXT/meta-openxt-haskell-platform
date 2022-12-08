DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cb903892d930c0f44a9ed9d706a544e4"

inherit hackage

SRC_URI[md5sum] = "1868eaf39e616176d898bcd5510e1f09"
SRC_URI[sha256sum] = "1ccb158b0f7851715d36b757c523b026ca1541e2030d02239802ba39b4112bc1"

DEPENDS_append = "\
    hkg-old-locale \
"

PR = "r1"
