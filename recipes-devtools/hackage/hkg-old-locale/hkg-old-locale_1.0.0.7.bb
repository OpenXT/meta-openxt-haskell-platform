DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cb903892d930c0f44a9ed9d706a544e4"

inherit hackage

SRC_URI[md5sum] = "507bd2d3ce2407403e2a2d1136c3d149"
SRC_URI[sha256sum] = "dbaf8bf6b888fb98845705079296a23c3f40ee2f449df7312f7f7f1de18d7b50"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI += "\
    file://bump-supported-base-version.patch \
"

PR = "r1"
