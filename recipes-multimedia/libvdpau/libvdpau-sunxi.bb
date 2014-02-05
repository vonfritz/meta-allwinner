DESCRIPTION = "Experimental VDPAU for Allwinner sunxi SoCs"

PR = "2"

LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://decoder.c;beginline=1;endline=18;md5=d272116b63ed2796aab264c467da62b1"
DEPENDS = "libvdpau"
SRC_URI = "git://github.com/linux-sunxi/libvdpau-sunxi.git;protocol=http;branch=master"

SRCREV_pn-${PN} = "e6b5f5976419b3b99e270ed4ab595dcbf4eae0c8"
S = "${WORKDIR}/git"

FILES_${PN} = "${libdir}/*"

do_install () {
install -d ${D}${libdir}
        oe_libinstall -s libvdpau_sunxi ${D}${libdir}
}

