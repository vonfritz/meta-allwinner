DESCRIPTION = "Video Decode and Presentation API for Unix (libraries)"

PR = "1"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=83af8811a28727a13f04132cc33b7f58"
DEPENDS += "virtual/libx11 libxext"
SRC_URI = "http://people.freedesktop.org/~aplattner/vdpau/libvdpau-${PV}.tar.gz"

SRC_URI[md5sum] = "cb81b0c3b7d32b2b2a51894ef05b95ce"
SRC_URI[sha256sum] = "24dc08467ce8c59d6cfbf0d34d2dd1f86b4ff62e90777e0a8f513c5c9de9bce0"

inherit autotools

S = "${WORKDIR}/${PN}-${PV}"

FILES_${PN}-dev += "/usr/lib/vdpau/*"
FILES_${PN}-dbg += "/usr/lib/vdpau/.debug"

