package com.xh.xhaicode;

import dev.langchain4j.community.store.embedding.redis.spring.RedisEmbeddingStoreAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {RedisEmbeddingStoreAutoConfiguration.class})
@MapperScan("com.xh.xhaicode.mapper")
public class XhAiCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(XhAiCodeApplication.class, args);
    }

}
