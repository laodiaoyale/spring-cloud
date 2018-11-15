package com.spring.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zl
 * @CreateDate: 2018/10/17
 * @Description:
 **/
@RestController
public class UserController {

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public String home(){
        ServiceInstance serviceInstance = client.getLocalServiceInstance();
        return serviceInstance.getHost()+serviceInstance.getServiceId();
    }
}
