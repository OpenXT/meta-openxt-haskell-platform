DESCRIPTION = "A variety of alternative parser combinator libraries, including the original HuttonMeijer set. The Poly sets have features like good error reporting, arbitrary token type, running state, lazy parsing, and so on. Finally, Text.Parse is a proposed replacement for the standard Read class, for better deserialisation of Haskell values from Strings."
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=271beef410de4146a7e52374fbba02d3"

inherit hackage

SRC_URI[md5sum] = "6656b800ff52a842ca0fd8083bad2e7d"
SRC_URI[sha256sum] = "1c4c72980e1e5a4f07fea65ca08b2399581d2a6aa21eb1078f7ad286c279707b"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI += "\
    file://bump-supported-base-version.patch \
"

PR = "r1"
