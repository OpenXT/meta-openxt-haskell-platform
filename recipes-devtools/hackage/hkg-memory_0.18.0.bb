DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=77e55efa324ce0d09f20abf7737d08eb"

inherit hackage

SRC_URI[md5sum] = "0859f1ab5a7c0ff09d0e791b5528f275"
SRC_URI[sha256sum] = "fd4eb6f638e24b81b4e6cdd68772a531726f2f67686c8969d3407d82f7862e3e"

DEPENDS_append = "hkg-basement"

PR = "r1"
