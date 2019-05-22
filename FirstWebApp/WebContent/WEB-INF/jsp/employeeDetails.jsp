<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:include page="/WEB-INF/jsp/header.jsp"></jsp:include>
<body>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<div>
		<table align="center" border="1">
			<tr>
				<th>emp_id</th>
				<th>emp_name</th>
				<th>emp_salary</th>
				<th>emp_contact</th>
				<th>emp_dob</th>
				<th>emp_doj</th>
				<th>emp_modifications</th>
			</tr>
			<c:forEach items="${empList}" var="employee">
				<tr>
					<td>${employee.empid}</td>
					<td>${employee.empname}</td>
					<td>${employee.empsalary}</td>
					<td>${employee.empcontact}</td>
					<td>${employee.empdob}</td>
					<td>${employee.empdoj}</td>
					<td><a href="${pageContext.request.contextPath}/employeecontroller?action=update&id=${employee.empid}">Update</a>
						&nbsp&nbsp&nbsp<a href="${pageContext.request.contextPath}/employeecontroller?action=delete&id=${employee.empid}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<div>
		<a href="#" onclick="showAddEmployeeForm()">Add Employee</a>
	</div>
	<div style="display: none" id="addEmpDiv">
		<form action="EmployeeController?action=ADD" method="POST">
			<div align="center">
				 <input type="text" placeholder="Employee Id" name="emp_id"><br><br>
				 <input type="text" placeholder="Employee Name" name="emp_name"> <br><br>
				 <input type="text" placeholder="Employee Salary" name="emp_salary"><br><br>
				 <input type="text" placeholder="Employee contact" name="emp_contact"> <br><br>
				 <input type="text" placeholder="Employee DOB" name="emp_dob" id="emp_dob" onchange="validateDob()"> <br><br>
				 <span id="emp_dob_error" style="display: none; color: red"></span>
				<input type="text" placeholder="Employee DOJ" name="emp_doj" id="emp_doj" onchange="validateDoj()">
				<span id="emp_doj_error" style="display: none; color: red"></span>
			</div>
			<br />
			<div align="center">
				<input type="submit" value="Add employee">
			</div>
		</form>
	</div>
</body>
<jsp:include page="/WEB-INF/jsp/footer.jsp"></jsp:include>
</html>
<script>
	function showAddEmployeeForm() {
		console.log('inside showAddEmployeeForm');
		document.getElementById('addEmpDiv').style.display = "block";
	}
	function validateDob() {
		document.getElementById('emp_dob_error').style.display = "none";
		console.log('inside validateDate');
		var pattern = /^([0-9]{2})\/([0-9]{2})\/([0-9]{4})$/;
		var empDob = document.getElementById('emp_dob').value;
		console.log('empDob :' + empDob);
		var result = pattern.test(empDob);
		console.log('result :' + result);
		if (result === true || result === "" || result == 'undefined' || result.length === 0) {
			document.getElementById('emp_dob_error').style.display = "none";
		} else if(result === false){
			document.getElementById('emp_dob_error').innerHTML = "";
			document.getElementById('emp_dob_error').style.display = "block";
			document.getElementById('emp_dob_error').append('please enter DOB in the format dd/mm/yyyy');
		}
	}
	function validateDoj() {
		var pattern = /^([0-9]{2})\/([0-9]{2})\/([0-9]{4})$/;
		var empDoj = document.getElementById('emp_doj').value;
		var result = pattern.test(empDoj);
		if (result === true || result === "" || result == 'undefined' || result.length === 0) {
			document.getElementById('emp_doj_error').style.display = "none";
		} else {
			document.getElementById('emp_doj_error').innerHTML = "";
			document.getElementById('emp_doj_error').style.display = "block";
			document.getElementById('emp_doj_error').append('please enter  DOJ in the format dd/mm/yyyy');
		}
	}
</script>