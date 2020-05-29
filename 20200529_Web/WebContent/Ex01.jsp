<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="Ex01.jsp">
A: <input type="text" name="A">
B: <input type="text" name="B">
<input type="submit" value="insert 하기">
<!-- submit버튼을 누르면 Ex01.jsp 에 들어가게 됨 -->
</form>

<%
	String a = request.getParameter("A"); // A input에 내용입력하고 제출하면 주소에 값 입력되는데, 그 값을 가져옴
	String b = request.getParameter("B"); // B input에 내용입력하고 제출하면 주소에 값 입력되는데, 그 값을 가져옴
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	if(a != null || b != null){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","1234");
			pstmt = conn.prepareStatement("insert into test"+"(aa,bb)"+"values"+"(?,?)");
			pstmt.setString(1,a); // 첫번째 물음표에는 a를 넣어라
			pstmt.setString(2,b); // 두번째 물음표에 b를 넣어라
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
			}catch(Exception e) {}
		}
	}
%>
</body>
</html>