package com.spring.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: zl
 * @CreateDate: 2018/11/12
 * @Description:
 **/
@RestController
public class ConsummerController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public String helloConsummer(){
        return restTemplate.getForEntity("http://hello-service/info",String.class).getBody();
    }
}
