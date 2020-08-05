package com.org;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.org.cloud.CloudDAO;
import com.org.cloud.CloudDTO;
import com.org.member.MemberDAO;
import com.org.member.MemberDTO;

@WebServlet(urlPatterns = { "*.ws" })
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	MemberDAO mDAO = MemberDAO.getInstance();
	CloudDAO cDAO = CloudDAO.getInstance();

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
		} else if (url.equals("/upload.ws")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/upload.jsp");
			rd.forward(request, response);
		} else if (url.equals("/mycloud.ws")) {
			String pageNum = request.getParameter("pageNum");
			if (pageNum == null) {
				pageNum = "1";
			}

			int ipageNum = Integer.parseInt(pageNum) * 5 - 4;
			int lpageNum = ipageNum + 4;

			HttpSession session = request.getSession();
			String id = (String) session.getAttribute("signedUser");

			int pageCount = cDAO.selectPageCount(id);
			request.setAttribute("pageCount", pageCount);

			// jstl 서블릿으로
			List<CloudDTO> list = cDAO.selectAll(id, ipageNum, lpageNum);
			request.setAttribute("list", list);

			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/mycloud.jsp");
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
		} else if (url.equals("/signupPro.ws")) {
			try {
				request.setCharacterEncoding("UTF-8");
				String id = request.getParameter("id");
				String pw = request.getParameter("pw");
				String name = request.getParameter("name");
				String email = request.getParameter("email");
				int x = 0;

				MemberDTO mDTO = new MemberDTO(id, pw, name, email);
				x = mDAO.regist(mDTO);

				if (x == 1) {
					response.setContentType("text/html;charset=utf-8");
					PrintWriter out = response.getWriter();
					out.println("<script>alert('회원가입 완료'); window.location = \"index.ws\";</script>");
					out.flush();
					out.close();
				} else {
					response.setContentType("text/html;charset=utf-8");
					PrintWriter out = response.getWriter();
					out.println("<script>alert('회원가입에 실패하였습니다'); history.go(-1); </script>");
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
					out.println("<script>alert('로그인 완료'); window.location = \"index.ws\";</script>");
					out.flush();
					out.close();
				} else {
					response.setContentType("text/html;charset=utf-8");
					PrintWriter out = response.getWriter();
					out.println("<script>alert('로그인에 실패하였습니다'); history.go(-1); </script>");
					out.flush();
					out.close();
				}
			} catch (Exception e) {

			}
		} else if (url.equals("/checkID.ws")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/checkID.jsp");
			rd.forward(request, response);
		} else if (url.equals("/uploadPro.ws")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/uploadPro.jsp");
			rd.forward(request, response);
		} else if (url.equals("/content.ws")) {
			CloudDTO cDTO = cDAO.selectOne(request.getParameter("reg_date"));
			request.setAttribute("cDTO", cDTO);

			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/content.jsp");
			rd.forward(request, response);
		} else if (url.equals("/download.ws")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/download.jsp");
			rd.forward(request, response);
		} else if (url.equals("/deletePro.ws")) {
			String realpath = request.getSession().getServletContext().getRealPath("/upload/");

			request.setCharacterEncoding("UTF-8");
			String title = request.getParameter("title");
			String reg_date = request.getParameter("reg_date");

			if (title == null || reg_date == null) {
				response.setContentType("text/html;charset=utf-8");
				PrintWriter out = response.getWriter();
				out.println("<script>alert('삭제를 실패하였습니다'); history.go(-1); </script>");
				out.flush();
				out.close();
			} else {
				int x = cDAO.deleteCloudBoard(title, reg_date, realpath);
				if (x == 1) {
					response.setContentType("text/html;charset=utf-8");
					PrintWriter out = response.getWriter();
					out.println("<script>alert('삭제가 완료되었습니다'); window.location = \"mycloud.ws\";</script>");
					out.flush();
					out.close();
				} else {
					response.setContentType("text/html;charset=utf-8");
					PrintWriter out = response.getWriter();
					out.println("<script>alert('삭제를 실패하였습니다'); history.go(-1); </script>");
					out.flush();
					out.close();
				}
			}
		} else if (url.equals("/update.ws")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/update.jsp");
			rd.forward(request, response);
		} else if (url.equals("/updatePro.ws")) {
			try {
				request.setCharacterEncoding("UTF-8");
				String title = request.getParameter("title");
				String content = request.getParameter("content");
				String filename = request.getParameter("filename");
				String upload_date = request.getParameter("upload_date");
				String reg_date = request.getParameter("reg_date");
				if (title == null || title.trim().isEmpty() || title.trim().equals("")) {
					response.setContentType("text/html;charset=utf-8");
					PrintWriter out = response.getWriter();
					out.println("<script>alert('글 수정을 실패하였습니다'); history.go(-1); </script>");
					out.flush();
					out.close();
				} else if (content == null || content.trim().equals("") || content.trim().isEmpty()) {
					response.setContentType("text/html;charset=utf-8");
					PrintWriter out = response.getWriter();
					out.println("<script>alert('글 수정을 실패하였습니다'); history.go(-1); </script>");
					out.flush();
					out.close();
				} else {
					int x = cDAO.updateCloudBoard(title, content, filename, upload_date, reg_date);
					if (x == 1) {
						response.setContentType("text/html;charset=utf-8");
						PrintWriter out = response.getWriter();
						out.println("<script>alert('글 수정이 완료되었습니다'); window.location = \"mycloud.ws\";</script>");
						out.flush();
						out.close();
					} else {
						response.setContentType("text/html;charset=utf-8");
						PrintWriter out = response.getWriter();
						out.println("<script>alert('글 수정을 실패하였습니다'); history.go(-1); </script>");
						out.flush();
						out.close();
					}
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
