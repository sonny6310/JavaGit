package com.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

public class Oracle {
	public static List doSelect() {
		List<STUDY01> list = new ArrayList<>();
		
		System.out.println("doSelect");
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","1234");
			pstmt = conn.prepareStatement("select * from STUDY01");
			rs = pstmt.executeQuery(); // select는 executeQuery();
			while(rs.next()) {
				int A = rs.getInt(1);
				int B = rs.getInt(2);
				String C = rs.getString(3);
				String D = rs.getString(4);
				String E = rs.getString(5);
				list.add(new STUDY01(A,B,C,D,E));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) 
					rs.close();
				if(pstmt!=null) 
					pstmt.close();
				if(conn!=null) 
					conn.close();
			}catch (Exception e) {
				
			}
		}
		return list;
	}
	public static String doDelete() {
		System.out.println("doDelete");
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","1234");
			pstmt = conn.prepareStatement("DELETE FROM STUDY01");
			pstmt.executeUpdate(); 
		}catch(Exception e){
			e.printStackTrace();
		}
		return "정상적으로 Delete 완료";
	}
	public static String doUpdate() {
		System.out.println("doUpdate");
		Connection conn = null;
		PreparedStatement pstmt = null;

		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","1234");
			pstmt = conn.prepareCall("update STUDY01 set A = 2");
			pstmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
		return "정상적으로 Update 완료";
		// 만약 update가 안된다면 commit후에 새로 해보자.
		// update가 안되고 로딩중 => 강제종료 == 수정이 완료되지않음
		// 수정되지 않은 채로 종료, 즉 수정 중인 채로 유지 중이므로 다른 누군가가 변경하는 것을 막음
		// commit으로 현 작업을 완전히 종료시킨 후에 update.
	}
}