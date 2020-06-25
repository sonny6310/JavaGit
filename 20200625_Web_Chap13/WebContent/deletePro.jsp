
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "chap13.board.BoardDBBean" %>
<%@ page import = "java.sql.Timestamp" %>

<% request.setCharacterEncoding("utf-8");%>

<%
  int num = Integer.parseInt(request.getParameter("num"));
  String pageNum = request.getParameter("pageNum");
  String passwd = request.getParameter("passwd");

  BoardDBBean dbBean = BoardDBBean.getInstance();
  int check = dbBean.deleteArticle(num, passwd);

  if(check==1){
%>
	<script type="text/javascript">      
       <!--      
         alert("삭제되었습니다.");
       -->
   </script>
	<meta http-equiv="Refresh" content="0;url=index.jsp?pageNum=<%=pageNum%>">
<%}else{%>
    <script type="text/javascript">      
       <!--      
         alert("비밀번호가 맞지 않습니다.");
         history.go(-1);
       -->
   </script>
<%} %>