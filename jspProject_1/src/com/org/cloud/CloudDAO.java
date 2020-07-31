package com.org.cloud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.org.value.ConValues;

public class CloudDAO {
	private static CloudDAO cDAO = new CloudDAO();

	public static CloudDAO getInstance() {
		return cDAO;
	}

	public Connection getConnection() {
		Connection conn = null;

		try {
			Class.forName(ConValues.sqlClass);
			conn = DriverManager.getConnection(ConValues.sqlUrl, ConValues.sqlUser, ConValues.sqlPass);
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

	public void insert(CloudDTO cDTO) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("insert into CloudBoard(id,title,content,filename,filesize,reg_date) values (?,?,?,?,?,getdate());");
			pstmt.setString(1, cDTO.getId());
			pstmt.setString(2, cDTO.getTitle());
			pstmt.setString(3, cDTO.getContent());
			pstmt.setString(4, cDTO.getFilename());
			pstmt.setString(5, cDTO.getFilesize());
			pstmt.executeUpdate();
			
			System.out.println("insert완료");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("insert실패");
		} finally {
			doClose(null, pstmt, conn);
		}
	}
}
