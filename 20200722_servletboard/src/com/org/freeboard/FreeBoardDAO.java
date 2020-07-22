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

	public List<FreeBoardDTO> selectALL(int start, int end) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<FreeBoardDTO> list = null;

		try {
			conn = DataSource.getConnection();
			pstmt = conn.prepareStatement(
					"select * from(select Row_Number() over (order by idx desc) rownum, * from freeboard) A where rownum between ? and ?");
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
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

	public void insertFreeBoard(FreeBoardDTO dto) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		conn = DataSource.getConnection();

		pstmt = conn.prepareStatement("exec PRO_SEQS 'FREE_BOARD_SEQ'");
		pstmt.setEscapeProcessing(true);
		rs = pstmt.executeQuery();

		int idx = 0;
		if (rs.next()) {
			idx = rs.getInt("value");
		}

		pstmt = conn.prepareStatement(
				"insert into freeboard(idx,title,content,reg_date,mod_date) values (?,?,?,getdate(),getdate())");
		pstmt.setInt(1, idx);
		pstmt.setString(2, dto.getTitle());
		pstmt.setString(3, dto.getContent());
		pstmt.executeUpdate();

		DataSource.doClose(rs, pstmt, conn);
	}

	public void deleteAll(String[] idx) throws Exception {
		String idxs = "";
		for (int i = 0; i < idx.length; i++) {
			if ((idx.length - 1) == i)
				idxs += idx[i];
			else
				idxs += idx[i] + ",";
		}
		Connection conn = null;
		PreparedStatement pstmt = null;

		conn = DataSource.getConnection();
		pstmt = conn.prepareStatement("delete from freeboard where idx in ( " + idxs + " ) ");
		pstmt.executeUpdate();

		DataSource.doClose(null, pstmt, conn);
	}

	public FreeBoardDTO selectOne(String idx) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		FreeBoardDTO dto = null;

		try {
			conn = DataSource.getConnection();
			pstmt = conn.prepareStatement("select * from freeboard where idx = ?");
			pstmt.setInt(1, Integer.parseInt(idx));
			rs = pstmt.executeQuery();

			if (rs.next()) {
				dto = new FreeBoardDTO(rs.getInt("idx"), rs.getString("title"), rs.getString("content"),
						rs.getString("reg_date"), rs.getString("mod_date"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DataSource.doClose(rs, pstmt, conn);
		}

		return dto;
	}

	public void updateFreeBoard(FreeBoardDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DataSource.getConnection();
			pstmt = conn.prepareStatement("update freeboard set title=?, content=?, mod_date=getdate() where idx = ?");
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getContent());
			pstmt.setInt(3, dto.getIdx());

			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DataSource.doClose(null, pstmt, conn);
		}
	}

	public int selectPageCount() {	
		int textCount = selectTextCount();
		int pageCount = textCount/10;
		if(textCount%10 > 0) {
			pageCount += 1;
		}
		
		return pageCount;
	}

	public int selectTextCount() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		int textCount = 0;
		try {
			conn = DataSource.getConnection();
			pstmt = conn.prepareStatement("select count(*) textCount from freeboard;");
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				textCount = rs.getInt("textCount");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DataSource.doClose(rs, pstmt, conn);
		}
		
		return textCount;
	}
}
