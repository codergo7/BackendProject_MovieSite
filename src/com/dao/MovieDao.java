package com.dao;


import com.mysql.*;


import java.sql.*;
import java.util.ArrayList;
import com.entity.*;

public class MovieDao {	
		
	
	public ArrayList<Movie> getAllMovies() {
		ArrayList<Movie> list = new ArrayList<>();
		
		
		/*
		 * try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn  = DriverManager.getConnection("jdbc:mysql://localhost/movies", "root", "12345");
		
			String query = "select * from movie";
			
			Statement statement = conn.createStatement();
			
			ResultSet rs = statement.executeQuery(query);
			
			while(rs.next()) {
				
				int movieId= rs.getInt("id");
				String name = rs.getString("name");
				int year = rs.getInt("year");
			
				Movie movie = new Movie(movieId, name, year);
				
				movies.add(movie);
			}
			
					
			
		}catch(Exception e){
			e.printStackTrace();
		}
			

		
		return movies;

		 * 
		 * 
		 * 
		 */
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/movies", "root", "Sanane.123");
			
			String query = "select * from movie";
			
			Statement statement = connection.createStatement();
			
			ResultSet rs = statement.executeQuery(query);
			
			while(rs.next()) {
				Movie movie = new Movie(rs.getInt("id"), rs.getString("name"), rs.getInt("year"));
				list.add(movie);		
				
			}
		}
		 catch(Exception e){
			 System.out.println(e.getMessage());
			 } 		
		
		return list;
	}	

}
