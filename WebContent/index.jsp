<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.dao.MovieDao"%>
<%@page import="com.dao.*" %>
<%@page import="com.entity.*" %>
<%@page import="java.util.*" %>

<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<%
//ArrayList<Movie> movies = new MovieDao().getAllMovies();
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<p>I am index page</p>
	</br>
	<c:forEach items="${movies}" var="movie">
    	<p>${movie.firstName}</p><br/>   
	</c:forEach>
	
	
		
</body>
</html>