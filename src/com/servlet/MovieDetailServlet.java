package com.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MovieDao;
import com.entity.Movie;

/**
 * Servlet implementation class MovieDetailServlet
 */
@WebServlet("/moviedetail")
public class MovieDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MovieDetailServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int movieId = Integer.valueOf(request.getParameter("id"));
		Movie movie = new MovieDao().getMovieDetail(movieId);

		request.setAttribute("movie", movie);
		request.getRequestDispatcher("moviedetail.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);

	}

}
