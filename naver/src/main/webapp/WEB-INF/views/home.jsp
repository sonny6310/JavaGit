<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	네이버 로그인!  
</h1>

<P> 상태: <span style="font-size: 1.5em;">${log}</span> </P>
<p> ${logininfo} ${loginemail} ${sessionScope.login }</p>
<input type="button" onclick="location.href = 'naverLogin'" value="네이버로그인">
</body>
</html>
