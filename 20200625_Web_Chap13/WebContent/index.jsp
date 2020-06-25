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
<title>index</title>
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
	background-color: #ededeb;
}
.A{
	display: inline;
}
</style>
</head>
<body>
	<div class="container mt-3 chap13-bgColor">
		<h1 class="A" style="color: rgb(252,188,126); font-size: 65px;">J</h1><h1 class="A"  style="color: rgb(250,248,235); font-size: 65px;">S</h1><h1 class="A"  style="color: rgb(248,140,101); font-size: 65px;">P</h1><h1 class="A" > 13장</h1>
		<div class="container mt-5">
			<div class="row">
				<div class="col">
					<h4 class="chap13-center">
						글 목록 (전체 글:<%=count%>)
					</h4>
				</div>
			</div>
			<%
				if (count == 0) {
			%>
			<div class="col-md-2 chap13-center chap13-border">게시판에 저장된 글이 없습니다.</div>

			<%
				} else {
			%>

			<table class="table table-hover mb-1">
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
				<tbody style="background-color: #fafafa;">
					<tr onclick="document.location.href='content.jsp?num=<%=article.getNum()%>&pageNum=<%=pageNum%>'" height="30">
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
				</tbody>
				<%
					}
				%>
			</table>
			<%
				}
			%>
			<input type="button" value="글 작성" id="writeBtn" onClick="window.location='writeForm.jsp'" />
		</div>
		<div style="margin: 0" class="chap13-center">
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

			<a href="index.jsp?pageNum=<%=startPage - 10%>">[이전]</a>
			<%
				}

					for (int i = startPage; i <= endPage; i++) {
			%>
			<a id="pgNum" href="index.jsp?pageNum=<%=i%> ">[<%=i%>]
			</a>

			<%
				}
					if (endPage < pageCount) {
			%>
			<a id="pgNum" href="index.jsp?pageNum=<%=startPage + 10%>">[다음]</a>
			<%
				}
				}
			%>
		</div>
	</div>
</body>
</html>

<script type="text/javascript">
	function row(num){
		location.href="content.jsp?num="+num
	}
</script>