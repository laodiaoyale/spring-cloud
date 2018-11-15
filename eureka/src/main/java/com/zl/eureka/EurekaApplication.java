package com.zl.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {
	private static Logger logger = LoggerFactory.getLogger(EurekaApplication.class);

	public static void main(String[] args) {
		logger.info("===============Spring Boot start=========================");
		SpringApplication.run(EurekaApplication.class, args);
		logger.info("===============Spring Boot end=========================");
	}
}
