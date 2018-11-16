package com.able.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

	@Pointcut("execution(* com.able.spring.aop.Camera.*(..))")
	public void cameraSnap() {
		
	}
	
	@Pointcut("execution(* *.*(..))")
	public void cameraRelatedAction() {
		
	}
	
	@Pointcut("execution(String com.able.spring.aop.Camera.snap(String))")
	public void withNameCameraSnap() {
		
	}
	
	@Before("cameraSnap()")
	public void aboutToTakePhoto() {
		System.out.println("About to take photo....you can see me everywhere when you snap");
	}
	
	@Before("withNameCameraSnap()")
	public void withNameAboutToTakePhoto() {
		System.out.println("About to take photo....i have a name");
	}
	
	@Before("cameraRelatedAction()")
	public void aboutTodoCameraRelatedAction() {
		System.out.println("Doing something related to camera");
	}
	
}
