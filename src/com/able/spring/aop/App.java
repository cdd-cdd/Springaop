package com.able.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.able.spring.camera.accessories.Lens;

public class App {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		/*Object obj = context.getBean("camera" );
		System.out.println("Class of camera bean :" + obj.getClass());
		System.out.println(obj instanceof Camera);*/
		
		Camera camera = context.getBean("camera", Camera.class);
		
		Car car = context.getBean("car", Car.class);
		 car.start();
		
		try {
			camera.snap();
			camera.snap(1000);
			camera.snap("what");
			camera.snapNighttime(); 
		} catch (Exception e) {
			System.out.println("Cought exception :" + e.getMessage());
		}
		context.close();

	}

}
