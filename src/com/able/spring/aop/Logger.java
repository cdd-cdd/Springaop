package com.able.spring.aop;

import org.aspectj.lang.JoinPoint;
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
	
/*	@Pointcut("within(@Deprecated com.able.spring..*)")
	public void somePointcut() {
		
	}

	@Before("somePointcut()")
	public void somePointcutDemo() {
		System.out.println("**************Before demo ...");
	}*/
	
/*	@Pointcut("within(@org.springframework.stereotype.Component com.able.spring..*)")
	public void somePointcut() {
		
	}

	@Before("somePointcut()")
	public void somePointcutDemo() {
		System.out.println("**************Before demo ...");
	}*/
	
/*	@Pointcut("@target(org.springframework.stereotype.Component)")
	public void somePointcut() {
		
	}

	@Before("somePointcut()")
	public void somePointcutDemo() {
		System.out.println("**************Before demo ...");
	}*/
	
/*	@Pointcut("@args(org.springframework.stereotype.Component)")
	public void somePointcut() {
		
	}
	
	@Before("somePointcut()")
	public void somePointcutDemo() {
		System.out.println("**************Before demo ...");
	}*/
	
/*	@Pointcut("@args(java.lang.Deprecated)")
	public void somePointcut() {
		
	}
	
	@Before("somePointcut()")
	public void somePointcutDemo() {
		System.out.println("**************Before demo ...");
	}*/
	
/*	@Pointcut("bean(c*)")
	public void somePointcut() {
		
	}
	
	@Before("somePointcut()")
	public void somePointcutDemo() {
		System.out.println("**************Before demo ...");
	}*/
	
	
	//********************************************************************************
/*	@Pointcut("args(..)")
	public void somePointcut() {
		
	}
	
	@Before("somePointcut()")
	public void somePointcutDemo() {
		System.out.println("**************Before demo ...");
	}*/
	
	//******************************************************************************
	@Pointcut("args(..)")
	public void somePointcut() {
		
	}
	
	@Before("somePointcut()")
	public void somePointcutDemo(JoinPoint jp) {
		System.out.println("**************Before demo ...");
		
		for (Object obj : jp.getArgs()) {
			System.out.println("ARG:" + obj);
			
		}
	}
	



	
}
