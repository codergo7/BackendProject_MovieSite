package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");

		if (user.equals("adem") && pass.equals("1234")) {
			request.getSession().setAttribute("user", user);
			response.sendRedirect("index.jsp");
		}

		else {

			String errorMesage = "User name or password is incorrect!";
			request.setAttribute("error", errorMesage);
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}

	}

}
