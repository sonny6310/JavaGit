<%@page import="com.file.FileBoardDAO"%>
<%@page import="com.file.FileBoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");

	String idx = request.getParameter("idx");
	String title = request.getParameter("title");
	String content = request.getParameter("content");	
	
	FileBoardDTO fdto = new FileBoardDTO();
	fdto.setIdx(Integer.parseInt(idx));
	fdto.setTitle(title);
	fdto.setContent(content);
	
	FileBoardDAO dao = FileBoardDAO.getInstance();
	
	dao.updateFileBoard(fdto);
	
	response.sendRedirect("index.jsp");
%>