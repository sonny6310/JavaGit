import java.sql.Connection;   // 연결 유지 객체
import java.sql.DriverManager;
import java.sql.PreparedStatement;   // sql 담는 객체
import java.sql.ResultSet;   // table 내용 담는 객체

public class Ex06 {
	Ex06(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			// 예외가 나오는지 관찰하는 영역
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 찾아서 있으면 예외 발생하지 않음
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","1234");
			
			pstmt = conn.prepareStatement("select * from test");
			rs = pstmt.executeQuery(); // select는 executeQuery로 실행
			
			System.out.println("정상적으로 DB연결 성공");
			
//			rs현재 0행
			
//			rs.next();  // 1행
//			System.out.println("[1]rs.getString(1) = "+rs.getString(1));   // 1열
//			System.out.println("[1]rs.getString(2) = "+rs.getString(2));   // 2열
//			
//			rs.next();  // 2행
//			System.out.println("[2]rs.getString(1) = "+rs.getString(1));   // 1열
//			System.out.println("[2]rs.getString(2) = "+rs.getString(2));   // 2열
			
			// rs.next() : 넘어온 행에 값이 있으면 true, 없으면 false
			int i=1;
			while(rs.next()) {
				System.out.println(i+"행 1열 = "+rs.getString(1));
				System.out.println(i+"행 2열 = "+rs.getString(2));
				i++;
			}

		}catch(Exception e) {
			// 예외 발생했을 시 처리하는 영역
			e.printStackTrace();
		}finally {
			// 예외가 발생하든 함수가 종료되든 무조건 실행하는 영역
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
			}catch(Exception e) {}
		}
	}
	public static void main(String[] args) {
		new Ex06();
	}
}