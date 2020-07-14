package com.dao;

import java.sql.*;
import java.util.ArrayList;
import com.entity.*;

public class CategoryDao {

	public static ArrayList<Category> getAllCategories() {

		ArrayList<Category> categories = new ArrayList();

		String query = "select * from category";

		try {
			Connection connection = ConnectionManager.getConnection();
			PreparedStatement ps = connection.prepareStatement(query);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Category category = new Category(rs.getInt("id"), rs.getString("name"));
				categories.add(category);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return categories;
	}

}
