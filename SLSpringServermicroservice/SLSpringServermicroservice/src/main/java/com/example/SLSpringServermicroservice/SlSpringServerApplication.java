package com.example.SLSpringServermicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SlSpringServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SlSpringServerApplication.class, args);
	}

}
