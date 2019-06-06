<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Expenses Page</title>
</head>
<jsp:include page="/WEB-INF/jsp/header.jsp"></jsp:include>
<p align="right">Logged in as <% out.println(session.getAttribute("user")); %></p>
<body>
	<br><br>
		<h2 align="center">Expenses List</h2>
		<div>
		<table align="center" border="1">
			<tr>
				<th>ExpenseId</th>
				<th>ExpenseType</th>
				<th>ExpenseAmount</th>
			</tr>
			<c:forEach items="${expenseList}" var="expense">
				<tr>
					<td>${expense.id}</td>
					<td>${expense.expensetype}</td>
					<td>${expense.expenseamount}</td>
				</tr>
			</c:forEach>
		</table>
		</div><br><br>
		<div>
			<center>
				<a href="${pageContext.request.contextPath}/processExpenses?action=add">Add Expense List</a>
			</center>
		</div>
</body>
<jsp:include page="/WEB-INF/jsp/footer.jsp"></jsp:include>
</html>