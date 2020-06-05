<%@page import="com.org.Oracle"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<body>
 	<div class="container">
 		<nav class="navbar navbar-inverse">
  			<div class="container-fluid">
    			<div class="navbar-header">
      					<a class="navbar-brand" href="#">JSP ORACLE</a>
    			</div>
    			<ul class="nav navbar-nav">
      				<li><a href="select.jsp">SELECT</a></li>
      				<li><a href="insert.jsp">INSERT</a></li>
      				<li><a href="update.jsp">UPDATE</a></li>
      			<li><a href="delete.jsp">DELETE</a></li>
    			</ul>
  			</div>
		</nav>
		<div class="jumbotron">
  			<h1>Update !!!</h1>
		</div>
		<div class="container">
  			<p>
  				<% 
  					String msg = Oracle.doUpdate();
  					out.println(msg);
  				%>
  			</p>
		</div>
	</div>
</body>
</html>