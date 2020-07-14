
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.dao.MovieDao"%>
<%@page import="com.dao.*"%>
<%@page import="com.entity.*"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<% 
ArrayList<Movie> movies = new MovieDao().getAllMovies();
request.setAttribute("movies", movies);
%>

</br>
<h3>Movies List</h3>

<c:forEach items="${movies}" var="movie">
	<a href="moviedetail?id=${movie.id}">${movie.name }</a>
	<br />
</c:forEach>
