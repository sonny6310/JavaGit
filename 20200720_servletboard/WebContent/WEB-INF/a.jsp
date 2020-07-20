<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>A</h1>
<!-- 
	a.jsp : ${hello} 안보임. 
	a.ws : servlet (Controller.java) 에서 request.setAttribute("hello", "this is servlet") 를 통해서 this is servlet 이 출력됨.
-->
${hello}
</body>
</html>