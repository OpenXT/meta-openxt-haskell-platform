DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78956766af36a65e7fb72803ee27b507"

inherit hackage

SRC_URI[md5sum] = "a1b7997875d18d26b13de20aa032e2ec"
SRC_URI[sha256sum] = "60503f42546c6c1b954014d188ea137e43d74dcffd2bf6157c113fd91a0c394c"

DEPENDS_append = "\
    hkg-blaze-builder \
    hkg-blaze-markup \
"

PR = "r1"
