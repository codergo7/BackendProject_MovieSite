package com.dao;

import java.util.ArrayList;
import com.entity.*;

public class MovieDao {
	
	private String movieName;
	public static String str = "Breave Heart";
	
	
	
	public String getMovieName() {
		return movieName;
	}
	
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	
	public ArrayList<Movie> getAllMovies() {
		ArrayList<Movie> list = new ArrayList<>();
		list.add(new Movie("Breave Hart"));
		list.add(new Movie("Matrix"));
		list.add(new Movie("Inception"));
		
		
		return list;
	}
	

}
