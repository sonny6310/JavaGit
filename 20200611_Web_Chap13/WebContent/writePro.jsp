<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="chap13.board.BoardDBBean" %>
    <%@ page import="chap13.board.BoardDataBean" %>
<%
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

</body>
</html>