package com.able.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Camera implements PhotoSnapper{

	public Camera() {
		System.out.println("i am constructing an object");
	}
	
	public void snap() throws Exception{
		System.out.println("SNAP!");
		
		//throw new Exception("bye bye");
	}
	
	public void snap(int exposure) {
		System.out.println("SNAP Exposure :" + exposure);
	}
	
	public String snap(String name) {
		System.out.println("SNAP! name :" + name);
		return name;
	}
	
	public void snapNighttime() {
		System.out.println("SNAP! night mode" );

	}
}
