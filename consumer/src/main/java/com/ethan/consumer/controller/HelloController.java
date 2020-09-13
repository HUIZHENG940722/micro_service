package com.ethan.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: zheng
 * @Description: 欢迎服务器
 * @Date: 2020/9/13
 * @Version: 1.0
 */
@RestController
public class HelloController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/hello")
    public String sayHello() {
        return restTemplate.getForObject("http://127.0.0.1:8080/hello?name=tie", String.class);
    }
}
