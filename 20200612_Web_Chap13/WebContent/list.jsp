<%@page import="java.util.ArrayList"%>
<%@page import="chap13.board.BoardDataBean"%>
<%@page import="chap13.board.BoardDBBean"%>
<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%!int pageSize = 10;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");%>
<%
	String pageNum = request.getParameter("pageNum");
	if (pageNum == null) {
		pageNum = "1";
	}
	int currentPage = Integer.parseInt(pageNum);
	int startRow = (currentPage - 1) * pageSize + 1;
	int endRow = currentPage * pageSize;
	int count = 0;
	int number = 0;
	List<BoardDataBean> articleList = null;
	BoardDBBean dbBean = BoardDBBean.getInstance();
	count = dbBean.getArticleCount();

	if (count > 0) {
		articleList = dbBean.getArticles(startRow, pageSize);

	}

	number = count - (currentPage - 1) * pageSize;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
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
	<div class="container chap13-bgColor">
		<div class="row">
			<div class="col">
				<h1 class="chap13-center">
					글목록 (전체 글:<%=count%>)
				</h1>
			</div>
		</div>
		<div class="row">
			<div class="col-md-1 chap13-center">
				<input type="button" value="글쓰기" id="writeBtn" onClick="window.location='writeForm.jsp'" />
			</div>
		</div>
		<%
			if (count == 0) {
		%>
		<div class="col-md-2 chap13-center chap13-border">게시판에 저장된 글이 없습니다.</div>

		<%
			} else {
		%>
		<div class="row">
			<table class="table">
				<thead class="thead-dark">
					<tr>
						<th width="50">번 호</th>
						<th width="250">제 목</th>
						<th width="100">작성자</th>
						<th width="150">작성일</th>
						<th width="50">조 회</th>
						<th width="100">IP</th>
					</tr>
				</thead>
				<%
					for (int i = 0; i < articleList.size(); i++) {
							BoardDataBean article = articleList.get(i);
				%>
				<tr height="30">
					<td width="50">
						<%=number--%></td>
					<td width="250" align="left">
						<a href="content.jsp?num=<%=article.getNum()%>&pageNum=<%=currentPage%>"><%=article.getSubject()%></a>
					</td>
					<td width="100" align="left">
						<a href="mailto:<%=article.getEmail()%>"><%=article.getWriter()%></a>
					</td>
					<td width="150"><%=sdf.format(article.getReg_date())%></td>
					<td width="50"><%=article.getReadcount()%></td>
					<td width="100"><%=article.getIp()%></td>
				</tr>
				<%
					}
				%>
			</table>
			<%
				}
			%>

			<%
				if (count > 0) {
					int pageCount = count / pageSize + (count % pageSize == 0 ? 0 : 1);
					int startPage = 1;

					if (currentPage % 10 != 0)
						startPage = (int) (currentPage / 10) * 10 + 1;
					else
						startPage = ((int) (currentPage / 10) - 1) * 10 + 1;

					int pageBlock = 10;
					int endPage = startPage + pageBlock - 1;
					if (endPage > pageCount)
						endPage = pageCount;

					if (startPage > 10) {
			%>
			<a href="list.jsp?pageNum=<%=startPage - 10%>">[이전]</a>
			<%
				}

					for (int i = startPage; i <= endPage; i++) {
			%>
			<a href="list.jsp?pageNum=<%=i%>">[<%=i%>]
			</a>
			<%
				}

					if (endPage < pageCount) {
			%>
			<a href="list.jsp?pageNum=<%=startPage + 10%>">[다음]</a>
			<%
        }
    }
%>
		
</body>
</html>