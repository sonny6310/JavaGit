<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// 쿠키는 유효시간 내에서 (날아가기 전까지) 브라우저를 껐다가 켜도 값을 그대로 가져올 수 있음
		Cookie[] cookies = request.getCookies();
		for (Cookie cook : cookies) {
			out.println("cook.getName() : " + cook.getName());
			out.println("cook.getValue() : " + cook.getValue());
			out.println("<br/>");
		}
	%>
</body>
</html>