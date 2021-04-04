package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mainApp")
public class MainApp {
	
	@Autowired
	private AppDelegate appDel;
	
	@GetMapping("/loadStudent/{schoolName}")
	public String loadStudent(@PathVariable("schoolName") String schoolName) {
		return appDel.callService(schoolName);
		
	}
	@GetMapping("/loadTransport/{routes}")
	public String loadTransport(@PathVariable("routes") String routes) {
		return appDel.callService1(routes);
		
	}

}
