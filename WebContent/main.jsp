<%@page import="model.bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="text-align: center;">
	<h1 style="color:GREEN;">WELCOME TO MY WEBSITE</h1><hr>
	<%
		User u = new User();
		u = (User) request.getSession().getAttribute("user");
		if(u == null) {
			out.print("Login first!!");
			request.getRequestDispatcher("login.jsp");
		}else{
	%>

	<h3>Hello,<%= u.getFullname() %></h3>

	<a href="edit.jsp">Edit</a>
	<a href="View">View</a>
	<a href="Logout">Logout</a>

	<%}%>
</body>
</html>