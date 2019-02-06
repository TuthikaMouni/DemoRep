<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<html>
<head>
 <title>Forgot password</title>
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
	   <form id="forgotpass" action="PasswordController" method="post">
			<table width="350" bgcolor="eeeeee" align="center">
				<tr>
					<td colspan=2 style="color:red;" id="forgoterrorid"><center><font size=4><b></b></font></center></td>
				</tr>
				<tr>
					<td colspan=2><center><font size=4><b>Forgot Password Page</b></font></center></td>
				</tr>
				<tr>
					<td>Email Id:</td>
					<td><input type="text" size=25 name="forgotpassword" id="forgotpasswordid"></td>
				</tr>
				<tr>
					<td ><input type="Reset" onclick="resetFrom()"></td>
					<td><input type="button" value="Login" onclick="validateEmailID()"></td>
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
	document.getElementById("forgotpass").reset();
}

function validateEmailID(){
	var emailid = document.getElementById("forgotpasswordid").value;
	console.log("emailid"+emailid);
	var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
	if (!filter.test(emailid)) {
		document.getElementById('forgoterrorid').innerHTML="Please enter valid email id";
	}else{
		document.getElementById("forgotpass").submit();
	}
}
</script>