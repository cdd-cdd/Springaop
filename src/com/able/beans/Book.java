package com.able.beans;

import java.util.HashMap;
import java.util.Map;

import lombok.Data;

@Data
public class Book {
	
	private int id = 0;
	private String name = "you haven't give me a name";
	private String author = "whatever you want";
	private Map<String, String> bookmark = new HashMap<>();
	
	public Book() {
		
	}
	
	public Book(String name,String author) {
		this.name = name;
		this.author = author;
	}
	

}
