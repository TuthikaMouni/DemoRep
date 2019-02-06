<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<html>
<head>
 <title>Login Page</title>
</head>
<style>
  * {
	padding:5px;
	margin:5px;
	}
  html, body {
    padding:0;
	margin:0;
  }
  header{
  	background: #efefef;
    text-align: center;
    position: relative;
    display: block;
    margin: 0;
    padding: 1px;
  }
  table{
  	margin: auto;
    position: relative;
    display: block;
  }
 footer{
 	text-align: center;
    padding: 18px;
    background: #eeeeee;
    display: block;
    margin: 0;
    margin-top: 15px;
    position: relative;
 }
 
</style>
<body>
<header>
	<section>
		<h2>Job Application</h2>	
	</section>
</header>
	<section id="tableContainer-1">
	  <article id="tableContainer-2">
	   <form id="loginform" action="LoginController" method="post">
			<table width="350" bgcolor="eeeeee" align="center">
				<tr>
					<td colspan=2 style="color:red;" id="errormsg"><center><font size=4><b></b></font></center></td>
				</tr>
				<tr>
					<td colspan=2><center><font size=4><b>Login Page</b></font></center></td>
				</tr>
				<tr>
					<td>Username:</td>
					<td><input type="text" size=25 name="userid" id="userid"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="Password" size=25 name="pwd" id="password"></td>
				</tr>
				<tr>
					<td colspan=2 align="right"><font size=2><b><a href="<%=request.getContextPath()%>/forgotpassword.jsp">Forgot Password ?</a></b></font></td>
				</tr>
				<tr>
					<td ><input type="Reset" onclick="resetFrom()"></td>
					<td><input type="button" value="Login" onclick="validateLoginform()"></td>
				</tr>
				<tr>
					<td colspan=2 align="right"><font size=2><b><a href="<%=request.getContextPath()%>/createuser.jsp">New User ? Create a new account ?</a></b></font></td>
				</tr>
			</table>
		</form>
	  </article>
	</section>
	<footer>
		<section>
			<article>
			 <div>Copyrights | All rights reserved</div>
			</article>
		</section>
	</footer>
 </body>
</html>
<script>
function resetFrom(){
	document.getElementById("loginform").reset();
}

function validateLoginform(){
	//removing error messages
	document.getElementById("errormsg").value = '';
	var username = document.getElementById("userid").value;
	var password = document.getElementById("password").value;
	if((username == null || username == '' ) && (password == null ||  password == '')){
		document.getElementById('errormsg').innerHTML="Please enter username and password";
	}else if(username == null || username == '' ){
		document.getElementById('errormsg').innerHTML="Please enter username";
	}else if(password == null || password == ''){
		document.getElementById('errormsg').innerHTML="Please enter password";
	}else{
		document.getElementById("loginform").submit();
	}
	
}
</script>