<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.dao.CategoryDao"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.entity.Category"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<jsp:include page="header.jsp" />


<div id="container">
	<div>
		<jsp:include page="movies.jsp" />
	</div>


	<jsp:include page="movie_category.jsp" />

	<jsp:include page="footer.jsp" />