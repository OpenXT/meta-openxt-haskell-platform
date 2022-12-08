DESCRIPTION = ""
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ae0a278b24dee77c6906f7c6b5a62f80"

inherit hackage

SRC_URI[md5sum] = "74c953320cbee83963e178f07d8d7689"
SRC_URI[sha256sum] = "d3b171895698c73da24d7ce97543f725d26637f038de670c0fd4012ca7f95015"

# NOTE: we should really try to deprecate this. it's very old.

DEPENDS_append = "hkg-crypto-cipher-types hkg-securemem"

PR = "r1"
