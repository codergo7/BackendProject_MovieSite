package com.dao;

import java.sql.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.mysql.*;
import com.entity.User;

public class LoginDao {
	
	public Map<Integer, User> getAllUser(){
		Map<Integer, User> users = new HashMap<>();
		String query = "select * from user";
		
		try {
			Connection conn = ConnectionManager.getConnection();
			
			PreparedStatement ps = conn.prepareStatement(query);
			
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				
				users.put(rs.getInt("id"),new User( rs.getString("name"), rs.getString("password")));			
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return users;
	}
	
	public int registerDB(User user) {
		String query = "insert into user values(?,?,?)";
		int success=0;
		
		/*int id = getLastInsertedId();
		if(id!=0) {
			id++;
		}
		else {
			System.out.println("Someting goes wrong about lastID!!");
		}*/
		
		try {
			Connection conn = ConnectionManager.getConnection();
			
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, 0);
			ps.setString(2, user.getUserName());
			ps.setString(3, user.getPassword());
			
			success = ps.executeUpdate();
			
						
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return success;
	}
	
	public Boolean userCheckDB(User user) {
		String queryCheck = "select name, password from user where name in(?) and password in (?)";
		
		
		try {
			Connection conn = ConnectionManager.getConnection();
			
			PreparedStatement ps = conn.prepareStatement(queryCheck);
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getPassword());
			
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				System.out.println("null degil");
				return true;
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	/*
	public int getLastInsertedId() {
		int lastId=0;
		
		try {
            String sql = "INSERT INTO user VALUES('Anonym')";
            Connection connection = ConnectionManager.getConnection();
            Statement statement = connection.createStatement();
           lastId = statement.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
            System.out.println("LAST INSERTED ID = "+lastId);


        } catch (Exception e) {
            e.printStackTrace();
        }
		return lastId;
	} */

}
