package com.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Before("execution(* com.app.welcomeImpl.sayWelcome(..))")
    public void callBefore(){
        System.out.println("Call it before");
    }
       
    @After("execution(* com.app.welcomeImpl.sayHello(..))")
    public void callAfter(){
        System.out.println("Call it after");
    }
 
    @Before("execution(* com.service.CalculatorService.service(..))")
    public void callBeforeService(){
        System.out.println("Before service");
    }

    @After("execution(* com.service.CalculatorService.service(..))")
    public void callAfterService(){
        System.out.println("After service");
    }
}
