<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String a = request.getParameter("a");
		String b = request.getParameter("b");
	%>
	a =
	<%=a%>
	b =
	<%=b%>
	
	<input type="button" onclick="location.href='reqa.jsp'" value="reqa로 돌아가기">
</body>
</html>