package com.example.SLSpringStudentmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SlSpringStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SlSpringStudentApplication.class, args);
	}

}
