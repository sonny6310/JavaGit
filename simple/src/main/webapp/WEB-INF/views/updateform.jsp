<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
<!-- 부트스트랩 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h1>
			<a href="../simple/">Hello world!</a>
		</h1>
		<div class="jumbotron">
			<h3>UPDATEFORM</h3>
			현재 : ${here}. <br /> <a href="aajoin">insertform</a><br /> <a href="aaselectall">selectform</a><br /> <a href="aaupdate">updateform</a><br /> <a href="aadeleteall">deleteall</a>
		</div>
		<div class="container" style="width: 100%">
			<div class="row">
				<form action="aaupdate" method="post">
					<div class="input-group col-sm-12">
						<span class="input-group-addon">aa</span> <input name="aa" type="text" class="form-control" placeholder="수정할 글 aa 번호를 입력하세요"> <span class="input-group-addon">bb</span> <input name="bb" type="text" class="form-control" placeholder="bb에 넣을 값을 입력하세요">
						<div class="input-group-btn">
							<button class="btn btn-default" type="submit">저장</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
