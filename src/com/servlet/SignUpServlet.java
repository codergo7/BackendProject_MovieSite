package com.servlet;

import java.io.IOException;
import com.dao.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.LoginDao;
import com.entity.User;

/**
 * Servlet implementation class SignUpServlet
 */
@WebServlet("/sign_up")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SignUpServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("user");
		String pass = request.getParameter("pass");
		
		User user = new User(name, pass);
		Boolean isRegistered = new LoginDao().userCheckDB(user);
		
		if(isRegistered) {
			String alreadyExist = "Username/password is already exist!";
			request.setAttribute("alreadyExist", alreadyExist);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		else {
			int success = new LoginDao().registerDB(user);
			if(success==1) {
				System.out.println("It was registered succesfully!");
				String successfullyRegistered = "It was registered succesfully!";
				request.setAttribute("successfullyRegistered", successfullyRegistered);
				request.getRequestDispatcher("index.jsp").forward(request, response);                             //?
			}
			else {
				System.out.println("Something goes wrong!");
				String successfullyRegistered = "It was registered succesfully!";
				request.setAttribute("successfullyRegistered", successfullyRegistered);
				request.getRequestDispatcher("index.jsp").forward(request, response);                              //?
			}
			
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
