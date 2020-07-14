<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
	<form action="uploadPro.jsp" method="post" enctype="multipart/form-data">
		<h1>file upload</h1>
		<div>
			파일:<input type="text" name="title" /><br/>
			내용:<textarea name="content"></textarea><br/>
			첨부:<input type="file" name="file" />
			<input type="submit" value="저장"/>
		</div>
	</form>
</body>
</html>