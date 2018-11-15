package com.spring.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
@Slf4j
public class GatewayApplication {

	public static void main(String[] args) {
		log.info("===============GateWay start=========================");
		SpringApplication.run(GatewayApplication.class, args);
		log.info("===============GateWay end===========================");
	}
}
