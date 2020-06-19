<%@page import="chap13.board.BoardDataBean"%>
<%@page import="chap13.board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String num = request.getParameter("num");
	String pageNum = request.getParameter("pageNum");

	BoardDBBean bdb = BoardDBBean.getInstance();
	BoardDataBean one = bdb.selectOne(Integer.parseInt(num), Integer.parseInt(pageNum));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>content</title>
<!-- 부트스트랩 -->
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>

<!-- My css -->
<link rel="stylesheet" href="css/chap13.css" />
<style>
body {
	background-color: #ebebeb;
}
</style>
</head>
<body>
<body>

	<div class="container mt-3 chap13-bgColor">
		<div class="row">
			<div class="col">
				<h1 class="chap13-center">글보기</h1>
			</div>
		</div>
		<div class="row">
			<div class="col-md-2 mr-3 pb-3 chap13-center chap13-border">이름</div>
			<div style="background-color: #f5f5f5; box-sizing: border-box; border-radius: 5px; border: 1px solid #d9d9d9;" class="col-md-2 pt-2">
				<%=one.getWriter()%>
			</div>
		</div>
		<div class="row">
			<div class="col-md-2 mr-3 pb-3 chap13-center chap13-border">제목</div>
			<div style="background-color: #f5f5f5; box-sizing: border-box; border-radius: 5px; border: 1px solid #d9d9d9;" class="col-md-6 pt-2">
				<%=one.getSubject()%>
			</div>
		</div>
		<div class="row">
			<div class="col-md-2 mr-3 pb-3 chap13-center chap13-border">Email</div>
			<div style="background-color: #f5f5f5; box-sizing: border-box; border-radius: 5px; border: 1px solid #d9d9d9;" class="col-md-6 pt-2 ">
				<%=one.getEmail()%>
			</div>
		</div>
		<div class="row">
			<div class="col-md-2 mr-3 pb-3 chap13-center chap13-border">내용</div>
			<div style="background-color: #f5f5f5; box-sizing: border-box; border-radius: 5px; border: 1px solid #d9d9d9; height: 250px;" class="col-md-9 pt-2 ">
				<%=one.getContent()%>
			</div>
		</div>
		<div class="row">
			<div class="col-md-2 chap13-center chap13-border">비밀번호</div>
			<div class="col-md-1">
				<input class="form-control" type="password" name="passwd" />
			</div>
		</div>
		<div class="row">
			<div class="col-md-12 chap13-center">
				<input type="button" value="글수정" id="updateBtn" /> <input type="button" value="글삭제" onClick="window.location='deleteForm.jsp'" /> <input type="button" value="목록보기" onClick="window.location='index.jsp'" />
			</div>
		</div>
	</div>
</body>
</html>