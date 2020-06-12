<%@page import="chap13.board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>writeForm</title>

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
	<form action="writePro.jsp" id="frm" method="post">  <!-- method를 post로 안주면 자동으로 get. get : 주소창에 값 다 나옴. post : 주소창에 값 숨김 -->
		<div class="container chap13-bgColor">
			<div class="row">
				<div class="col">
					<h1 class="chap13-center">글쓰기</h1>
				</div>
			</div>
			<div class="row">
				<div class="col-md-2 chap13-center chap13-border">이름</div>
				<div class="col-md-2">
					<input class="form-control" type="text" name="name" />
				</div>
			</div>
			<div class="row">
				<div class="col-md-2 chap13-center chap13-border">제목</div>
				<div class="col-md-6">
					<input class="form-control" type="text" name="subject" />
				</div>
			</div>
			<div class="row">
				<div class="col-md-2 chap13-center chap13-border">Email</div>
				<div class="col-md-6">
					<input class="form-control" type="text" name="email" />
				</div>
			</div>
			<div class="row">
				<div class="col-md-2 chap13-center chap13-border">내용</div>
				<div class="col-md-10">
					<textarea class="form-control" name="content" rows="10"></textarea>
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
					<input type="button" value="글쓰기" id="writeBtn" />
					<input type="button" value="다시작성" id="rewriteBtn" />
					<input type="button" value="목록보기" onClick="window.location='list.jsp'" />
				</div>
			</div>
		</div>
	</form>
</body>
</html>
<script type="text/javascript">
	// id가 writeBtn인 버튼 클릭 시 function 작동. function 내용: id="frm"을 submit
	$("#writeBtn").on("click", function() {
		$("#frm").submit();
	})

	$("#rewriteBtn").on("click", function() {
		$("#rewriteBtn").attr("type", "button");
		var reWrite = confirm("현재 작성된 내용이 사라집니다. 계속 진행하시겠습니까?");
		if (reWrite) {
			$("#rewriteBtn").attr("type", "reset");
		}
	})
</script>