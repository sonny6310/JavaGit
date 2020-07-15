<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Proc</title>
</head>
<body>
	<h1>jsp구문으로 request</h1>
	<%
		String aparam = request.getParameter("a");
		String bparam = request.getParameter("b");
		out.println("aparam=" + aparam + "<br/>");
		out.println("bparam= " + bparam);
	%>
	<h1>el, jstl태그</h1>
	<!-- lib에 jstl.jar 두개 넣고 2번째 줄(taglib) 추가해야 사용가능 -->
	aparam=${param.a}
	<br /> bparam=${param.b}
	<!-- 페이지 디렉티브 | taglib -> el, jstl 서블릿 기반에서 사용하기 때문에 ${}을 사용하면서 소스가 줄어든다. -->
</body>
</html>