<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:include page="/WEB-INF/jsp/header.jsp"></jsp:include>
<p align="right">Logged in as <% out.println(session.getAttribute("user")); %></p>
<body>
<br><br><br><br><br><br>
<p align="center" style="color: green;"><c:if test="${addStatus == 'true'}">Record Added Successfully </c:if></p>
		<form action="${pageContext.request.contextPath}/processExpenses?action=add" method="post">
			<table border="1" align="center" cellpadding="3px" cellspacing="3px">
				<tr>
					<th>ExpenseType</th>
					<td>
	       			<select name="exptype" id="exp_type"></span>
	       			    <option value=""></option>   
	            		<option value="grocery">Grocery</option>
	            		<option value="current bill">Current bill</option>
	            		<option value="water bill">Water bill</option>
	            		<option value="tv recharge bill">TV Recharge bill</option>
	            		<option value="mobile recharge bill">Mobile Recharge bill</option>
	            		<option value="gas bill">Gas bill</option>
	       			</select>
	    			</td>
				</tr>
				<tr>
				<th>ExpenseAmount</th>
	    		<td class = "select">
	    			<input type="text" name="expamount" id="exp_amt"/>
					<span id='amt' style="display: none; color: red"></span>         
	    		</td>        
				</tr>
				<tr>
				<td>
					<input type="submit" value="Add expense" onclick="return validateAddExpense();">
				</tr>
			</table>
		</form><br>
		<div align = "center">
			<a href="${pageContext.request.contextPath}/processExpenses?action=back">Back to Expense List</a>
		</div>
</body>
<jsp:include page="/WEB-INF/jsp/footer.jsp"></jsp:include>
<script>
	function validateAddExpense() {
		var validForm = true;
		var expenseType = document.getElementById('exp_type').value;
		if (expenseType === '' || expenseType.length === 0 || expenseType === undefined) {
			document.getElementById('type').innerHTML = "";
			document.getElementById('type').style.display = 'block';
			document.getElementById('type').append('please select expense type');
			validForm = false;
		} else {
			document.getElementById('type').style.display = 'none';
		}
		var expenseAmount = document.getElementById('exp_amt').value;
		if (expenseAmount === '' || expenseAmount.length === 0 || expenseAmount === undefined) {
			document.getElementById('amt').innerHTML = "";
			document.getElementById('amt').style.display = 'block';
			document.getElementById('amt').append('please enter expense amount');
			validForm = false;
		} else {
			document.getElementById('amt').style.display = 'none';
		}
		return validForm;
	}
</script>
</html>