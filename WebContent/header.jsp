<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<title>Movie Site</title>

<link rel="stylesheet" href="style.css" />
</head>

<body>
	<div id="header">
		<div>
			<a href="index.jsp">HOME</a>
		</div>

		<div id="login">

			<c:if test="${not empty user}">
				<p>Welcome ${user}</p>
				<a href="logout"><input type="button" value="Log out" /></a>

			</c:if>

			<c:if test="${empty user}">
				<form action="login" method="post">
					<table>
						<tr>
							<td>User: <input type="text" name="user" /></td>
							<td>Password: <input type="password" name="pass" /></td>
							<td><input type="submit" value="Log in" /></td>
						</tr>
					</table>
					<c:if test="${not empty error}">
						<h4 style="color: red;">${error}</h4>
					</c:if>
				</form>
			</c:if>
		</div>
			
		
		<div>
			<!-- <c:if test="${not empty message}">
				<p>${message}</p>
				<a href="logout"><input type="button" value="Log out" /></a>

			</c:if> -->

			
			<form action="sign_up" method="post">
					<table>
						<tr>
							<td>User: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="user" /></td>
						</tr>
						<tr>
							<td>Password: <input type="password" name="pass" /></td>
						</tr>	
						<tr>	
							<td>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;<input type="submit" value="Sign Up" /></td>
						</tr>
					</table>
					<c:if test="${not empty alreadyExist}"> 
						<h4 style="color: red;">${alreadyExist}</h4>
					</c:if>
					<c:if test="${not empty successfullyRegistered}">
						<h4 style="color: blue;">${successfullyRegistered}</h4>
					</c:if>
				</form>
			
		</div>
		
		<div>
			<a href="index.jsp">TEMPLATE</a>
		</div>
		
		
	</div>