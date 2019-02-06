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
	   <form id="createform" action="CreateUserController" method="post">
			<table width="350" bgcolor="eeeeee" align="center">
				<tr>
					<td colspan=2 style="color:red;" id="createerrorid"><center><font size=4><b></b></font></center></td>
				</tr>
				<tr>
					<td colspan=2><center><font size=4><b>Create User Page</b></font></center></td>
				</tr>
				<tr>
					<td>Name:</td>
					<td><input type="text" size=25 name="createname" id="createname"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="Password" size=25 name="createpwd" id="createpwd"></td>
				</tr>
				<tr>
					<td>Confirm Password:</td>
					<td><input type="Password" size=25 name="createcnfpwd" id="createcnfpwd"></td>
				</tr>
				<tr>
					<td>Email Id:</td>
					<td><input type="text" size=25 name="createemailid" id="createemailid"></td>
				</tr>
				<tr>
					<td ><input type="Reset" onclick="resetFrom()"></td>
					<td><input type="button" value="Create User" onclick="validateCreateUser()"></td>
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
	document.getElementById("createform").reset();
}
function validateCreateUser(){
	console.log("inside");
	document.getElementById("createerrorid").value = '';
	
	var createname = document.getElementById("createname").value;
	var createpwd = document.getElementById("createpwd").value;
	var createcnfpwd = document.getElementById("createcnfpwd").value;
	var createemailid = document.getElementById("createemailid").value;
	
	if((createname == null || createname == '' ) && (createpwd == null ||  createpwd == '') && (createcnfpwd == null ||  createcnfpwd == '') && (createemailid == null ||  createemailid == '')){
		document.getElementById('createerrorid').innerHTML="Please enter required information";
	}else if((createname == null || createname == '' ) && (createpwd == null ||  createpwd == '') && (createcnfpwd == null ||  createcnfpwd == '')){
		document.getElementById('createerrorid').innerHTML="Please enter name, password, confirm password";
	}else if((createname == null || createname == '' ) && (createpwd == null ||  createpwd == '') && (createemailid == null ||  createemailid == '')){
		document.getElementById('createerrorid').innerHTML="Please enter name, password, email id";
	}else if((createcnfpwd == null ||  createcnfpwd == '') && (createpwd == null ||  createpwd == '') && (createemailid == null ||  createemailid == '')){
		document.getElementById('createerrorid').innerHTML="Please enter password, cnfpassword, email id";
	}else if(createname == null || createname == '' ){
		document.getElementById('createerrorid').innerHTML="Please enter username/name";
	}else if(createpwd == null || createpwd == ''){
		document.getElementById('createerrorid').innerHTML="Please enter password";
	}else if(createcnfpwd == null || createcnfpwd == ''){
		document.getElementById('createerrorid').innerHTML="Please enter confirm password";
	}else if(createemailid == null || createemailid == ''){
		document.getElementById('createerrorid').innerHTML="Please enter email id";
	}else{
		validatePassword();
	}
}

function validatePassword(){
	document.getElementById("createerrorid").value = '';
	var createpwd = document.getElementById("createpwd").value;
	var createcnfpwd = document.getElementById("createcnfpwd").value;
	if(!(createpwd === createcnfpwd)){
		document.getElementById('createerrorid').innerHTML="Password and Confirm password are not matching";
	}else{
		validateEmail();
	}
}

function validateEmail(){
	document.getElementById("createerrorid").value = '';
	var createemailid = document.getElementById("createemailid").value;
	var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
	if (!filter.test(createemailid)) {
		document.getElementById('createerrorid').innerHTML="Please enter valid email id";
	}else{
		document.getElementById("createform").submit();
	}
	
}
</script>