package com.entity;

public class Movie {
	private int id;
	private String name;
	private Director director;
	private Category category;
	private int year;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Movie() {
		// TODO Auto-generated constructor stub
	}

	public Movie(String name) {
		this.name = name;
	}

	public Movie(int id, String name, int year) {
		this.id = id;
		this.name = name;
		this.year = year;
	}

	public Movie(int id, String name, Category cat, Director director, int year) {
		this.id = id;
		this.name = name;
		this.year = year;
		this.director = director;
		this.category = cat;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		// return " Movie ID: " + this.id + ", Movie Name: " + this.name + ", Production
		// Year: " + this.year;
		return this.name;
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
