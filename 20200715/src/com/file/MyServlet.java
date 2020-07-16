package com.file;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/a.do")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MyServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());

		// main.jsp에 "a"라는 이름의 Attribute를 set. main.jsp에서 getAttribute("a")로 받으면 "this
		// is a"가 return.
		request.setAttribute("a", "this is a");

		HttpSession session = request.getSession();
		session.setAttribute("b", "this is b");

		// a.do로 요청이 왔을 때는 main.jsp 로 위에 작성된 소스를 실행하고 이동해라.
		RequestDispatcher rd = request.getRequestDispatcher("main.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
