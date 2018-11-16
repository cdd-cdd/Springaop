package com.able.beans;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class BookShelf {
	
	private String name;
	private Map<String,Book> books = new HashMap<>();
	
	public BookShelf() {
		
	}
	
	public BookShelf(String name, Map<String,Book> books) {
		this.name = name;
		this.books = books;
	}
	

}
