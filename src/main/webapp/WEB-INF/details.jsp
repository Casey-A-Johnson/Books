<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core"%>      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Details</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css"> 
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
</head>
<body class = "body2">
	<div class = "details">
		<h1> <c:out value="${oneBook.title }"/></h1>
		<h3>Description: <c:out value="${oneBook.description }"/> </h3>
		<h3>Language: <c:out value="${oneBook.language }"/></h3>
		<h3># Pages: <c:out value="${oneBook.pages }"/></h3>
	</div>
</body>
</html>