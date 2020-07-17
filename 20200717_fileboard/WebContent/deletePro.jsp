<%@page import="com.file.FileBoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String[] cks = request.getParameterValues("ck");

	FileBoardDAO dao = FileBoardDAO.getInstance();
	dao.deleteFileBoard(cks);
	
	
	response.sendRedirect("index.jsp");
%>