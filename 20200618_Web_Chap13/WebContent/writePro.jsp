<%@page import="java.sql.Timestamp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="chap13.board.BoardDBBean"%>
<%@ page import="chap13.board.BoardDataBean"%>
<%
request.setCharacterEncoding("UTF-8");  // post로 했을 시 한글이 깨지는 상황 발생하여서 인코딩방식을 UTF-8로 직접 설정
String nm = request.getParameter("name");
String sj = request.getParameter("subject");
String em = request.getParameter("email");
String ct = request.getParameter("content");
String pw = request.getParameter("passwd");

BoardDataBean dataBean = new BoardDataBean();
dataBean.setWriter(nm);
dataBean.setSubject(sj);
dataBean.setEmail(em);
dataBean.setContent(ct);
dataBean.setPasswd(pw);
dataBean.setReg_date(new Timestamp(System.currentTimeMillis()));
dataBean.setIp(request.getRemoteAddr());

out.print(dataBean.toString());

BoardDBBean bdb = BoardDBBean.getInstance();
bdb.insertArticle(dataBean);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>writePro</title>
</head>
<body>
	<input type="button" value="글 목록" id="writeBtn" onClick="window.location='index.jsp'" />
</body>
</html>