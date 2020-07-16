package com.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.LoginDao;
import com.entity.User;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Boolean flag = true;

	public LoginServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("user");
		String pass = request.getParameter("pass");

		flag = true;

		User user = new User(name, pass);

		Map<Integer, User> users = new LoginDao().getAllUser();

		users.forEach((k, v) -> {

			if (user.compareTo(v) == 1) {
				flag = false;
				request.getSession().setAttribute("user", user.getUserName());

				try {
					response.sendRedirect("index.jsp");
				} catch (IOException e) {

					e.printStackTrace();
				}

			}

		});

		if (flag) {
			System.out.println("Here is inside of flag");
			String errorMsg = "Username/password is incorrect!";
			request.setAttribute("error", errorMsg);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}

	}

}
