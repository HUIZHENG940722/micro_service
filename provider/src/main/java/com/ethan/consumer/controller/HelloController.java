package com.ethan.consumer.controller;

import com.ethan.consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zheng
 * @Description: 欢迎控制器
 * @Date: 2020/9/13
 * @Version: 1.0
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hello")
    public String sayHello(@RequestParam("name") String name) {
        return helloService.sayHello() + name;
    }
}
