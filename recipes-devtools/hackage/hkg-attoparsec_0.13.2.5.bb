DESCRIPTION = "A fast parser combinator library, aimed particularly at dealing efficiently with network protocols and complicated text/binary file formats."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=842154b7fc56299acd68b1fe3fcd79b2"

inherit hackage

SRC_URI[md5sum] = "6b0a5588aa7f529cff18ddb6e0a331f3"
SRC_URI[sha256sum] = "21e0f38eaa1957bf471276afa17651c125a38924575f12c2cbd2fa534b45686f"

DEPENDS_append = "\
    hkg-scientific \
"

PR = "r1"
