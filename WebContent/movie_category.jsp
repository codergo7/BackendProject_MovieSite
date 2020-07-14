<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.dao.MovieDao"%>
<%@page import="com.dao.*"%>
<%@page import="com.entity.*"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<% 
ArrayList<Category> categories = CategoryDao.getAllCategories();
request.setAttribute("categories", categories);
%>

<div>
	<h2>Movie Categories</h2>
	</br>

	<c:forEach items="${categories}" var="category">
		<a href="moviesbycategory?categoryId=${category.id}">
			${category.name}</a>
		</br>
	</c:forEach>

</div>
</div>

