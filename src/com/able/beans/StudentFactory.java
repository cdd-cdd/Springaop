package com.able.beans;

public class StudentFactory {
	public Student createStudent(String firstname, String lastname) {
		System.out.println("we are using factory to create student");
		return new Student(firstname,lastname);
	}

}
