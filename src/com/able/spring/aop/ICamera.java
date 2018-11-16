package com.able.spring.aop;

public interface ICamera {

	void snap() throws Exception;

	void snap(int exposure);

	String snap(String name);

	void snapNighttime();

	void snapCar(Car car);

}