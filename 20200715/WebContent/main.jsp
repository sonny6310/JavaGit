<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
</body>
</html>