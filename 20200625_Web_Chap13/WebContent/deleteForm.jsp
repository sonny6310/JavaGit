<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	int num = Integer.parseInt(request.getParameter("num"));
	String pageNum = request.getParameter("pageNum");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>deleteForm</title>
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
<script type="text/javascript">
<!--
	function deleSave() {
		if (!document.delForm.passwd.value) {
			alert("비밀번호를 입력하시오.");
			document.delForm.passwd.focus();
			return false;
		}
	}
	-->
</script>
</head>
<body>
	<form method="POST" name="delForm" action="deletePro.jsp?pageNum=<%=pageNum%>" onsubmit="return deleSave()">
		<div class="container mt-3 chap13-bgColor">
			<div class="row">
				<div class="col">
					<h1 class="chap13-center">글삭제</h1>
				</div>
			</div>
			<div class="row">
				<div class="col-md-2 chap13-center chap13-border">비밀번호</div>
				<div class="col-md-2">
					<input class="form-control" type="password" name="passwd" /> <input type="hidden" name="num" value="<%=num%>">
				</div>
			</div>
			<div class="row">
				<div class="col-md-12 chap13-right">
					<input type="submit" value="글삭제" class="mr-3 mb-1"> <input type="button" value="글목록" onclick="document.location.href='index.jsp?pageNum=<%=pageNum%>'">
				</div>
			</div>
		</div>
	</form>
</body>
</html>