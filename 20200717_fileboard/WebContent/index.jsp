<%@page import="com.file.CVALUES"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.file.FileBoardDAO"%>
<%@ page import="com.file.FileBoardDTO"%>
<%
	FileBoardDAO dao = FileBoardDAO.getInstance();
	List<FileBoardDTO> list = dao.selectAllFileBoard();

	String filepath = application.getRealPath("/upload/");
	
	CVALUES.filepath = filepath;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
<!-- jquery -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$(".row").on("click", function() {
			var idx = $(this).find("td").eq(1).html();
			var title = $(this).find("td").eq(2).html();
			var content = $(this).find("td").eq(3).html();

			$("#idx").val(idx);
			$("#title").val(title);
			$("#content").val(content);
		})
	});
</script>
</head>
<body>
	<form action="uploadPro.jsp" method="post" enctype="multipart/form-data">
		<h1 style="margin-bottom: -2px;">file 업로드</h1>
		<div>
			파일: <input type="text" name="title" /><br /> 내용:
			<textarea name="content" style="margin-top: 10px; margin-bottom: 6px;"></textarea>
			<br /> 첨부: <input type="file" name="file" /> <input type="submit" value="저장" />
		</div>
	</form>
	<form action="updatePro.jsp" method="post">
		<h1 style="margin-top: 50px; margin-bottom: -2px;">file 수정</h1>
		<div>
			idx: <input type="text" name="idx" id="idx" style="margin-left: 11px; margin-bottom: 8px;" readonly /><br /> 파일: <input type="text" name="title" id="title" /><br /> 내용:
			<textarea name="content" id="content" style="margin-top: 10px; margin-bottom: 6px;"></textarea>
			<br /> 첨부: <input type="file" name="file" id="file" /> <input type="submit" value="수정" />
		</div>
	</form>
	<div style="margin-top: 50px;">
		<form action="deletePro.jsp" method="get">
			<table border="1">
				<tr>
					<th></th>
					<th>idx</th>
					<th>title</th>
					<th>content</th>
					<th>file</th>
				</tr>
				<%
					if (!(list == null)) {
						for (int i = 0; i < list.size(); i++) {
							FileBoardDTO dto = list.get(i);
							out.println("<tr class=\"row\">");
							out.println("<td><input type=\"checkbox\" name=\"ck\" value=\"" + dto.getIdx() + "\"/></td>");
							out.println("<td>" + dto.getIdx() + "</td>");
							out.println("<td>" + dto.getTitle() + "</td>");
							out.println("<td>" + dto.getContent() + "</td>");
							out.println("<td >" + dto.getFilename() + "</td>");
							out.println("</tr>");
						}
					}
				%>
			</table>
			<input type="submit" value="삭제" style="margin-top: 4px;" />
		</form>
	</div>
</body>
</html>