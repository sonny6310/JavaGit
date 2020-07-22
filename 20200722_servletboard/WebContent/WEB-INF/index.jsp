<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.org.freeboard.FreeBoardDTO"%>
<%
	int textCount = (int) request.getAttribute("textCount");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
<%@ include file="../resources/cssjs/head.jsp"%>
<script type="text/javascript">
	$(document).ready(function() {
		$("#insert").on("click", function() {
			window.location = "insert.ws";
		});
		$(".dto").on("click", function() {
			var idx = $(this).find("input").val();
			window.location = "update.ws?idx=" + idx;
		});
		$(".td_ck").on("click", function(e) {
			e.stopPropagation();
			$(this).find("input").attr("checked", true);
		});
		$("#delete").on("click", function(e) {
			$("#frm").submit();
		});
	});
</script>
<style>
tr.dto:hover {
	background-color: #F5DEB3;
	cursor: pointer;
}

.dtotd {
 	white-space: nowrap;
	overflow: hidden;
	text-overflow: ellipsis;
}
</style>
</head>
<body>
	<div class="container">
		<form action="delete.ws" id="frm">
			<div class="row">
				<h3>글목록(${textNum})</h3>
				<table class="table" style="table-layout:fixed">
					<col width="30px"/>
					<col width="50px"/>
					<col width="160px"/>
					<col width="210px"/>
					<col width="125px"/>
					<col width="125px"/>
					<tr>
						<th></th>
						<th>순번</th>
						<th>제목</th>
						<th>내용</th>
						<th>작성일자</th>
						<th>수정일자</th>
					</tr>
					<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
					<c:forEach items="${list}" var="dto">
						<tr class="dto">
							<td class="td_ck" style="width: 2%; text-align: center;">
								<input type="checkbox" name="idx" value="${dto.idx}">
							</td>
							<td class="dtotd"><%=textCount--%></td>
							<td class="dtotd">${dto.title}</td>
							<td class="dtotd">${dto.content}</td>
							<td class="dtotd">${dto.reg_date}</td>
							<td class="dtotd">${dto.mod_date}</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</form>
		<div style="text-align: center;">
			<c:forEach begin="1" end="${pageCount}" var="i">
			[<a href="index.ws?pageNum=${i}">${i}</a>]
		</c:forEach>
		</div>
		<button id="insert" class="btn-primary">글쓰기</button>
		<button id="delete" class="btn-primary">삭제</button>
	</div>
</body>
</html>