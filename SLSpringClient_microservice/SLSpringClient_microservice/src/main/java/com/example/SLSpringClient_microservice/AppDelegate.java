package com.example.SLSpringClient_microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AppDelegate {
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Autowired
	RestTemplate restTemplate;
	
	public String callService(String schoolName) {
		String response = restTemplate.exchange("http://student-service/getStudent/{schoolName}", HttpMethod.GET
				, null, new ParameterizedTypeReference<String>() {
				},schoolName).getBody();
		return schoolName+" "+response;
	}
	
	public String callService1(String routes) {
		String response = restTemplate.exchange("http://localhost:8088/loadroutes/{routes}",HttpMethod.GET
				, null, new ParameterizedTypeReference<String>() {
				},routes).getBody();
		return routes+" "+response;
	}

}
