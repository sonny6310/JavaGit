package com.org;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.freeboard.FreeBoardDAO;
import com.org.freeboard.FreeBoardDTO;

@WebServlet(urlPatterns = { "*.ws" }) // ???.ws 로 접속
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	FreeBoardDAO dao = FreeBoardDAO.getInstance();

	public Controller() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StringBuffer a = request.getRequestURL();
		String url = a.toString();
		url = url.substring(url.lastIndexOf("/"));

		if (url.equals("/a.ws")) {
			// WebContent 아래에 jsp 파일을 넣으면 브라우저 주소에 ~/a.jsp 로 접속이 가능하지만, WEB-INF안에 jsp파일을
			// 넣어두면
			// ~/a.jsp 로 접속이 불가능하다. ~/a.ws 로만 접속이 가능하다. <보안 강화>
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/a.jsp");
			request.setAttribute("hello", "this is servlet");
			rd.forward(request, response);
		} else if (url.equals("/b.ws")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/b.jsp");
			rd.forward(request, response);
		} else if (url.equals("/c.ws")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/c.jsp");
			rd.forward(request, response);
		} else if (url.equals("/index.ws")) {
			// jstl 서블릿으로
			List<FreeBoardDTO> list = dao.selectALL();
			request.setAttribute("list", list);

			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/index.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
