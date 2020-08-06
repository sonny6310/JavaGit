package com.naver.org;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.naver.org.member.Member;

@Controller
public class HomeController {

	@RequestMapping(value = "/main.ws", method = RequestMethod.GET)
	public String main(Locale locale, Model model, HttpSession session) {
//		UserVO userVO = (UserVO)session.getAttribute("login");
//		if (userVO == null) {
//			model.addAttribute("log", "로그인 안됨");
//		} else {
//			model.addAttribute("log", "로그인 성공!!");
//			model.addAttribute("logininfo", "로그인 한 정보 : ");
//			model.addAttribute("loginemail", userVO);
//		}

		return "site/main";
	}

	@RequestMapping(value = "/Kids.ws", method = RequestMethod.GET)
	public String Kids(Locale locale, Model model, HttpSession session) {

		return "Kids/Kids";
	}

	@RequestMapping(value = "/man2.ws", method = RequestMethod.GET)
	public String man2(Locale locale, Model model, HttpSession session) {

		return "man/man2";
	}

	@RequestMapping(value = "/off.ws", method = RequestMethod.GET)
	public String off(Locale locale, Model model, HttpSession session) {

		return "off_season/off";
	}

	@RequestMapping(value = "/포퍼먼스.ws", method = RequestMethod.GET)
	public String 포퍼먼스(Locale locale, Model model, HttpSession session) {

		return "performance/포퍼먼스";
	}

	@RequestMapping(value = "/women.ws", method = RequestMethod.GET)
	public String women(Locale locale, Model model, HttpSession session) {

		return "women/women";
	}

	@RequestMapping(value = "/login.ws", method = RequestMethod.GET)
	public String login(Locale locale, Model model, HttpSession session) {

		return "login/login";
	}

	@RequestMapping(value = "/logout.ws", method = RequestMethod.GET)
	public String logout(Locale locale, Model model, HttpSession session) {

		session.invalidate();

		return "login/logout";
	}

	@Autowired
	DataSource datasource;

	@RequestMapping(value = "/dstest.ws", method = RequestMethod.GET)
	public String dstest(Locale locale, Model model, HttpSession session) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = datasource.getConnection();
			pstmt = conn.prepareStatement("select * from member");
			rs = pstmt.executeQuery();

			if (rs.next()) {
				do {
					System.out.println(rs.getInt(1));
					System.out.println(rs.getString(2));
					System.out.println(rs.getString(3));
					System.out.println(rs.getString(4));
					System.out.println(rs.getString(5));
				} while (rs.next());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();

				}
				if (pstmt != null) {

					pstmt.close();

				}
				if (rs != null) {

					rs.close();
				}
			} catch (SQLException e) {
			}
		}
		return "dstest";
	}

	@RequestMapping(value = "/dstest2.ws", method = RequestMethod.GET)
	public String dstest2() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(datasource);

		List<Member> list = jdbcTemplate.query("select * from member",
				new org.springframework.jdbc.core.RowMapper<Member>() {
					@Override
					public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
						Member member = new Member(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
								rs.getString(5));
						return member;
					}
				});

		for (Member member : list) {
			System.out.println("member = " + member);
		}

		int rowCnt = jdbcTemplate.queryForObject("select count(*) from member", Integer.class);
		System.out.println("행 개수:" + rowCnt);

		jdbcTemplate.update("update member set password='1234'");
		jdbcTemplate.update("update member set password=? where email=?", "1111", "juny0413@naver.com");

		jdbcTemplate.update(
				"insert into member(email,password,name,regdate) values ('test1@naver.com','1111','kim',now())");
		KeyHolder keyholder = new GeneratedKeyHolder();

		jdbcTemplate.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
				PreparedStatement pstmt = conn.prepareStatement(
						"insert into member(email,password,name,regdate) values ('test2@naver.com','1111','han',now())",
						new String[] { "ID" });
				return pstmt;
			}
		}, keyholder);

		Number keyValue = keyholder.getKey();
		System.out.println("keyValue = " + keyValue);

		return "dstest";
	}

	@RequestMapping(value = "/memberinsert.ws", method = RequestMethod.GET)
	public String memberinsert(Member mb) {
		return "result";
	}

	@RequestMapping(value = "/memberupdate.ws", method = RequestMethod.GET)
	public String memberupdate(Locale locale, Model model, HttpSession session) {
		model.addAttribute("result", "update");
		return "result";
	}

	@RequestMapping(value = "/memberdelete.ws", method = RequestMethod.GET)
	public String memberdelete(Locale locale, Model model, HttpSession session) {
		model.addAttribute("result", "delete");
		return "result";
	}

	@RequestMapping(value = "/memberselect.ws", method = RequestMethod.GET)
	public String memberselect(Locale locale, Model model, HttpSession session) {
		model.addAttribute("result", "select");
		return "result";
	}
	
	@RequestMapping(value = "/member.ws", method = RequestMethod.GET)
	public String member(Locale locale, Model model, HttpSession session) {
		model.addAttribute("result", "insert");
		return "member";
	}
}
