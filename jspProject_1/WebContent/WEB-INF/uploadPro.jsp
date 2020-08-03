<%@page import="com.org.cloud.CloudDAO"%>
<%@page import="com.org.cloud.CloudDTO"%>
<%@page import="java.util.Enumeration"%>
<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- D:\2020java\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\현재 프로젝트명\upload : 저장되는 경로 -->
<%
	String id = (String) session.getAttribute("signedUser");
	String filepath = application.getRealPath("/upload/" + id + "/");

	CloudDTO cDTO = new CloudDTO();
%>

<%
	File folder = new File(filepath);
	if (!folder.exists()) {
		folder.mkdirs();
	}

	MultipartRequest mr = new MultipartRequest(request, filepath, 1024 * 1024 * 10, //10MB
			"utf-8", new DefaultFileRenamePolicy());

	// 	Enumeration<?> params = mr.getParameterNames();

	// 	while (params.hasMoreElements()) {
	// 		String name = (String) params.nextElement();
	// 		String value = mr.getParameter(name);

	// 		out.println("name = " + name + " value = " + value + "<br/>");
	// 	}
	Enumeration<?> files = mr.getFileNames();
	while (files.hasMoreElements()) {
		String name = (String) files.nextElement();
		String filename = mr.getFilesystemName(name);
		File file = mr.getFile(name);

		cDTO.setId(id);
		cDTO.setFilename(filename);
		cDTO.setTitle(mr.getParameter("title"));
		cDTO.setContent(mr.getParameter("content"));

		if (file != null) {
			cDTO.setFilesize((file.length() / 1024) / 1024 + "." + (file.length() / 1024) % 1024 + "MB");
		}
	}

	CloudDAO cDAO = CloudDAO.getInstance();

	int x = cDAO.insert(cDTO);

	if (x == 1) {
		response.sendRedirect("mycloud.ws");
	} else {
%>
<script>
	alert('업로드에 실패하였습니다');
	history.go(-1);
</script>
<%
	}
%>
