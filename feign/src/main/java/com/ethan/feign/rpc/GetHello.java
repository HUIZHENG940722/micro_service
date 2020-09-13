package com.ethan.feign.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: zheng
 * @Description:
 * @Date: 2020/9/13
 * @Version: 1.0
 */
@FeignClient(value = "consumer")
public interface GetHello {
    @RequestMapping(value = "/consumer/hello", method = RequestMethod.GET)
    public String sayHello();
}
