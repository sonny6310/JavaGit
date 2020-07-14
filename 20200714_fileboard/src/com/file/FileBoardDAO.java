package com.file;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FileBoardDAO {
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
		
		int idx=0;
		
		try {
			Class.forName(CVALUES.sqlClass);
			conn = DriverManager.getConnection(CVALUES.sqlUrl, CVALUES.sqlUser, CVALUES.sqlPass);
			pstmt = conn.prepareStatement("exec PRO_SEQS 'FILE_BOARD_SEQ'");
			pstmt.setEscapeProcessing(true); // 프로시저를 실행할 때 필요!
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
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
			doClose(rs,pstmt,conn);
		}
	}
}
