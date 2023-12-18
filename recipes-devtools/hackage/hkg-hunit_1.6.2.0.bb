DESCRIPTION = "HUnit is a unit testing framework for Haskell, inspired by the JUnit tool for Java, see: http://www.junit.org."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4d036bff24e7f9e1a7a9012fbe91bb35"

HPN = "HUnit"
inherit hackage

SRC_URI[md5sum] = "89ddb98aa4d2ff5e15456b2ad38bdf27"
SRC_URI[sha256sum] = "b0b7538871ffc058486fc00740886d2f3172f8fa6869936bfe83a5e10bd744ab"

DEPENDS_append = "\
    hkg-call-stack \
"

PR = "r1"

RDEPENDS_${HPN} += "libc6"
