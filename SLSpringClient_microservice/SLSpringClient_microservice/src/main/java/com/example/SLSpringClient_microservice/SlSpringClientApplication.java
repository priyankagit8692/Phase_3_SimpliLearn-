package com.example.SLSpringClient_microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SlSpringClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SlSpringClientApplication.class, args);
	}

}
