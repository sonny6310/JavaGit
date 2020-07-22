<%@page import="reques.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		User user = new User("홍길동", "20", "ㅎㅎㅎㅈ");

		session.setAttribute("user", user);
		out.println("세션 안에 user 키가 설정되고 값은 user객체를 넣었다.");
	%>
	
	<input type="button" onclick="location.href='reqa.jsp'" value="reqa로 돌아가기">
</body>
</html>