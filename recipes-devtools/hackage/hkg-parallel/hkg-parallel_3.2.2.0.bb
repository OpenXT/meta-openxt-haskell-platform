DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ce23b010a8a26c4008139277939859fd"

inherit hackage

SRC_URI[md5sum] = "015e0adb3a9aebd73a1f69e22ddbb4d0"
SRC_URI[sha256sum] = "170453a71a2a8b31cca63125533f7771d7debeb639700bdabdd779c34d8a6ef6"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI += "\
    file://bump-supported-base-version.patch \
"

PR = "r1"
