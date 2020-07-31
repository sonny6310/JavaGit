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
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#id").on("blur", function() {
			var id = $("#id").val();
			if(id.length < 7){
				$("#id_check").text("아이디는 7자 이상이어야 합니다.");
				$("#id_check").css("color", "salmon");
				$("#id_check").css("margin-left", "25%");
			}else{
				$.ajax({
					type : "get",
					url : "checkID.ws?id=" + id,
					success : function(data) {
						if (data == 1) {
							$("#id_check").text("사용가능한 아이디입니다.");
							$("#id_check").css("color", "skyblue");
							$("#id_check").css("margin-left", "28%");
						} else {
							$("#id_check").text("불가능한 아이디입니다.");
							$("#id_check").css("color", "salmon");
							$("#id_check").css("margin-left", "29%");
						}
					}
				});
			}
		});
		
		$("#pw").on("blur", function(){
			var pw = $("#pw").val();
			if(pw.length < 8){
				$("#pw_check").text("비밀번호는 8자 이상이어야 합니다.");
				$("#pw_check").css("color", "salmon");
				$("#pw_check").css("margin-left", "23%");
			} else{
				$("#pw_check").text("OK");
				$("#pw_check").css("color", "skyblue");
				$("#pw_check").css("margin-left", "41%");
			}
		});
		
		$("#name").on("blur", function(){
			var name = $("#name").val();
			if(name.length < 2 || name.length > 5){
				$("#name_check").text("이름은 2~5글자여야 합니다.");
				$("#name_check").css("color", "salmon");
				$("#name_check").css("margin-left", "27%");
			} else {
				$("#name_check").text("OK");
				$("#name_check").css("color", "skyblue");
				$("#name_check").css("margin-left", "41%");
			}
		});
		
		$("#submit").on("click", function(){
			$("#submit").attr("type", "button");
			if( $("#id_check").text().trim() == "사용가능한 아이디입니다." && $("#pw_check").text().trim() == "OK" && $("#name_check").text().trim() == "OK" && $("#email").val() != "") {
				$("#submit").attr("type", "submit");
			} else if($("#id_check").text().trim() != "사용가능한 아이디입니다."){
				$("#id").focus();
			} else if($("#pw_check").text().trim() != "OK"){
				$("#pw").focus();
			} else if($("#name_check").text().trim() != "OK"){
				$("#name").focus();
			} else if($("#email").val().trim() == ""){
				$("#email").focus();
			}
		})	
	});
</script>
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
			<form name="signupForm" method="post" action="signupPro.ws">
				<div class="inner">
					<div class="fields" style="width: 50%; margin-left: 30%;">
						<div class="field">
							<label class="test" for="id">아이디</label> <input style="width: 90%;" type="text" name="id" id="id" autocomplete="off"/>
							<div id="id_check"></div>
						</div>
						<div class="field">
							<label for="pw">비밀번호</label> <input style="width: 90%;" type="password" name="pw" id="pw" autocomplete="off"/>
							<div id="pw_check"></div>
						</div>
						<div class="field">
							<label for="name">이름</label> <input style="width: 90%;" type="text" name="name" id="name" autocomplete="off"/>
							<div id="name_check"></div>
						</div>
						<div class="field">
							<label for="email">Email</label> <input style="width: 90%;" type="text" name="email" id="email" autocomplete="off"/>
						</div>
						<div style="margin-top: 17px;">
							<input id="submit" type="button" value="가입" class="primary" /> <input type="reset" value="리셋" />
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