DESCRIPTION = "This package provides a straightforward port of monadLib's BaseM typeclass to transformers."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=93e7d84c230d8f835ebffaa82a621e39"

inherit hackage

SRC_URI[md5sum] = "fd2f9c39ada88c75fc1710132d9628ce"
SRC_URI[sha256sum] = "323bf8689eb691b122661cffa41a25e00fea7a768433fe2dde35d3da7d32cf90"

DEPENDS += "\
    hkg-transformers-compat \
"

PR = "r1"
