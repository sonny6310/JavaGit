<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>
<%@ include file="../resources/cssjs/head.jsp"%>
<script type="text/javascript">
	$(document).ready(function() {
		$("#submit").on("click", function() {
			window.location = "updatePro.ws";
		})
	});
</script>
</head>
<body>
	<div class="container">
		<div class="row" style="height: 400px;">
			<form action="updatePro.ws" method="post">
				<input type="hidden" name="idx" value="${dto.idx}" />
				<table class="table">
					<tr>
						<h1>글수정</h1>
					</tr>
					<tr>
						<th>제목</th>
						<td style="width: 800px;">
							<input class="form-control" type="text" name="title" value="${dto.title}" />
						</td>
					</tr>
					<tr>
						<th>내용</th>
						<td>
							<textarea class="form-control" name="content" rows="10">${dto.content}</textarea>
						</td>
					</tr>
					<tr>
						<th></th>
						<td class="text-center">
							<input id="submit" type="submit" value="저장" />
							<input id="cancel "type="button" onclick="location.href='index.ws'" value="취소" />
						</td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>