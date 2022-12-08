DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78956766af36a65e7fb72803ee27b507"

inherit hackage

SRC_URI[md5sum] = "c77409e818921e2892a756b8c621cb54"
SRC_URI[sha256sum] = "43fc3f6872dc8d1be8d0fe091bd4775139b42179987f33d6490a7c5f1e07a349"

DEPENDS_append = "\
    hkg-blaze-builder \
"

PR = "r1"
