<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main</title>
</head>
<body>
	<!-- 페이지 디렉티브 | page : jsp 설정 정보와 import하는것. include : 현재 jsp 페이지에서 다른 jsp 페이지를 포함 -->
	<%@include file="top.jsp"%>
	<div>
		<h1>메인</h1>
		메인 안에서 top.jsp와<br /> bottom.jsp를 포함한다.
	</div>
	<%@include file="bottom.jsp"%>
	
	<h2>MyServlet에서 받아옴</h2>
	<% 
		String requestAttribute = (String)request.getAttribute("a");
		String sessionAttribute = (String)session.getAttribute("b");
	%>
	requestAttribute = <%=requestAttribute %><br/>
	sessionAttribute = <%=sessionAttribute %><br/>
	requestAttribute (jstl/el) = ${a}<br/>
	sessionAttribute (jstl/el) = ${b}
	</div>
</body>
</html>