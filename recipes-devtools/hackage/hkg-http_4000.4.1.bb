DESCRIPTION = "Client-side HTTP programming in Haskell."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2fe1d0bfa58831545194143fe4ebfac0"

HPN = "HTTP"
inherit hackage

SRC_URI[md5sum] = "0449df43290925a1cfcbdb863a44d99d"
SRC_URI[sha256sum] = "df31d8efec775124dab856d7177ddcba31be9f9e0836ebdab03d94392f2dd453"

DEPENDS += " \
    hkg-network \
    hkg-network-uri \
"

PR = "r1"
