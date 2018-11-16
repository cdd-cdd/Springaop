package com.able.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.able.spring.camera.accessories.Lens;

public class App {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Camera camera = context.getBean("camera", Camera.class);
		Lens lens = context.getBean("lens", Lens.class);
		
		camera.snap();
		camera.snap(100);
		camera.snap("able");
		camera.snapNighttime();
		lens.zoom(2);
		context.close();

	}

}
