DESCRIPTION = "This library provides a wrapper to the Linux Kernel's inotify feature, allowing applications to subscribe to notifications when a file is accessed or modified."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=842154b7fc56299acd68b1fe3fcd79b2"

inherit hackage

SRC_URI[md5sum] = "1cd88d5f8fa7faab369a3a6f2ba72172"
SRC_URI[sha256sum] = "1307b100aeaf35d0d0f582d4897fac9cde39505ec52c915e213118e56674f81a"

DEPENDS_append = "\
    hkg-async \
"

PR = "r1"
