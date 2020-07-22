<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Cookie cookie = new Cookie("name","홍길동");
		cookie.setMaxAge(1000*60*60); // 쿠키 유효시간을 24시간으로 설정 (1000 = 1초)
		response.addCookie(cookie);
		
		out.println("쿠키 설정 완료 (이름(id)는 name, value는 홍길동)");
	%>

	<input type="button" value="getCookie~" onclick="location.href='getCookie.jsp'">
</body>
</html>