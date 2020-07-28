<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	var check = confirm("로그인 했음?");
	if (check) {
		window.location = "upload.ws";
	} else {
		alert("로그인 후 이용하시오.");
		window.location = "index.ws";
	}
</script>
<body>

</body>
</html>