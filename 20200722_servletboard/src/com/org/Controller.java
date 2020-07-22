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

		if (url.equals("/index.ws")) {
			String pageNum = request.getParameter("pageNum");
			if (pageNum == null) {
				pageNum = "1";
			}
			
			int ipageNum = Integer.parseInt(pageNum) * 10 - 9;
			int lpageNum = ipageNum + 9;
			
			int pageCount = dao.selectPageCount();
			request.setAttribute("pageCount", pageCount);
			
			int textNum = dao.selectTextCount();
			request.setAttribute("textNum", textNum);
			
			int textCount = dao.selectTextCount();
			for (int i = 1; i <= pageCount; i++) {
				if(Integer.parseInt(pageNum) == i) {
					request.setAttribute("textCount", textCount-10*(i-1));				
				}
			}
			
			// jstl 서블릿으로
			List<FreeBoardDTO> list = dao.selectALL(ipageNum, lpageNum);
			request.setAttribute("list", list);

			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/index.jsp");
			rd.forward(request, response);
		} else if (url.equals("/insert.ws")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/insert.jsp");
			rd.forward(request, response);
		} else if (url.equals("/insertPro.ws")) {
			RequestDispatcher rd = null;
			try {
				request.setCharacterEncoding("UTF-8");
				FreeBoardDTO dto = new FreeBoardDTO(0, request.getParameter("title"), request.getParameter("content"),
						null, null);
				dao.insertFreeBoard(dto);

				response.sendRedirect("index.ws");
			} catch (Exception e) {
				rd = request.getRequestDispatcher("");
				rd.forward(request, response);
			}
		} else if (url.contentEquals("/delete.ws")) {
			String[] idx = request.getParameterValues("idx");

			try {
				dao.deleteAll(idx);
			} catch (Exception e) {
				e.printStackTrace();
			}

			response.sendRedirect("index.ws");
		} else if (url.contentEquals("/update.ws")) {

			FreeBoardDTO dto = dao.selectOne(request.getParameter("idx"));
			request.setAttribute("dto", dto);

			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/update.jsp");
			rd.forward(request, response);
		} else if (url.contentEquals("/updatePro.ws")) {
			request.setCharacterEncoding("UTF-8");
			FreeBoardDTO dto = new FreeBoardDTO(Integer.parseInt(request.getParameter("idx")),
					request.getParameter("title"), request.getParameter("content"), null, null);
			dao.updateFreeBoard(dto);

			response.sendRedirect("index.ws");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
