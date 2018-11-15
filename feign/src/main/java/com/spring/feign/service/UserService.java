package com.spring.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: zl
 * @CreateDate: 2018/10/18
 * @Description:
 **/
@FeignClient(value = "user")
public interface UserService {

    @RequestMapping(value = "/info")
    String getUser();
}
