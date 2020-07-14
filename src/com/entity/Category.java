package com.entity;

public class Category {
	private int id;
	private String name;

	public Category() {
		// TODO Auto-generated constructor stub
	}

	public Category(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
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
