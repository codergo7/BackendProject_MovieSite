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
	public Movie(int id, String  name, int year) {		
		this.id= id;
		this.name=name;
		this.year = year;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " Movie ID:  " + this.id + ",   Movie Name: " + this.name + ",   Production Year: " + this.year;
	}
	
	
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}

}
