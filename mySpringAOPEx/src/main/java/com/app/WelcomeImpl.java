package com.app;

import org.springframework.stereotype.Component;

@Component(value ="welcome")
public class WelcomeImpl implements Welcome{

	@Override
	public String sayWelcome(String name) {
		// TODO Auto-generated method stub
		return "welc "+name;
	}

	@Override
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println("good morning:"+name);
		
	}

}
