import java.sql.Connection;   // 연결 유지 객체
import java.sql.DriverManager;
import java.sql.PreparedStatement;   // sql 담는 객체
import java.sql.ResultSet;   // table 내용 담는 객체
import java.util.Scanner;

public class Ex05 {
	Ex05(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("a의 값: ");
		String a = scan.nextLine();
		System.out.println("b의 값: ");
		String b = scan.nextLine();
		
		try {
			// 예외가 나오는지 관찰하는 영역
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 찾아서 있으면 예외 발생하지 않음
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","1234");
			
			pstmt = conn.prepareStatement("insert into test"+"(aa,bb)"+"values"+"('"+a+"','"+b+"')"); // 실행할 때 마다 value가 등록된다.
			
			pstmt.executeUpdate(); // insert update delete는 executeUpdate로 실행
			
			System.out.println("정상적으로 DB연결 성공");
			
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
		new Ex05();
	}
}
