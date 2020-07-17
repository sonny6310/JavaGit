package com.org;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "*.ws" }) // ???.ws 로 접속
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Controller() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StringBuffer a = request.getRequestURL();
		String url = a.toString();
		url = url.substring(url.lastIndexOf("/"));

		if (url.equals("/a.ws")) {
			RequestDispatcher rd = request.getRequestDispatcher("a.jsp");
			request.setAttribute("hello", "this is servlet");
			rd.forward(request, response);
		} else if (url.equals("/b.ws")) {
			RequestDispatcher rd = request.getRequestDispatcher("b.jsp");
			rd.forward(request, response);
		} else if (url.equals("/c.ws")) {
			RequestDispatcher rd = request.getRequestDispatcher("b.jsp");
			rd.forward(request, response);
		}

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
