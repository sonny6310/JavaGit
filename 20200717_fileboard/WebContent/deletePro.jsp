<%@page import="java.io.File"%>
<%@page import="com.file.FileBoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- D:\2020java\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\현재 프로젝트명\upload : 저장되는 경로 -->
<%
	String[] cks = request.getParameterValues("ck");

	FileBoardDAO dao = FileBoardDAO.getInstance();
	dao.deleteFileBoard(cks);
	
	response.sendRedirect("index.jsp");
%>