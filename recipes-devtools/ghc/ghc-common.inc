DESCRIPTION = "The Glasgow Haskell Compiler."
HOMEPAGE = "https://www.haskell.org/ghc/download_ghc_8_10_7"
LICENSE = "GHCL"
SECTION = "devel/haskell"

DEPENDS += " \
    binutils \
"

S = "${WORKDIR}/ghc-${PV}"
