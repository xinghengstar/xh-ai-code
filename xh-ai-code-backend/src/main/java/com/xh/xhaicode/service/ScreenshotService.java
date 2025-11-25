package com.xh.xhaicode.service;

/**
 * 截图服务
 */
public interface ScreenshotService {
    /**
     * 通用的截取服务，可以得到访问地址
     * @param webUrl 被截图的网址
     * @return 截图存储地址
     */
    String generateAndUploadScreenshot(String webUrl);
}
