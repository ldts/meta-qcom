DESCRIPTION = "QCOM Firmware for Google Pixel 2 / 2XL"

FW_QCOM_NAME = "walleye"
FW_QCOM_SUBDIR = "msm8998/Google/${FW_QCOM_NAME}"
EXTRA_DEVICE_SUBDIR = "msm8998/Google/taimen"
AOSP_BUILD = "rp1a.201005.004.a1"
CHECKSUM_vendor = "2fdea26a"

SRC_URI[vendor.sha256sum] = "4ec6cf5dfd6616ae39cf61f95657662e4b17dd193b6ab30547ef016359cfc118"

require firmware-qcom-pixel.inc
