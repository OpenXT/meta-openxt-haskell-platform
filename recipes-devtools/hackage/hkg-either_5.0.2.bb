DESCRIPTION = "An either monad transformer."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e7c2b0270cbb855f29a4baff6b62fc13"

inherit hackage

SRC_URI[md5sum] = "908c545cb89344dcc530cd11ddb37cb7"
SRC_URI[sha256sum] = "bfa45b967fd77b1c7c952e156377441e3c42b6dc873ab1f06a7421a3222287be"

DEPENDS += " \
    hkg-bifunctors \
    hkg-exceptions \
    hkg-profunctors \
    hkg-semigroupoids \
    hkg-transformers-compat \
"

PR = "r1"
