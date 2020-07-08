package com.entity;

public class Movie {
	private int id;
	private String name;
	private Director director;
	private Category category;
	private int year;
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}
	
	public Movie(String  name) {
		
		this.name=name;
		 
	}
	
	
public int getId() {
	return id;
}public String getName() {
	return name;
}public void setId(int id) {
	this.id = id;
}public void setName(String name) {
	this.name = name;
}

}
