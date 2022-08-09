<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core"%>      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css"> 
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
</head>
<body class="body1">
	<div>
		<div>
			<h1 class ="header">List of Books</h1>
		</div>
		<div class = "table">
			<div>
				<table class="table table-hover">
					<thead>
						<tr>
							<th>ID</th>
							<th>Title</th>
							<th>Language</th>
							<th># Pages</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var = "book" items = "${bookList}">
						<tr>
							<td><c:out value= "${book.id}"></c:out></td>
							<td> <a href="<c:url value="/books/{id}"/>"><c:out value= "${book.title}"></c:out></a></td>
							<td><c:out value= "${book.language}"></c:out></td>
							<td><c:out value= "${book.pages}"></c:out></td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>