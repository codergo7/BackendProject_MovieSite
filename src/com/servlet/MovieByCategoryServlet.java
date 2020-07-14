package com.servlet;

import com.dao.*;

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
 * Servlet implementation class MovieDetail
 */
@WebServlet("/moviesbycategory")
public class MovieByCategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MovieByCategoryServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int categoryId = Integer.valueOf(request.getParameter("categoryId"));
		ArrayList<Movie> categories = new MovieDao().getMoviesByCategory(categoryId);

		request.setAttribute("categories", categories);
		// request.getRequestDispatcher("movies.jsp").forward(request, response);
		request.getRequestDispatcher("moviesbycategory.jsp").forward(request, response);

		/*
		 * ArrayList<Movie> movies = new MovieDao().getAllMovies();
		 * 
		 * request.setAttribute("movies", movies); //
		 * request.getRequestDispatcher("movies.jsp").forward(request, response);
		 * request.getRequestDispatcher("moviedetails.jsp").forward(request, response);
		 * 
		 * 
		 * String name = request.getParameter("name");
		 * 
		 * Movie movie = MovieDao.getMovieByName(name); request.setAttribute("movie",
		 * movie); request.getRequestDispatcher("movies.jsp").forward(request,
		 * response);
		 */
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
