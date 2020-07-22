<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- session : 브라우저 창이 종료되기 전까지 또는 15분까지 값이 계속 유지. 유지된 상태일때 어떤 페이지에서든 값을 가져올 수 있다. -->
	<%
		session.setAttribute("sesa", "this is sesa");
		out.println("세션 안에 sesa 키가 설정되고 값은 this is sesa 문자열을 넣었다.");
	%>
	<input type="button" onclick="location.href='reqa.jsp'" value="reqa로 돌아가기">
</body>
</html>