package com.client;

import com.app.welcomeImpl;
import com.service.CalculatorService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String args[]){
        AnnotationConfigApplicationContext ctx =  new AnnotationConfigApplicationContext(AppConfig.class);
        CalculatorService calculatorService =  (CalculatorService)ctx.getBean("service");
        welcomeImpl wi =(welcomeImpl)ctx.getBean("welcome");
        System.out.println(wi.sayWelcome(" pankaj"));
        System.out.println(wi.sayHello(" pk"));
        System.out.println(calculatorService.service(20));
        ctx.close();

    }
}
