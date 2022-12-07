DESCRIPTION = "Regex library for GHC"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM="file://LICENSE;md5=5a9760d05990120048023e30741b4d71"

inherit hackage

DEPENDS += "\
    hkg-regex-posix \
"

SRC_URI[md5sum] = "2327d830ab0fc1938cf6643fac245d00"
SRC_URI[sha256sum] = "8f7b386c72fd605a292edfb809b8620245b4a3ab7af192ad79e36778596e7947"
