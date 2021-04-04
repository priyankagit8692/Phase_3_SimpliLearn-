package com.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
 
	@Before("execution(* com.app.WelcomeImpl.sayWelcome(..))") // point cut (when these methods are invoked they are automatically invoked)
	public void callBefore() {
		System.out.println("call it before");
	}
	
	@After("execution(* com.app.WelcomeImpl.sayHello(..))")
	public void callAfter() {
		System.out.println("call it after");
	}
	
	@Before("execution(* com.app.WelcomeImpl.sayHello(..))")
	public void callBefore2() {
		System.out.println("call it before");
	}
	
}
