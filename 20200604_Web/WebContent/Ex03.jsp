<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.org.Student"%>
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
	<%
		int num=1;
		Student st1 = new Student();
		st1.setGender("남");
		st1.setStu_number(num++);
		st1.setRemark("이름모름");
		
		Student st2 = new Student();
		st2.setGender("여");
		st2.setStu_number(num++);
		st2.setRemark("누구?");
		
		ArrayList<Student> al = new ArrayList<>();
		al.add(0, st1);
		al.add(1, st2);
// 		al.remove(1);  // 1번째 arraylist 지움
// 		al.clear();  // 클리어

		for(Object st : al){
			st = (Student)st;
			System.out.println(st);
		}
	
		System.out.println("-------------------------");
		
		Iterator<Student> itt = al.iterator();
		while(itt.hasNext()){
			System.out.println(itt.next());
		}
	%>
	<ul class="list-group">
	<%
		for(Student student : al){
	%>
		<li class="list-group-item list-group-item-success"><%out.println(student);%></li>
	<%
		}
		for(int i=0; i<al.size(); i++){
			Student student = (Student) al.get(i);
	%>
		<li class="list-group-item list-group-item-warning"><%out.println(student);%></li>
	<%
		}
	%>
	</ul>
</body>
</html>