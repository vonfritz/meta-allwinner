DESCRIPTION = "Experimental VDPAU for Allwinner sunxi SoCs"

PR = "1"

LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://decoder.c;beginline=1;endline=18;md5=d272116b63ed2796aab264c467da62b1"
DEPENDS = "libvdpau"
SRC_URI = "git://github.com/linux-sunxi/libvdpau-sunxi.git;protocol=http;branch=master"

SRCREV_pn-${PN} = "bf1e9fb48f8b68ecb7662c5a28ad78dc964c5b44"
S = "${WORKDIR}/git"

FILES_${PN} = "${libdir}/*"

do_install () {
install -d ${D}${libdir}
        oe_libinstall -s libvdpau_sunxi ${D}${libdir}
}

