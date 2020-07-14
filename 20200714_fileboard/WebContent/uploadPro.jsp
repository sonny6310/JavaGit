<%@page import="com.file.FileBoardDAO"%>
<%@page import="com.file.FileBoardDTO"%>
<%@page import="java.util.Enumeration"%>
<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- D:\2020java\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\20200714_fileboard\upload : 저장되는 경로 -->
<%
	String filepath = application.getRealPath("/upload/");

	FileBoardDTO fdto = new FileBoardDTO();
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
		
		fdto.setFilename(filename);
		fdto.setTitle(mr.getParameter("title"));
		fdto.setContent(mr.getParameter("content"));

		out.println("파라미터 이름: " + name + "<br/>");
		out.println("실제 파일 이름: " + original + "<br/>");
		out.println("저장된 파일 이름: " + filename + "<br/>");
		out.println("파일 타입: " + type + "<br/>");

		if (file != null) {
			out.println("파일 크기: " + (file.length() / 1024) / 1024 + "." + (file.length() / 1024) % 1024
					+ "MB<br/>");
		}
	}

	FileBoardDAO fbd = new FileBoardDAO();

	fbd.insertFileBoard(fdto);
%>
