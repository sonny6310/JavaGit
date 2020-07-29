<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<!--
	Forty by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
<head>
<title>회원가입</title>
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
		<header id="header">
			<a href="index.ws" class="logo"><strong>홈</strong> <span>바로가기</span></a>
			<nav>
				<a href="#menu">메뉴</a>
			</nav>
		</header>

		<!-- Menu -->
		<%@ include file="../META-INF/resources/menu.jsp"%>

		<!-- Main -->
		<div id="main" class="alt">

			<!-- One -->
			<section id="one">
				<div class="inner">
					<header class="major">
						<h1>회원가입</h1>
					</header>
				</div>
			</section>

		</div>

		<!-- Contact -->
		<section id="contact">
			<form method="post" action="signupPro.ws">
				<div class="inner" style="width: 800px; text-align: center; margin-left: auto; margin-right: auto;">
					<div class="fields">
						<div class="field half">
							<label for="id">아이디</label> <input type="text" name="id" id="id" />
						</div>
						<div class="field half">
							<label for="pw">비밀번호</label> <input type="password" name="pw" id="pw" />
						</div>
						<div class="field half">
							<label for="name">이름</label> <input type="text" name="name" id="name" />
						</div>
						<div class="field half">
							<label for="email">Email</label> <input type="text" name="email" id="email" />
						</div>
					</div>
					<div style="margin-top: 17px;">
						<input type="submit" value="가입" class="primary" /> <input type="reset" value="리셋" />
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