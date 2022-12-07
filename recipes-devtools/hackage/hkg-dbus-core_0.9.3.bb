DESCRIPTION = "DBus core bindings (obsolete)."
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://License.txt;md5=d32239bcb673463ab874e80d47fae504"

inherit hackage

SRC_URI[md5sum] = "f635e99147a6ef7b1fa3212c6767fa83"
SRC_URI[sha256sum] = "6da338e54d1cd4bcfbbc12bf6af08f7e90b420cb809f59e8aa94451cd17e08d1"

DEPENDS += " \
    hkg-data-binary-ieee754 \
    hkg-haxml \
    hkg-network \
"

PR = "r1"
