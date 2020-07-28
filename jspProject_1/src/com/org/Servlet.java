package com.org;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "*.ws" })
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Servlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StringBuffer a = request.getRequestURL();
		String url = a.toString();
		url = url.substring(url.lastIndexOf("/"));

		if (url.equals("/index.ws")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/index.jsp");
			rd.forward(request, response);
		} else if (url.equals("/elements.ws")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/elements.jsp");
			rd.forward(request, response);
		} else if (url.equals("/upload.ws")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/upload.jsp");
			rd.forward(request, response);
		} else if (url.equals("/mycloud.ws")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/mycloud.jsp");
			rd.forward(request, response);
		} else if (url.equals("/checkLogin1.ws")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/checkLogin1.jsp");
			rd.forward(request, response);
		} else if (url.equals("/checkLogin2.ws")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/checkLogin2.jsp");
			rd.forward(request, response);
		} else if (url.equals("/checkLogin2.ws")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/checkLogin2.jsp");
			rd.forward(request, response);
		} else if (url.equals("/checkLogin2.ws")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/checkLogin2.jsp");
			rd.forward(request, response);
		} else if (url.equals("/login.ws")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/login.jsp");
			rd.forward(request, response);
		} else if (url.equals("/signup.ws")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/signup.jsp");
			rd.forward(request, response);
		} else if (url.equals("/logout.ws")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/logout.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
