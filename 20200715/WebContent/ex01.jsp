<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- 
		<%! %> : 전역변수 / 메소드 선언에 사용 
	    <%  %> : 프로그래밍 코드 기술에 사용
		<%= %> : 화면에 출력할 내용 기술에 사용 (out.println 대신). ;쓰면 에러발생
	--%>
	
<%-- 서블릿파일 위치 D:\2020java\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\work\Catalina\localhost\20200715\org\apache\jsp --%>

	<%!String a = "a"; // 전역변수. 클래스변수로 빠짐. 서블릿코드로 변환되었을 때 클래스 최상단에 작성됨.

	public void doA() {
		System.out.println("a = " + a);
	}%>
	<%
		String b = "b"; // 지역변수
	%>
	<%=a%>
	<%=b%>
	<%
		doA();
	%>
</body>
</html>