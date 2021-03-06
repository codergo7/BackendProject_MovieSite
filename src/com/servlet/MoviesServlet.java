package com.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.*;
import com.entity.*;


@WebServlet("/movies")
public class MoviesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Map<String, String> filteredParameters = new LinkedHashMap<>();
		filteredParameters.put("name", "");
		filteredParameters.put("directorId", "");
		filteredParameters.put("categoryId", "");
		filteredParameters.put("year", "");

		// ArrayList<Movie> movies = new MovieDao().getAllMovies();

		int id = Integer.valueOf(request.getParameter("categoryId"));

		// ArrayList<Movie> movies = new MovieDao().getMoviesByCategory(id);

		Map<String, String[]> parameters = request.getParameterMap();

		parameters.forEach((k, v) -> {
			System.out.println("parameter" + " " + k);
			if (filteredParameters.keySet().contains(k)) {
				filteredParameters.put(k, v[0]);
			}
		});

		ArrayList<Movie> movies = new MovieDao().getMoviesByFilters(filteredParameters);

		request.setAttribute("movies", movies);
		// request.getRequestDispatcher("movies.jsp").forward(request, response);
		request.getRequestDispatcher("movies.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		doGet(request, response);
	}

}
