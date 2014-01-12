DEPENDS += "libvdpau libvdpau-sunxi"

PRINC := "${@int(PRINC) + 1}"

EXTRA_OECONF += "--enable-vdpau"
