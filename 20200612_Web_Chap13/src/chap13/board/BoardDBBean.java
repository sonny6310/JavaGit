package chap13.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDBBean {
	private static BoardDBBean instance = new BoardDBBean();

	// .jsp 페이지에서 DB 연동빈인 BoardDBBean 클래스의 메소드에 접근시 필요
	public static BoardDBBean getInstance() {
		return instance;
	}

	public BoardDBBean() {
	}
	// -------------------------------------------------------------------------------------------------------

	// 게시판 정보 DB등록 (writePro.jsp 페이지에서 사용)
	public void insertArticle(BoardDataBean dataBean) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int num = dataBean.getNum();
		int ref = dataBean.getRef();
		int re_step = dataBean.getRe_step();
		int re_level = dataBean.getRe_level();
		int number = 0;

		// jar파일 관리 회사 : maven(웹) or gradle(앱)
		// Connection 객체 연결 drivermanager.getConnection()
		// prepareStatement 생성 conn.prepareStatement();
		// 실행
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			// mysql: 3306, oracle: 1521, sqlserver: 1433
			conn = DriverManager.getConnection("jdbc:sqlserver://192.168.0.200:1433;databasename=jh_20200611", "sa",
					"8765432!");

			pstmt = conn.prepareStatement("select max(num) from board");
			rs = pstmt.executeQuery();
			if (rs.next()) {
				number = rs.getInt(1) + 1;
			} else {
				number = 1;
			}

			if (num != 0) {
				pstmt = conn.prepareStatement("update board set re_step = re_step+1 where ref = ? and re_step > ?");
				pstmt.setInt(1, ref);
				pstmt.setInt(2, re_step);
				pstmt.executeUpdate();
				re_step = re_step + 1;
				re_level = re_level + 1;
			} else {
				ref = number;
				re_step = 0;
				re_level = 0;
			}

			pstmt = conn.prepareStatement(
					"insert into board" + "(num,writer,email,subject,passwd,reg_date,ref,re_step,re_level,content,ip)"
							+ "values" + "(?,?,?,?,?,?,?,?,?,?,?)");
			pstmt.setInt(1, number);
			pstmt.setString(2, dataBean.getWriter());
			pstmt.setString(3, dataBean.getEmail());
			pstmt.setString(4, dataBean.getSubject());
			pstmt.setString(5, dataBean.getPasswd());
			pstmt.setTimestamp(6, dataBean.getReg_date());
			pstmt.setInt(7, dataBean.getRef());
			pstmt.setInt(8, dataBean.getRe_step());
			pstmt.setInt(9, dataBean.getRe_level());
			pstmt.setString(10, dataBean.getContent());
			pstmt.setString(11, dataBean.getIp());
			pstmt.executeUpdate();
			System.out.println("insert완료");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("insert실패");
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
				}
		}
	}
	// -------------------------------------------------------------------------------------------------------

	// board 테이블에 저장된 전체 글 수 얻어냄 (list.jsp에서 사용)
	public int getArticleCount() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		int x = 0;

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			// mysql: 3306, oracle: 1521, sqlserver: 1433
			conn = DriverManager.getConnection("jdbc:sqlserver://192.168.0.200:1433;databasename=jh_20200611", "sa",
					"8765432!");
			pstmt = conn.prepareStatement("select count(*) from board");
			rs = pstmt.executeQuery();

			if (rs.next()) {
				x = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return x;
	}

	// 글의 목록을 가져옴 (list.jsp에서 사용)
	public List<BoardDataBean> getArticles(int start, int end) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<BoardDataBean> articleList = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			// mysql: 3306, oracle: 1521, sqlserver: 1433
			conn = DriverManager.getConnection("jdbc:sqlserver://192.168.0.200:1433;databasename=jh_20200611", "sa",
					"8765432!");
			pstmt = conn.prepareStatement("select * from board order by ref desc, re_step asc");
			rs = pstmt.executeQuery();

			if (rs.next()) {
				articleList = new ArrayList<BoardDataBean>(end);
				do {
					BoardDataBean dataBean = new BoardDataBean();
					dataBean.setNum(rs.getInt("num"));
					dataBean.setWriter(rs.getString("writer"));
					dataBean.setEmail(rs.getString("email"));
					dataBean.setSubject(rs.getString("subject"));
					dataBean.setPasswd(rs.getString("passwd"));
					dataBean.setReg_date(rs.getTimestamp("reg_date"));
					dataBean.setReadcount(rs.getInt("readcount"));
					dataBean.setRef(rs.getInt("ref"));
					dataBean.setRe_step(rs.getInt("re_step"));
					dataBean.setRe_level(rs.getInt("re_level"));
					dataBean.setContent(rs.getString("content"));
					dataBean.setIp(rs.getString("ip"));

					articleList.add(dataBean);
				} while (rs.next());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
				}
		}
		return articleList;
	}
	// -------------------------------------------------------------------------------------------------------

	// 글 내용 보기 (content.jsp에서 사용)
	public BoardDataBean getArticle(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardDataBean dataBean = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			// mysql: 3306, oracle: 1521, sqlserver: 1433
			conn = DriverManager.getConnection("jdbc:sqlserver://192.168.0.200:1433;databasename=jh_20200611", "sa",
					"8765432!");
			pstmt = conn.prepareStatement("update board set readcount=readcount+1 where num=?");
			pstmt.setInt(1, num);
			pstmt.executeUpdate();

			if (rs.next()) {
				dataBean = new BoardDataBean();
				dataBean.setNum(rs.getInt("num"));
				dataBean.setWriter(rs.getString("writer"));
				dataBean.setEmail(rs.getString("email"));
				dataBean.setSubject(rs.getString("subject"));
				dataBean.setPasswd(rs.getString("passwd"));
				dataBean.setReg_date(rs.getTimestamp("reg_data"));
				dataBean.setReadcount(rs.getInt("readcount"));
				dataBean.setRef(rs.getInt("ref"));
				dataBean.setRe_step(rs.getInt("re_step"));
				dataBean.setRe_level(rs.getInt("re_level"));
				dataBean.setContent(rs.getString("content"));
				dataBean.setIp(rs.getString("ip"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
				}
		}
		return dataBean;
	}

}
