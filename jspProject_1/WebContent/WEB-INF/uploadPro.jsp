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

	Enumeration<?> params = mr.getParameterNames();

	while (params.hasMoreElements()) {
		String name = (String) params.nextElement();
		String value = mr.getParameter(name);

		out.println("name = " + name + " value = " + value + "<br/>");
	}

	out.println("---------------------------------<br/>");

	Enumeration<?> files = mr.getFileNames();
	while (files.hasMoreElements()) {
		String name = (String) files.nextElement();
		String filename = mr.getFilesystemName(name);
		String original = mr.getOriginalFileName(name);
		String type = mr.getContentType(name);
		File file = mr.getFile(name);

		cDTO.setId(id);
		cDTO.setFilename(filename);
		cDTO.setTitle(mr.getParameter("title"));
		cDTO.setContent(mr.getParameter("content"));

		out.println("아이디: " + id + "<br/>");
		out.println("파일명: " + filename + "<br/>");
		out.println("제목: " + mr.getParameter("title") + "<br/>");
		out.println("내용: " + mr.getParameter("content") + "<br/>");

		if (file != null) {
			out.println("파일 크기: " + (file.length() / 1024) / 1024 + "." + (file.length() / 1024) % 1024
					+ "MB<br/>");
			cDTO.setFilesize((file.length() / 1024) / 1024 + "." + (file.length() / 1024) % 1024 + "MB");
		}
	}

	CloudDAO cDAO = CloudDAO.getInstance();

	cDAO.insert(cDTO);

	response.sendRedirect("mycloud.ws");
%>
