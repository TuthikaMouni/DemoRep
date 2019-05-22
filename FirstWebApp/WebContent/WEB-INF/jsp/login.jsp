<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>

<jsp:include page="/WEB-INF/jsp/header.jsp"></jsp:include>

<body>
	<form action="logincontroller" method="GET"><br><br><br><br><br><br><br><br><br><br>
		<div align="center">
			Username : <input type="text" name="username" id='t1'> 
			<span id='uname' style="display: none; color: red"></span><br><br> 
			Password : <input type="password" name="pass" id='t2'> 
			<span id='pwd' style="display: none; color: red"></span>
		</div>
		<br>
		<div align="center">
			<input type="submit" value="Login" onclick="return validation();"> 
		</div>
	</form>
</body>
<jsp:include page="/WEB-INF/jsp/footer.jsp"></jsp:include>
<script>
	function validation() {
		var validForm = true;
		var username = document.getElementById('t1').value;
		if (username === '' || username.length === 0 || username === undefined) {
			document.getElementById('uname').innerHTML = "";
			document.getElementById('uname').style.display = 'block';
			document.getElementById('uname').append('please enter username');
			validForm = false;
		} else {
			document.getElementById('uname').style.display = 'none';
		}
		var password = document.getElementById('t2').value;
		if (password === '' || password.length === 0 || password === undefined) {
			document.getElementById('pwd').innerHTML = "";
			document.getElementById('pwd').style.display = 'block';
			document.getElementById('pwd').append('please enter password');
			validForm = false;
		} else {
			document.getElementById('pwd').style.display = 'none';
		}
		return validForm;
	}
</script>
</html>