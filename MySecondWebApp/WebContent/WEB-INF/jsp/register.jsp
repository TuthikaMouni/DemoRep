<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SignUp</title>
</head>
<jsp:include page="/WEB-INF/jsp/header.jsp"></jsp:include>
<body>
	<form
		action="${pageContext.request.contextPath}/processRegister?action=add" method="post"><br><br><br><br><br><br><br>
		<div align="center">
			Register Id : <input type="text" name="id" id='regid'> 
			<span id='iderror' style="display: none; color: red"></span> <br><br> 
			Username : <input type="text" name="username" id='username'>
			<span id='usererror' style="display: none; color: red"></span> <br><br> 
			Email id : <input type="email" name="emailid" id='email'>
			<span id='emailerror' style="display: none; color: red"></span> <br><br> 
			Password : <input type="password" name="pass" id='password'>
			<span id='pwderror' style="display: none; color: red"></span> <br><br> 
			Re-enter password : <input type="password" name="reenterpassword" id='repassword'> 
			<span id='repwderror' style="display: none; color: red"></span> <br><br> 
			Contact : <input type="text" name="contact" id='contact'>
			<span id='contacterror' style="display: none; color: red"></span>
		</div>
		<br>
		<div align="center">
			<input type="submit" value="Sign-Up" onclick="return validate();" />
			<span id='success' style="display: none; color: green"></span> <span
				id='genericerror' style="display: none; color: red"></span>
		</div>
	</form>
</body>
<jsp:include page="/WEB-INF/jsp/footer.jsp"></jsp:include>
<script>
	function validate() {
		console.log('inside fnction');
		var id = document.getElementById('regid').value;
		var username = document.getElementById('username').value;
		var password = document.getElementById('password').value;
		var repassword = document.getElementById('repassword').value;
		var email = document.getElementById('email').value;
		var contact = document.getElementById('contact').value;
		console.log(id + ',' + username + ',' + password + ',' + ','
				+ repassword + ',' + email + ',' + contact);
		var flag = false;
		formsubmit(id, username, password, repassword, email, contact);
		if ((id.length === 0) || (id === '') || (id === undefined)) {
			console.log('id empty');
			document.getElementById('iderror').innerHTML = ""
			document.getElementById('iderror').style.display = 'block';
			document.getElementById('iderror').append(
					'please enter register id');
		}
		if ((username.length === 0) || (username === '')
				|| (username === undefined)) {
			console.log('username empty');
			document.getElementById('usererror').innerHTML = ""
			document.getElementById('usererror').style.display = 'block';
			document.getElementById('usererror')
					.append('please enter username');
		}
		if ((email.length === 0) || (email === '') || (email === undefined)) {
			console.log('email empty');
			document.getElementById('emailerror').innerHTML = ""
			document.getElementById('emailerror').style.display = 'block';
			document.getElementById('emailerror')
					.append('please enter emailid');
		}
		if ((password.length === 0) || (password === '')
				|| (password === undefined)) {
			console.log('pwd empty');
			document.getElementById('pwderror').innerHTML = ""
			document.getElementById('pwderror').style.display = 'block';
			document.getElementById('pwderror').append('please enter password');
		}
		if ((repassword.length === 0) || (repassword === '')
				|| (repassword === undefined)) {
			console.log('repwd empty');
			document.getElementById('repwderror').innerHTML = ""
			document.getElementById('repwderror').style.display = 'block';
			document.getElementById('repwderror').append(
					'please re-enter password');
		}
		if ((contact.length === 0) || (contact === '')
				|| (contact === undefined)) {
			console.log('contact empty');
			document.getElementById('contacterror').innerHTML = "";
			document.getElementById('contacterror').style.display = 'block';
			document.getElementById('contacterror').append(
					'please enter contact number');
		}

		var emailflag = validateEmail(email);

		var passwordFlag = validatePassword(password, repassword);

		var contactFlag = validatecontact(contact);

		console.log(emailflag + ',' + passwordFlag + ',' + contactFlag);

		if (emailflag === false || passwordFlag === false
				|| contactFlag === false) {
			flag = false;
		} else {
			flag = true;
		}

		return flag;
	}

	function validateEmail(email) {
		var emailflag = false;
		if (email.length !== 0) {
			var emailRegex = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
			if (!emailRegex.test(email)) {
				document.getElementById('emailerror').innerHTML = "";
				document.getElementById('emailerror').style.display = 'block';
				document.getElementById('emailerror').append(
						'please enter a valid email id');
			} else {
				emailflag = true;
			}
		}
		console.log('emailflag :' + emailflag);
		return emailflag;
	}
	function validatePassword(password, repassword) {
		var passwordFlag = false;
		if ((password !== '' && repassword !== '')
				|| (password !== undefined && repassword !== undefined)
				|| (password.length !== 0 && repassword.length !== 0)) {
			if (password === repassword) {
				console.log('match');
				document.getElementById('genericerror').style.display = 'none';
				passwordFlag = true;
			} else {
				console.log('not match');
				document.getElementById('genericerror').innerHTML = "";
				document.getElementById('genericerror').style.display = 'block';
				document.getElementById('genericerror').append(
						'please re-enter the same password');
			}
		}
		console.log('passwordFlag :' + passwordFlag);
		return passwordFlag;
	}

	function validatecontact(contact) {
		console.log('inside contact');
		var contactFlag = false;
		if (contact.length !== 0) {
			var contactno = /^\(?([0-9]{3})\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})$/;
			if (!contact.match(contactno)) {
				document.getElementById('contacterror').innerHTML = "";
				document.getElementById('contacterror').style.display = 'block';
				document.getElementById('contacterror').append(
						'please enter valid contact number');
			} else {
				contactFlag = true;
			}
		}
		console.log('contactFlag :' + contactFlag);
		return contactFlag;

	}
	function formsubmit(id, username, password, repassword, email, contact) {
		console.log('inside submit :' + username);
		var flag = false;
		if (id.length !== 0) {
			document.getElementById('iderror').style.display = 'none';
			//flag = true;
		}
		if (username.length !== 0) {
			document.getElementById('usererror').style.display = 'none';
			//flag = true;
		}
		if (email.length !== 0) {
			document.getElementById('emailerror').style.display = 'none';
			//flag = true;
		}
		if (password.length !== 0) {
			document.getElementById('pwderror').style.display = 'none';
			// flag = true;
		}
		if (repassword.length !== 0) {
			document.getElementById('repwderror').style.display = 'none';
			//flag = true;
		}
		if (contact.length !== 0) {
			document.getElementById('contacterror').style.display = 'none';
			// flag = true;
		}
		if ((id.length !== 0) && (username.length !== 0)
				&& (email.length !== 0) && (password.length !== 0)
				&& (repassword.length !== 0) && (contact.length !== 0)) {
			var emailFlag = validateEmail(email);
			var passwordFlag = validatePassword(password, repassword);
			var contactFlag = validatecontact(contact);
			console.log('Flags :' + emailFlag + ',' + passwordFlag + ','
					+ contactFlag);
			if (emailFlag && passwordFlag && contactFlag) {
				flag = true;
			}

		}
		if (flag) {
			document.getElementById('success').innerHTML = "";
			document.getElementById('success').style.display = 'block';
			//document.getElementById('success').append('success');  
		} else {
			document.getElementById('success').style.display = 'none';
		}
	}
</script>
</html>