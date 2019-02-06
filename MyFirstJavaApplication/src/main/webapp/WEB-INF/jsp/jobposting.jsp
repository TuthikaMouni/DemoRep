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
					<td colspan=2><center><font size=4><b>Available Jobs</b></font></center></td>
				</tr>
				<tr>
				    <th>Job Id</th>
				    <th>Job Description</th> 
				    <th>Experience</th>
				    <th>Job Status</th>
				</tr>
				 <tr>
				    <td>11111</td>
				    <td>Java Developer</td>
				    <td>5 years</td>
				    <td><a href="<%=request.getContextPath()%>/profile.jsp">Apply</a></td>
				  </tr>
				  <tr>
				    <td>22222</td>
				    <td>Python Developer</td>
				    <td>3 years</td>
				    <td><a href="<%=request.getContextPath()%>/profile.jsp">Apply</a></td>
				  </tr>
				  <tr>
				    <td>33333</td>
				    <td>IBM Bluemix Developer</td>
				    <td>2 years</td>
				    <td><a href="<%=request.getContextPath()%>/profile.jsp">Apply</a></td>
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
