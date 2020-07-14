<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@page import="com.dao.*"%>
<%@page import="com.entity.*"%>
<%@page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="header.jsp" />


<div id="container">
	<div>
		<h3>
			<c:out value="${movie.name}"></c:out>
		</h3>
		</br>
		<p>
			Year:
			<c:out value="${movie.year}"></c:out>
		</p>
	</div>

	<jsp:include page="movie_category.jsp" />

	<jsp:include page="footer.jsp" />>