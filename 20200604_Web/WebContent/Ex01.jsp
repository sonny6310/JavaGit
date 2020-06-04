<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.org.MyOracle" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
MyOracle mo = new MyOracle();
String msg = mo.doUpdate();
out.println(msg);

// Connection conn = null; // DB연결 유지 객체
// PreparedStatement pstmt = null; // SQL문 작성해여 가지고있는 객체

// try{
// 	Class.forName("oracle.jdbc.driver.OracleDriver"); // Class ojdbc6.jar 파일 안에 있는 Driver class 찾기
// 	conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","1234");
	
// 	pstmt = conn.prepareStatement("insert into student"+"(stu_number,gender,remark)"+"values"+"(?,?,?)");
// 	pstmt.setInt(1,1); // 첫번째 물음표에는 a를 넣어라
// 	pstmt.setString(2,"남자"); // 두번째 물음표에 b를 넣어라
// 	pstmt.setString(3,"이름이 뭐더라?"); // 두번째 물음표에 b를 넣어라
// 	pstmt.executeUpdate(); // insert update delete는 executeUpdate로 실행

// 	System.out.println("정상적으로 DB연결 성공");
// 	out.println("정상적으로 insert 성공");
// }catch(Exception e){
// 	e.printStackTrace();
// }

%>
</body>
</html>