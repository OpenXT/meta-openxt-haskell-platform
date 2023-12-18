DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=14a7e9bd37e696aeee45eb5031410691"

inherit hackage

SRC_URI[md5sum] = "c0d5e28f401241b73789dd8b75791d42"
SRC_URI[sha256sum] = "919f0d1297ea2f5373118553c1df2a9405d8b9e31a8307e829da67d4953c299a"

FILESEXTRAPATHS_prepend := "${THISDIR}/patches:"
SRC_URI += "\
    file://bump-supported-base-version.patch \
"

PR = "r1"
