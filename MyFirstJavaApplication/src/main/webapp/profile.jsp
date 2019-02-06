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
	   <form id="profileform" action="ProfileController" method="post">
			<table width="350" bgcolor="eeeeee" align="center">
				<tr>
					<td colspan=2><center><font size=4><b>Profile Page</b></font></center></td>
				</tr>
				<tr>
					<td colspan=2 style="color:red;" id="profileerrormsg"><center><font size=4><b></b></font></center></td>
				</tr>
				<tr>
					<td>Firstname:</td>
					<td><input type="text" size=25 name="firstname" id="firstnameid" placeholder="Name"></td>
				</tr>
				<tr>
					<td>Lastname:</td>
					<td><input type="text" size=25 name="lastname" id="lastnameid" placeholder="Lastname"></td>
				</tr>
				<tr>
					<td>Email Id:</td>
					<td><input type="email" size=25 name="profileemail" id="profileemailid" placeholder="Email"></td>
				</tr>
				<tr>
					<td>Phone Number:</td>
					<td><input type="number" size=25 name="phone" id="phoneid" placeholder="Phone"></td>
				</tr>
				<tr>
					<td>Education:</td>
					<td><input type="text" size=25 name="education" id="educationeid" placeholder="Highest Qualification"></td>
				</tr>
				<tr>
					<td>Experience:</td>
					<td>
						<select id="experienceid">
						  <option value="selectedyears">Select Years</option>
						  <option value="one">1 Years</option>
						  <option value="two">2 Years</option>
						  <option value="three">3 Years</option>
						  <option value="four">4 Years</option>
						  <option value="five">5 Years</option>
						  <option value="six">6 Years</option>
						  <option value="seven">7 Years</option>
						  <option value="eight">8 Years</option>
						  <option value="nine">9 Years</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>Skills:</td>
					<td><input type="text" size=25 name="skill" id="skillid" placeholder="Skill Name"></td>
				</tr>
				<tr>
					<td ><input type="Reset" onclick="resetFrom()"></td>
					<td><input type="button" value="Submit" onclick="validateProfileForm()"></td>
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
	document.getElementById("profileform").reset();
}

function validateProfileForm(){
	//removing error messages
	document.getElementById("profileerrormsg").value = '';
	var firstname = document.getElementById("firstnameid").value;
	var lastname = document.getElementById("lastnameid").value;
	var emailid = document.getElementById("profileemailid").value;
	var phone = document.getElementById("phoneid").value;
	var education = document.getElementById("educationeid").value;
	var experience = document.getElementById("experienceid").value;
	var skill = document.getElementById("skillid").value;
	console.log(firstname+' '+lastname+' '+emailid+' '+phone+' '+education+' '+experience+' '+skill);
	
	if((firstname == null || firstname == '' ) || (lastname == null ||  lastname == '') || (emailid == null || emailid == '' ) || (phone == null ||  phone == '') || 
			(education == null || education == '' ) || (skill == null ||  skill == '')){
		document.getElementById('profileerrormsg').innerHTML="Please enter required fields";
	}else if(experience == null || experience == '' || experience === "selectedyears"){
		document.getElementById('profileerrormsg').innerHTML="Please select experience";
	}else{
		document.getElementById("profileform").submit();
	}
	
}
</script>