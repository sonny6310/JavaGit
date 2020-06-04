package com.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MyOracle {
	public String doUpdate() {
		System.out.println("doUpdate");
		Connection conn = null; // DB연결 유지 객체
		PreparedStatement pstmt = null; // SQL문 작성해여 가지고있는 객체

		try{
			Class.forName("oracle.jdbc.driver.OracleDriver"); // Class ojdbc6.jar 파일 안에 있는 Driver class 찾기
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","1234");
			pstmt = conn.prepareCall("update student set stu_number = 2"); // student 테이블의 stu_number를 2로 바꿔라
			pstmt.executeUpdate(); // insert update delete는 executeUpdate로 실행
		}catch(Exception e){
			e.printStackTrace();
		}
		return "정상적으로 update 완료";
		// 만약 update가 안된다면 commit후에 새로 해보자.
		// update가 안되고 로딩중 => 강제종료 == 수정이 완료되지않음
		// 수정되지 않은 채로 종료, 즉 수정 중인 채로 유지 중이므로 다른 누군가가 변경하는 것을 막음
		// commit으로 현 작업을 완전히 종료시킨 후에 update.
	}
}
