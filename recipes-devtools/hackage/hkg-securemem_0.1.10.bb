DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ba3b0b16d3b8da6530d162af42962ca"

inherit hackage

SRC_URI[md5sum] = "31af0f6c79d5d18dd09f4611683b91ff"
SRC_URI[sha256sum] = "32895a4748508da58207b4867266601af6259b7109af80bbf5d2e9e598e016a6"

DEPENDS_append = "hkg-byteable hkg-memory"

PR = "r1"
