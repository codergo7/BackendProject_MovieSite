<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">

body{
    display: grid;
    grid-template-rows: 2fr 5fr 1fr;
    height: 720px;
    width: 1500px;

}

#header{
display: grid;
grid-template-columns: 1fr 1fr 1fr 1fr 1fr;
}
#container{
display: grid;
grid-template-columns: 3fr 1fr ;
}
#footer{
display: grid;
grid-template-columns: 5fr 1fr 1fr 1fr;
}

div{
    /*border: thin dashed black;*/
}

</style>


</head>

<body>
   
<div id="header">
    <div>LOGO</div>
    <div>SPACE</div>
	<div><a href="/MoviesSite/movies"> click here for selected movies list</a></div>
	<div>Link2</div>
	<div>Link3</div>
</div>

<div id="container">
	<div >
	
	<jsp:include page="movies.jsp"/>
	</div>
	<div>Form</div>
</div>

<div id="footer">
    <div>Space</div>
    <div>Abut Us</div>
	<div>Android View</div>
	<div>Contact</div>
</div>


</body>
</html>