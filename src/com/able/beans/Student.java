package com.able.beans;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Student {

	private String firstname = "robot";
	private String lastname = "robot";
	private Book book;
	
	public static Student getInstance(String firstname, String lastname) {
		System.out.println("We are using the factory method");
		return new Student(firstname, lastname);
	}
	
	public void onCreate() {
		System.out.println("Student have been created:" + this);
	}
	
	public void onDestroy() {
		System.out.println("Student have been destroyed");
	}
	
	public Student() {
		
	}
	
	public Student(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}
}
