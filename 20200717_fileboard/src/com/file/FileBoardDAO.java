package com.file;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FileBoardDAO {

	private static FileBoardDAO dao = new FileBoardDAO();

	public static FileBoardDAO getInstance() {
		return dao;
	}

	public Connection getConnection() {
		Connection conn = null;

		try {
			Class.forName(CVALUES.sqlClass);
			conn = DriverManager.getConnection(CVALUES.sqlUrl, CVALUES.sqlUser, CVALUES.sqlPass);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}

	public void doClose(ResultSet rs, PreparedStatement pstmt, Connection conn) {
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

	public void insertFileBoard(FileBoardDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		int idx = 0;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("exec PRO_SEQS 'FILE_BOARD_SEQ'");
			pstmt.setEscapeProcessing(true); // 프로시저를 실행할 때 필요!
			rs = pstmt.executeQuery();

			if (rs.next()) {
				idx = rs.getInt("value");
			}

			pstmt = conn.prepareStatement("insert into fileboard(title,content,filename,idx) values(?,?,?,?)");
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getContent());
			pstmt.setString(3, dto.getFilename());
			pstmt.setInt(4, idx);
			pstmt.executeUpdate();

			System.out.println("insert완료");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("insert실패");
		} finally {
			doClose(rs, pstmt, conn);
		}
	}

	public List<FileBoardDTO> selectAllFileBoard() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<FileBoardDTO> dtolist = null;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select * from fileboard order by idx desc");
			rs = pstmt.executeQuery();

			if (rs.next()) {
				dtolist = new ArrayList<FileBoardDTO>();
				do {
					dtolist.add(new FileBoardDTO(rs.getString("title"), rs.getString("content"),
							rs.getString("filename"), rs.getInt("idx")));
				} while (rs.next());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			doClose(rs, pstmt, conn);
		}

		return dtolist;
	}

	public void deleteFileBoard(String[] cks) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		String deleteIdxs = "";

		for (int i = 0; i < cks.length; i++) {
			if (i == (cks.length - 1)) {
				deleteIdxs = deleteIdxs + "" + cks[i];
			} else {
				deleteIdxs = deleteIdxs + "" + cks[i] + ",";
			}
		}

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("delete from fileboard where idx in(" + deleteIdxs + ");");
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			doClose(null, pstmt, conn);
		}
	}

	public void updateFileBoard(FileBoardDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("update fileboard set title = ?, content = ? where idx = ?");
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getContent());
			pstmt.setInt(3, dto.getIdx());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			doClose(null, pstmt, conn);
		}
	}
}
