<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#ex02").on("click", function() {
			$.ajax({
				url : "ex02.jsp",
				type : "get",
				success : function(result) {
					$("#print").html(result)
				},
				error : function() {
					alert("error");
				}
			});
		});
	});
</script>
</head>
<body>
	<div>
		<button id="ex02">ex02 Load</button>
	</div>
	<div id="print"></div>
</body>
</html>