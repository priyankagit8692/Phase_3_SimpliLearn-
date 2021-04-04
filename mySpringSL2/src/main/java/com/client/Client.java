package com.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.service.BankingService;

public class Client {

	public static void main(String[] args) {
		
       AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		BankingService bankingService =(BankingService)ctx.getBean("service");
		 
		 System.out.println(bankingService.service(2354));
		 
		ctx.close();

	}

}
