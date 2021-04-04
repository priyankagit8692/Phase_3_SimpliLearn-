package com.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.app.WelcomeImpl;

public class Client {

	public static void main(String[] args) {
		

		 AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		 WelcomeImpl welcomeImpl = (WelcomeImpl)ctx.getBean("welcome");
		 System.out.println(welcomeImpl.sayWelcome("Priyanka"));
		 welcomeImpl.sayHello("priya");
		 ctx.close();

	}

}
