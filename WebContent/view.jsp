<%@page import="model.bean.User"%>
<%@page import="model.bean.Book"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" cellpadding="15" cellspacing="0" >
		<tr>
			<th>ten sach</th>
			<th>nha sx</th>
			<th>nam xb</th>
			<th>so luong</th>
		</tr>

		<%
			User u = new User();
			u = (User) request.getSession().getAttribute("user");
			if (u == null) {
				out.print("Login first!!");
				request.getRequestDispatcher("login.jsp");
			} else {
				ArrayList<Book> arr = new ArrayList<>();
				arr = (ArrayList<Book>) request.getSession().getAttribute("arr");

				for (Book b : arr) { // đầu for
		%>
		<tr>
			<td><%=b.getTensach()%></td>
			<td><%=b.getNhaxb()%></td>
			<td><%=b.getNamsx()%></td>
			<td><%=b.getSoluong()%></td>
		</tr>

		<%
			} // của for

			} // của else
		%>
	</table>
	<a href="main.jsp">GO TO HOME</a>
</body>
</html>