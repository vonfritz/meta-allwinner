PREFERRED_PROVIDER_virtual/xserver = "xserver-xorg"
XSERVER = "xserver-xorg \
           xf86-video-fbturbo \
           xf86-input-evdev \
           xf86-input-mouse \
           xf86-input-keyboard"

PREFERRED_PROVIDER_virtual/kernel = "linux-sunxi"
PREFERRED_VERSION_linux-libc-headers = "3.4.75"

KERNEL_IMAGETYPE = "uImage"

UBOOT_ENTRYPOINT = "0x40008000"
UBOOT_LOADADDRESS = "0x40008000"

SERIAL_CONSOLE = "115200 ttyS0"

IMAGE_CLASSES += "sdcard_image-sunxi"
IMAGE_FSTYPES += "ext3 tar.gz sunxi-sdimg"
