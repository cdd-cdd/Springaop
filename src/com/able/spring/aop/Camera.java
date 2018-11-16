package com.able.spring.aop;

import org.springframework.stereotype.Component;

@Component
@Deprecated
public class Camera implements PhotoSnapper, ICamera {

	public Camera() {
		System.out.println("i am constructing an object");
	}
	
	/* (non-Javadoc)
	 * @see com.able.spring.aop.ICamera#snap()
	 */
	@Override
	public void snap() throws Exception{
		System.out.println("SNAP!");
		
		//throw new Exception("bye bye");
	}
	
	/* (non-Javadoc)
	 * @see com.able.spring.aop.ICamera#snap(int)
	 */
	@Override
	public void snap(int exposure) {
		System.out.println("SNAP Exposure :" + exposure);
	}
	
	/* (non-Javadoc)
	 * @see com.able.spring.aop.ICamera#snap(java.lang.String)
	 */
	@Override
	public String snap(String name) {
		System.out.println("SNAP! name :" + name);
		return name;
	}
	
	/* (non-Javadoc)
	 * @see com.able.spring.aop.ICamera#snapNighttime()
	 */
	@Override
	public void snapNighttime() {
		System.out.println("SNAP! night mode" );

	}
	
	public void snapCar(Car car) {
		System.out.println("Snapping a car");
	}
}
