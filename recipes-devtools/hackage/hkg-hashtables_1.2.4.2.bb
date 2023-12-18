DESCRIPTION = "This package provides a couple of different implementations of mutable hash tables in the ST monad, as well as a typeclass abstracting their common operations, and a set of wrappers to use the hash tables in the IO monad."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=98a00f9d3aa6556d4aa97ecbd31af0ba"

inherit hackage

SRC_URI[md5sum] = "77d0dffdb4109c92c823f79f9be9e302"
SRC_URI[sha256sum] = "a8e7220352500fdc90e80422c9fa3b47e1f7ad7f6f9da07f929fc7c5011470fc"

DEPENDS_append = " \
    hkg-vector \
    hkg-primitive \
    hkg-hashable \
"

PR = "r1"
