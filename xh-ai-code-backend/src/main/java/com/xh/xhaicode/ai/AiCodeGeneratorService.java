package com.xh.xhaicode.ai;

import com.xh.xhaicode.ai.model.HtmlCodeResult;
import com.xh.xhaicode.ai.model.MultiFileCodeResult;
import dev.langchain4j.service.SystemMessage;
import reactor.core.publisher.Flux;

public interface AiCodeGeneratorService {
    /**
     * 生成 HTML 代码
     * @param userMessage 用户提示词
     * @return AI 的输出结果
     */
    @SystemMessage(value = "/prompt/codegen-html-system-prompt.txt")
    HtmlCodeResult generateHTMLCode(String userMessage);

    /**
     * 生成 多文件 代码
     * @param userMessage 用户提示词
     * @return AI 的输出结果
     */
    @SystemMessage(value = "/prompt/codegen-multi-file-system-prompt.txt")
    MultiFileCodeResult generateMultiFileCode(String userMessage);

    /**
     * 生成 HTML 代码
     * @param userMessage 用户提示词
     * @return AI 的输出结果
     */
    @SystemMessage(value = "/prompt/codegen-html-system-prompt.txt")
    Flux<String> generateHTMLCodeStream(String userMessage);

    /**
     * 生成 多文件 代码
     * @param userMessage 用户提示词
     * @return AI 的输出结果
     */
    @SystemMessage(value = "/prompt/codegen-multi-file-system-prompt.txt")
    Flux<String> generateMultiFileCodeStream(String userMessage);
}

