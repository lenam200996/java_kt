<%@page import="model.bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Edit">
		<%
			User u = new User();
			u = (User) request.getSession().getAttribute("user");
			if (u == null) {
				out.print("Login first!!");
				request.getRequestDispatcher("login.jsp");
			} else {
		%>
		<h3>EDIT PROFILE</h3>
		<h4>Username:<%=u.getUsername().trim()%></h4>
		<input type="text" value="<%= u.getFullname().trim() %>"name="fullname">
		<input type="submit" value="Edit">
	</form>
	<%
		}
	%>
<a href="main.jsp">GO TO HOME</a>
</body>
</html>