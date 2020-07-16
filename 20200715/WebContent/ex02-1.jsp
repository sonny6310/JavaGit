<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>GET방식</h1>
	<%
		String aa = request.getParameter("a");
	%>
	<%=aa%>
</body>
</html>