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
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<body>
 	<div class="container">
 		<nav class="navbar navbar-inverse">
  			<div class="container-fluid">
    			<div class="navbar-header">
      					<a class="navbar-brand" href="#">JSP ORACLE</a>
    			</div>
    			<ul class="nav navbar-nav">
      				<li><a href="select.jsp">SELECT</a></li>
      				<li><a href="insert.jsp">INSERT</a></li>
      				<li><a href="update.jsp">UPDATE</a></li>
      			<li><a href="delete.jsp">DELETE</a></li>
    			</ul>
  			</div>
		</nav>
		<div class="jumbotron">
  			<h1>Insert !!!</h1>
		</div>
		<div class="container">
  			<p>
  				<form action="insert.jsp">
					A: <input type="text" name="A">
					B: <input type="text" name="B">
					C: <input type="text" name="C">
					D: <input type="text" name="D">
					E: <input type="text" name="E">
					<input type="submit" value="insert 하기">
				</form>
				<% 
  					String a = request.getParameter("A");
  					String b = request.getParameter("B");
  					String c = request.getParameter("C");
  					String d = request.getParameter("D");
  					String e = request.getParameter("E");
  					
  					Connection conn = null;
  					PreparedStatement pstmt = null;
  					
  					if(c != null || d != null || d != null){
  						try{
  								Class.forName("oracle.jdbc.driver.OracleDriver");
  								conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","1234");
  					
  								pstmt = conn.prepareStatement("insert into STUDY01"+"(A,B,C,D,E)"+"values"+"(?,?,?,?,?)");
  								pstmt.setInt(1, Integer.parseInt(a));
  								pstmt.setInt(2, Integer.parseInt(b));
  								pstmt.setString(3, c);
  								pstmt.setString(4, d);
  								pstmt.setString(5, e);
  								pstmt.executeUpdate();
  								out.println("insert 완료");
  						}catch(Exception E){
  							E.printStackTrace();
  							out.println("insert 실패");
  						}finally {
  							// 예외가 발생하든 함수가 종료되든 무조건 실행하는 영역
  							try {
  								if(conn!=null) {
  									conn.close();
  								}
  								if(pstmt!=null) {
  									pstmt.close();
  								}
  							}catch(Exception E) {}
  						}
  					}
  				%>
			</p>  			
		</div>
	</div>
</body>
</html>