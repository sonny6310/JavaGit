package com.jh.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jh.dto.AADTO;

@Repository
public class AADAO {

	@Autowired
	BasicDataSource dataSource; // (servlet-context.xml에 있는) class명 끝, id명
	
	@Autowired
	SqlSession sqlSession;

	public List<AADTO> select() {
		System.out.println("select");
		List<AADTO> list = sqlSession.selectList("aa.getaa");
//		for (AADTO aadto : list) {
//			System.out.println("aadto = " + aadto.toString());
//		}
		return list;
	}

	public void insert() {
		System.out.println("insert");

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = dataSource.getConnection(); // dataSource 자료형에 connection 커넥션 가져오기
			pstmt = conn.prepareStatement("insert into aa(bb) values ('테스트중입니다.');");
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close(); // 이거는 pstmt 끊는거 맞음
				conn.close(); // connection을 dataSource 자료형에 반환하는 것. db연결을 끊는 것이 아님
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
