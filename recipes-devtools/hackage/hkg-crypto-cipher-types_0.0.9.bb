DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=82b3e215c1ce96685c1e8295e33b0bb1"

inherit hackage

SRC_URI[md5sum] = "8390e3298f007847210c0adfde2eafe9"
SRC_URI[sha256sum] = "2073f6b70df7916aebe2da49d224497183662d56d19da87b76f70039430c0a0f"

DEPENDS_append = "hkg-byteable hkg-securemem"

PR = "r1"
