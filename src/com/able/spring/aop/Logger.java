package com.able.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

	//this one matching nothing
	//@Pointcut("within(com.able.spring..*)")
	
	@Pointcut("within(com.able.spring..*)")
	public void withinDemo() {
		
	}
	
	//this work as well
	@Pointcut("target(com.able.spring.aop.ICamera)")
	//@Pointcut("target(com.able.spring.aop.Camera)")
	public void targetDemo() {
		
	}
	
	@Pointcut("this(com.able.spring.aop.ICamera)")
	public void thisDemo() {
		
	}

	@Before("withinDemo()")
	public void withinDemoAdvice() {
		System.out.println("**************Before advice ...");
	}
	
	@Before("targetDemo()")
	public void targetDemoAdvice() {
		System.out.println("**************Target advice ...");
	}
	
	@Before("targetDemo()")
	public void thisDemoAdvice() {
		System.out.println("**************This advice ...");
	}
	


	
}
