package com.ethan.consumer.service;

import org.springframework.stereotype.Service;

/**
 * @Author: zheng
 * @Description: 欢迎服务类
 * @Date: 2020/9/13
 * @Version: 1.0
 */
@Service
public class HelloService {
    public String sayHello() {
        return "hello ";
    }
}
