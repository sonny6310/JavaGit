<%@page import="reques.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String sesa = (String) session.getAttribute("sesa");

		User user = (User) session.getAttribute("user");
	%>
	sesa =
	<%=sesa%>
	<br />
	<!-- sessionc.jsp를 실행하지 않고 (User객체에 값을 안넣고) 바로 reqa.jsp를 열면 
	 user.getName,getAge,getRemark 등은 모두 null값이므로 오류발행 -->
<!-- 	사용자명: -->
<%-- 	<%=user.getName()%> --%>
<!-- 	나이: -->
<%-- 	<%=user.getAge()%> --%>
<!-- 	비고: -->
<%-- 	<%=user.getRemark()%> --%>
	<br />
	<!-- 	jstl을 이용하면 sessionc.jsp를 실행하지 않은 채로 reqa.jsp를 열어도 (User객체에 값 넣지 않아서 null) 오류가 나지않고 브라우저에 아무것도 출력되지않음-->
	${sessionScope.user.name} ${sessionScope.user.age} ${sessionScope.user.remark}
	<br/>
	<input type="button" onclick="location.href='sessiona.jsp'" value="sessiona로 이동">
	<input type="button" onclick="location.href='sessionc.jsp'" value="sessionc로 이동">
	<br/>
	
	<form action="reqb.jsp">
		<input type="text" name="a" /> <input type="text" name="b" /> <input type="submit" name="reqb파일로 이동" />
	</form>
</body>
</html>