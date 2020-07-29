package com.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.org.member.MemberDAO;
import com.org.member.MemberDTO;

@WebServlet(urlPatterns = { "*.ws" })
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	MemberDAO mDAO = MemberDAO.getInstance();

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
			HttpSession session = request.getSession();
			session.invalidate();

			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('로그아웃 완료.'); window.location = \"index.ws\";</script>");
			out.flush();
			out.close();
		} else if (url.equals("/signupPro.ws")) {
			try {
				request.setCharacterEncoding("UTF-8");
				MemberDTO mDTO = new MemberDTO(request.getParameter("id"), request.getParameter("pw"),
						request.getParameter("name"), request.getParameter("email"));
				int x = mDAO.regist(mDTO);
				if (x == 1) {
					response.setContentType("text/html;charset=utf-8");
					PrintWriter out = response.getWriter();
					out.println("<script>alert('회원가입 완료.'); window.location = \"index.ws\";</script>");
					out.flush();
					out.close();
				} else {
					response.setContentType("text/html;charset=utf-8");
					PrintWriter out = response.getWriter();
					out.println("<script>alert('회원가입에 실패하였습니다.'); history.go(-1); </script>");
					out.flush();
					out.close();
				}
			} catch (Exception e) {

			}
		} else if (url.equals("/loginPro.ws")) {
			try {
				request.setCharacterEncoding("UTF-8");
				String id = request.getParameter("id");
				String pw = request.getParameter("pw");
				int x = mDAO.login(id, pw);
				if (x == 1) {
					HttpSession session = request.getSession();
					session.setAttribute("signedUser", id);

					response.setContentType("text/html;charset=utf-8");
					PrintWriter out = response.getWriter();
					out.println("<script>alert('로그인 완료.'); window.location = \"index.ws\";</script>");
					out.flush();
					out.close();
				} else {
					response.setContentType("text/html;charset=utf-8");
					PrintWriter out = response.getWriter();
					out.println("<script>alert('로그인에 실패하였습니다.'); history.go(-1); </script>");
					out.flush();
					out.close();
				}
			} catch (Exception e) {

			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
