DESCRIPTION = "This package defines the type class MonadBaseControl, a subset of MonadBase into which generic control operations such as catch can be lifted from IO or any other base monad. Instances are based on monad transformers in MonadTransControl, which includes all standard monad transformers in the transformers library except ContT."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=67634a94867d2b4cea9192052bca1335"

inherit hackage

SRC_URI[md5sum] = "e83415701b1e9c6d5aa1e937c6de32ae"
SRC_URI[sha256sum] = "ae0baea04d99375ef788140367179994a7178d400a8ce0d9026846546772713c"

DEPENDS += " \
    hkg-base-unicode-symbols \
    hkg-transformers-base \
"

PR = "r1"
