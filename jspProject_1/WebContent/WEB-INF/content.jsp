<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<!--
	Forty by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
<head>
<title>파일 내용</title>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
<noscript>
	<link rel="stylesheet" href="assets/css/noscript.css" />
</noscript>
</head>
<body class="is-preload">

	<!-- Wrapper -->
	<div id="wrapper">

		<!-- Header -->
		<!-- Note: The "styleN" class below should match that of the banner element. -->
		<header id="header" class="alt style1">
			<a href="index.ws" class="logo"><strong>홈</strong> <span>바로가기</span></a>
			<nav>
				<a href="#menu">메뉴</a>
			</nav>
		</header>

		<!-- Menu -->
		<%@ include file="../META-INF/resources/menu.jsp"%>

		<!-- Banner -->
		<!-- Note: The "styleN" class below should match that of the header element. -->
		<section id="banner" class="style1">
			<div class="inner">
				<span class="image"> <img src="images/pic07.jpg" alt="" />
				</span>
				<header class="major">
					<h1>글 읽기</h1>
				</header>
			</div>
		</section>

		<br />

		<!-- Contact -->
		<section id="contact">
			<form action="uploadPro.ws" method="post" enctype="multipart/form-data">
				<div class="inner">
					<div class="fields" style="width: 50%; margin-left: 30%;">
						<div class="field">
							<label class="test" for="title">제목</label> <input style="width: 90%;" type="text" name="title" id="title" value="${cDTO.title }"autocomplete="off" disabled/>
						</div>
						<div class="field">
							<label class="test" for="title">첨부파일</label> <input style="width: 90%;" type="text" name="title" id="title" value="${cDTO.filename }"autocomplete="off" disabled />
						</div>
						<div class="field">
							<label class="test" for="title">파일크기</label> <input style="width: 90%;" type="text" name="title" id="title" value="${cDTO.filesize }"autocomplete="off" disabled/>
						</div>
						<div class="field">
							<label for="content">내용</label>
							<textarea style="width: 90%; resize: none;" name="content" id="content" rows="6" autocomplete="off" disabled>${cDTO.content }</textarea>
						</div>
					</div>
				</div>
			</form>
		</section>

		<!-- Footer -->
		<%@ include file="../META-INF/resources/footer.jsp"%>
	</div>

	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/jquery.scrolly.min.js"></script>
	<script src="assets/js/jquery.scrollex.min.js"></script>
	<script src="assets/js/browser.min.js"></script>
	<script src="assets/js/breakpoints.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>
</body>
</html>