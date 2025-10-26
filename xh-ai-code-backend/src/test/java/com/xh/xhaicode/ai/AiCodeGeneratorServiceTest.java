package com.xh.xhaicode.ai;

import com.xh.xhaicode.ai.model.HtmlCodeResult;
import com.xh.xhaicode.ai.model.MultiFileCodeResult;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AiCodeGeneratorServiceTest {
    @Resource
    private AiCodeGeneratorService aiCodeGeneratorService;

    @Test
    void generateHTMLCode() {
        HtmlCodeResult result = aiCodeGeneratorService.generateHTMLCode("请生成一个博客网站，不超过20行");
        Assertions.assertNotNull(result);
    }

    @Test
    void generateMultiFileCode() {
        MultiFileCodeResult result = aiCodeGeneratorService.generateMultiFileCode("请生成一个博客网站，不超过50行");
        Assertions.assertNotNull(result);
    }
}