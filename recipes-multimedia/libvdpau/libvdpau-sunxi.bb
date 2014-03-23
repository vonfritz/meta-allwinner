DESCRIPTION = "Experimental VDPAU for Allwinner sunxi SoCs"

PR = "3"

LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://decoder.c;beginline=1;endline=18;md5=d272116b63ed2796aab264c467da62b1"
DEPENDS = "libvdpau"
SRC_URI = "git://github.com/linux-sunxi/libvdpau-sunxi.git;protocol=http;branch=wip/osd-performance \
           file://0001-add-link-to-X11-lib-in-Makefile.patch \
          "

SRCREV_pn-${PN} = "28c8482c2fb3d707400ee30c7cc7ba4adf541d62"
S = "${WORKDIR}/git"

FILES_${PN} = "${libdir}/*"

do_install () {
install -d ${D}${libdir}
        oe_libinstall -s libvdpau_sunxi ${D}${libdir}
}
