package com.ethan.feign.controller;

import com.ethan.feign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zheng
 * @Description: 欢迎控制类
 * @Date: 2020/9/13
 * @Version: 1.0
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/feign", method = RequestMethod.GET)
    public String sayHello() {
        return helloService.sayHello();
    }
}
