<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.dao.*"%>
<%@page import="com.entity.*"%>
<%@page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<% 
ArrayList<Movie> movies = new MovieDao().getAllMovies();
request.setAttribute("movies", movies);
%>

<jsp:include page="header.jsp" />

<div id="container">
	<div>
		<h3>All Movies on The Site</h3>
		<c:forEach items="${movies}" var="movie">
			<c:out value="${movie}"></c:out>
			<br />
		</c:forEach>
	</div>

	<jsp:include page="movie_category.jsp" />

	<jsp:include page="footer.jsp" />