<%@page import="com.org.Box"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Box<String> box1 = new Box<>();
box1.setO("문자열 박스");
out.println(box1.getO()+"<br>");

Box<Integer> box2 = new Box<>();
box2.setO(375);
out.println(box2.getO()+"<br>");
%>
</body>
</html>