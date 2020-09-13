package com.ethan.feign.service;

import com.ethan.feign.rpc.GetHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zheng
 * @Description:
 * @Date: 2020/9/13
 * @Version: 1.0
 */
@Service
public class HelloService {
    @Autowired
    private GetHello getHello;

    public String sayHello() {
        return getHello.sayHello();
    }
}
