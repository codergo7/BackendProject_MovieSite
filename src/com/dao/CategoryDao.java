package com.dao;

import java.sql.*;
import java.util.ArrayList;
import com.entity.*;

public class CategoryDao {
	
	public static ArrayList<Category> getAllCategories(int id){
		
		ArrayList<Category> categories = new ArrayList();
		 
		String query = "select from * movie";
		
		try {
			Connection connection = ConnectionManager.getConnection();
			PreparedStatement ps = connection.prepareStatement(query);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Category category = new Category(rs.getInt("category id"), rs.getString("name"));
				categories.add(category);
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return categories;
	}

}
