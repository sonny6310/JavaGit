package com.org.cloud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.org.util.DataSource;
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

	public int insert(CloudDTO cDTO) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int x = 0;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(
					"insert into CloudBoard(id,title,content,filename,filesize,reg_date) values (?,?,?,?,?,getdate());");
			pstmt.setString(1, cDTO.getId());
			pstmt.setString(2, cDTO.getTitle());
			pstmt.setString(3, cDTO.getContent());
			pstmt.setString(4, cDTO.getFilename());
			pstmt.setString(5, cDTO.getFilesize());
			pstmt.executeUpdate();

			x = 1;

		} catch (Exception e) {
			e.printStackTrace();
			x = 0;
		} finally {
			doClose(null, pstmt, conn);
		}

		return x;
	}

	public List<CloudDTO> selectAll(String id, int start, int end) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<CloudDTO> cDTOlist = null;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(
					"select * from(select Row_Number() over (order by idx desc) rownum, * from cloudboard where id=?) A where rownum between ? and ?");
			pstmt.setString(1, id);
			pstmt.setInt(2, start);
			pstmt.setInt(3, end);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				cDTOlist = new ArrayList<CloudDTO>();
				do {
					cDTOlist.add(new CloudDTO(rs.getString("title"), rs.getString("content"), rs.getString("filename"),
							rs.getString("filesize"), rs.getString("reg_date")));
				} while (rs.next());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			doClose(rs, pstmt, conn);
		}

		return cDTOlist;
	}

	public int selectPageCount(String id) {
		int textCount = selectTextCount(id);
		int pageCount = textCount / 5;
		if (textCount % 5 > 0) {
			pageCount += 1;
		}

		return pageCount;
	}

	public int selectTextCount(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		int textCount = 0;
		try {
			conn = DataSource.getConnection();
			pstmt = conn.prepareStatement("select count(*) textCount from cloudboard where id=?");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				textCount = rs.getInt("textCount");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DataSource.doClose(rs, pstmt, conn);
		}

		return textCount;
	}

	public CloudDTO selectOne(String parameter) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		CloudDTO cDTO = null;

		try {
			conn = DataSource.getConnection();
			pstmt = conn.prepareStatement("select * from cloudboard where reg_date = ?");
			pstmt.setString(1, parameter);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				cDTO = new CloudDTO(rs.getString("title"), rs.getString("content"), rs.getString("filename"),
						rs.getString("filesize"), rs.getString("reg_date"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DataSource.doClose(rs, pstmt, conn);
		}

		return cDTO;
	}
}
