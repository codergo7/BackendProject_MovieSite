<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.dao.*"%>
<%@page import="com.entity.*"%>
<%@page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<% 
//ArrayList<Movie> categories = new MovieDao().getMoviesByCategory(categoryId);
//request.setAttribute("categories", categories);
%>

<jsp:include page="header.jsp" />

<div id="container">
	<div>
		<h3>Movies</h3>
		<c:forEach items="${categories}" var="movie">
			<a href="moviedetail?id=${movie.id}">${movie.name}</a>
			</br>

		</c:forEach>
	</div>

	<jsp:include page="movie_category.jsp" />

	<jsp:include page="footer.jsp" />