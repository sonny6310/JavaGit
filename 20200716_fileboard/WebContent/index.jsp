<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.file.FileBoardDAO"%>
<%@ page import="com.file.FileBoardDTO"%>
<%
	FileBoardDAO dao = FileBoardDAO.getInstance();
	List<FileBoardDTO> list = dao.selectAllFileBoard();
%>
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
			파일: <input type="text" name="title" /><br /> 내용:
			<textarea name="content"></textarea>
			<br /> 첨부:<input type="file" name="file" /> <input type="submit" value="저장" />
		</div>
	</form>
	<div style="margin-top: 50px;">
		<form action="deletePro.jsp" method="post">
			<table border="1">
				<tr>
					<th></th>
					<th>idx</th>
					<th>title</th>
					<th>content</th>
					<th>file</th>
				</tr>
				<%
					for (int i = 0; i < list.size(); i++) {
						FileBoardDTO dto = list.get(i);
						out.println("<tr>");
						out.println("<td><input type=\"checkbox\" name=\"ck\" value=\""+dto.getIdx()+"\"/></td>");
						out.println("<td>" + dto.getIdx() + "</td>");
						out.println("<td>" + dto.getTitle() + "</td>");
						out.println("<td>" + dto.getContent() + "</td>");
						out.println("<td>" + dto.getFilename() + "</td>");
						out.println("</tr>");
					}
				%>
			</table>
			<input type="submit" value="삭제" />
		</form>
	</div>
</body>
</html>