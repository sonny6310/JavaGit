<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="chap13.board.BoardDBBean" %>
    <%@ page import="chap13.board.BoardDataBean" %>
<%
String sj = request.getParameter("subject");

BoardDataBean dataBean = new BoardDataBean();
dataBean.setSubject(sj);
out.print(dataBean.toString());

BoardDBBean bdb = BoardDBBean.getInstance();
// bdb.insertArticle();
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