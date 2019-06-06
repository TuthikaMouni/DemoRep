<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><br><br><br><br><br><br><br><br>
	<form action="${pageContext.request.contextPath}/processResetPassword?action=add" method="post">
		<div align="center">
			New Password : <input type="password" name="newpass" id="npwd">
			<span id="newpwd" style="display:none;color:red"></span><br><br>
			Re-enter Password : <input type="password" name="repass" id="repwd">
			<span id="reenterpwd" style="display:none;color:red"></span>
		</div><br><br>
		<div align="center">
			<input type="submit" value="Submit" onclick="return validate();">
			<span id="error" style="display:none;color:red"></span>
		</div>
	</form>
</body>
<script>
	function validate() {
		console.log('Inside function');
		var validPassword = true;
		var newpassword = document.getElementById('npwd').value;
		if(newpassword.length === 0 || newpassword === '' || newpassword === undefined) {
			document.getElementById('newpwd').innerHTML = "";
			document.getElementById('newpwd').style.display = 'block';
			document.getElementById('newpwd').append("Please enter new password");
			validPassword = false;
			console.log("validPassword "+validPassword);
		} else {
			document.getElementById('newpwd').style.display = 'none';
		}
		var reenterpassword = document.getElementById('repwd').value;
		if(reenterpassword.length === 0 || reenterpassword === '' || reenterpassword === undefined) {
			document.getElementById('reenterpwd').innerHTML = "";
			document.getElementById('reenterpwd').style.display = 'block';
			document.getElementById('reenterpwd').append("Please re-enter password");
			validPassword = false;
			console.log("validPassword "+validPassword);
		} else {
			document.getElementById('reenterpwd').style.display = 'none';
		}
		if((newpassword !== '' && reenterpassword !== '') || (newpassword !== undefined && reenterpassword !== undefined) || (newpassword.length !== 0 && reenterpassword.length !== 0)) {
			if(newpassword === reenterpassword) {
				document.getElementById('error').style.display = 'none';
			} else {
				document.getElementById('error').innerHTML = "";
				document.getElementById('error').style.display = 'block';
				document.getElementById('error').append("Please re-enter same password");
				validPassword = false;
				console.log("validPassword "+validPassword);
			}
		}
		return validPassword;
	}
</script>
</html>