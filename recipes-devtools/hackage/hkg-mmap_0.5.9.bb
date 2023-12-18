DESCRIPTION = "This library provides a wrapper to mmap(2) or MapViewOfFile, allowing files or devices to be lazily loaded into memory as strict or lazy ByteStrings, ForeignPtrs or plain Ptrs, using the virtual memory subsystem to do on-demand loading."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1b6f78c0dc98ecf779025d3732ac47c3"

inherit hackage

SRC_URI[md5sum] = "625301d54b9789e890174e38028c1bcb"
SRC_URI[sha256sum] = "58fcbb04e1cb8e7c36c05823b02dce2faaa989c53d745a7f36192de2fc98b5f8"

PR = "r1"
