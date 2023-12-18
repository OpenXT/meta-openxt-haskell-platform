DESCRIPTION = "This package provides a pure interface for compressing and decompressing streams of data represented as lazy ByteStrings. It uses the zlib C library so it has high performance. It supports the zlib, gzip and raw compression formats."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7e081d48c1353e9bd967a267406b0e65"

inherit hackage

SRC_URI[md5sum] = "de5a05f8b26b7d7ba62b981a5bd7fc9c"
SRC_URI[sha256sum] = "9eaa989ad4534438b5beb51c1d3a4c8f6a088fdff0b259a5394fbf39aaee04da"

INSANE_SKIP_${PN} = "file-rdeps"

PR = "r1"
