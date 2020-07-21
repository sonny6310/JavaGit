<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
<%@ include file="../resources/cssjs/head.jsp"%>
<style>
.dto:hover {
	background-color: lime;
	cursor: pointer;
}
</style>
</head>
<body>
	<div class="container">
		<form action="delete.ws" id="frm">
			<div class="row" style="height: 550px;">
				<table class="table">
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
							<td class="td_ck">
								<input type="checkbox" name="idx" value="${dto.idx}">
							</td>
							<td>${dto.idx}</td>
							<td>${dto.title}</td>
							<td>${dto.content}</td>
							<td>${dto.reg_date}</td>
							<td>${dto.mod_date}</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</form>
		<div class="row">
			<button id="insert" class="btn-primary">글쓰기</button>
			<button id="delete" class="btn-primary">삭제</button>
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
						$(this).find("input").attr("checked",true);
					});
					$("#delete").on("click",function(e){
						$("#frm").submit();
					});
				});
			</script>
		</div>
	</div>
</body>
</html>