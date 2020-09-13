package com.ethan.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: zheng
 * @Description: rest API 配置
 * @Date: 2020/9/13
 * @Version: 1.0
 */
@Configuration
public class RestTemplateConfig {
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
