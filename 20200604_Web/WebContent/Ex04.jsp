<%@page import="java.util.*"%>
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
	List<String> list = Arrays.asList("AA","BB","CC");
// 	list.add(0,"KK") // 오류!!     List<String> list = new ArrayList(); 일 때 add.  위와 같이 선언한 것은 변수 고정(상수화)
	for(String temp : list){
		out.print("temp = "+temp+"<br>");
	}
%>
</body>
</html>