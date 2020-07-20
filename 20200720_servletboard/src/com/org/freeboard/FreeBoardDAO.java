package com.org.freeboard;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.org.util.DataSource;

public class FreeBoardDAO {
	private static FreeBoardDAO dao = new FreeBoardDAO();

	public static FreeBoardDAO getInstance() {
		return dao;
	}

	public List<FreeBoardDTO> selectALL() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<FreeBoardDTO> list = null;

		try {
			conn = DataSource.getConnection();
			pstmt = conn.prepareStatement("select * from freeboard");
			rs = pstmt.executeQuery();

			if (rs.next()) {
				list = new ArrayList<FreeBoardDTO>();
				do {
					list.add(new FreeBoardDTO(rs.getInt("idx"), rs.getString("title"), rs.getString("content"),
							rs.getString("reg_date"), rs.getString("mod_date")));
				} while (rs.next());
			}
		} catch (Exception e) {

		} finally {
			DataSource.doClose(rs, pstmt, conn);
		}

		return list;
	}
}
