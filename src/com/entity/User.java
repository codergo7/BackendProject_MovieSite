package com.entity;

public class User implements Comparable<User>{
	
	private String userName;	
	private String password;
	
	
	public User() {
		
	}
public User(String name, String pass) {
		this.userName=name;
		
		this.password=pass;
	}
	
	public String getPassword() {
		return password;
	}
	public String getUserName() {
		return userName;
	}
	
	
	public void setPassword(String password) {
		this.password = password;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}@Override
	public int compareTo(User o) {
		
		if(this.userName.equals(o.userName) && this.password.equals(o.password)) {
			return 1;
		}
		
		return 0;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.userName;
	}
	

}
