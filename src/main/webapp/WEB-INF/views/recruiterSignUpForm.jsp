<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>RecruiterSignUp Form</title>
<style type="text/css">
#cDiv {
	width: 600px;
	background-color: #ffffff;
	height: 600px;
	margin: 0 auto;
}

#container {
	width: 1500px;
	background-color: #00264d;
	height: 1000px;
}

.error {
	color: red;
	font-weight: bold;
}
</style>

</head>

<body>
	<div id="container">
		<div style="color: white; text-decoration: none; font-size: 20px;"
			id="bDiv" align="center">
			<p>Not a member ? SignUp for Free</p>
		</div>

		<div id="cDiv" align="center"
			style="width: 600px; height: 500px; border: 1px; text-align: center; position: left;">
			<br>
			<table border="0" width="90%">
				<form:form action="recruiterSubmitForm"
					modelAttribute="recruiterSignUp">
					<tr>
						<td><label>Email : </label></td>
						<td><form:input type="email" placeholder="Enter Username"
								path="email" /></td>
						<td><form:errors path="email" cssClass="error" /></td>
					</tr>

					<tr>
						<td><label>Password :</label>
						<td><form:input type="password" placeholder="Enter Password"
								name="psw" path="password" /></td>
						<td><form:errors path="password" cssClass="error" /></td>

					</tr>

					<tr>
						<td><label>Confirm Password :</label></td>
						<td><input type="password" name="ConformPassword" required></input></td>
					</tr>

					<tr>
						<td><label>Name :</label></td>
						<td><form:input type="text" name="firstName" path="name" /></td>
						<td><form:errors path="name" cssClass="error" /></td>
					</tr>

					<tr>
						<td><label>Company Name :</label></td>
						<td><select name="company name">
								<option value="Google">Google</option>
								<option value="Facebook">Facebook</option>
								<option value="LinkedIn">LinkedIn</option>
								<option value="Twitter">Twitter</option>
						</select></td>
					</tr>

					<tr>
						<td><label>City :</label></td>
						<td><form:select path="city" items="${cities}" /></td>
						<td><form:errors path="city" cssClass="error" /></td>
					</tr>

					<tr>
						<td><label>State : </label></td>
						<td><form:select path="state" items="${states}" /></td>
						<td><form:errors path="state" cssClass="error" /></td>
					</tr>

					<tr>
						<td><label>Country :</label></td>
						<td><form:select path="country" items="${countries}" /></td>
						<td><form:errors path="country" cssClass="error" /></td>
					</tr>

					<tr>
						<td><label>Zip : </label></td>
						<td><form:input type="number" name="zip" path="zip" /></td>
						<td><form:errors path="zip" cssClass="error" /></td>
					</tr>

					<tr>
						<td><label>Contact No :</label></td>
						<td><form:input type="text" class="field"
								path="contactNumber" /></td>
						<td><form:errors path="contactNumber" cssClass="error" /></td>
					</tr>


					<tr>
						<td></td>
						<td align="center"><input type="Submit" value="Register"
							style="font-size: 10pt; background-color: deepskyblue"></td>
						<td></td>
					</tr>

					<tr>
				</form:form>
			</table>
		</div>
	</div>

</body>
</html> --%>

<%-- <html> 
  <head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Recruiter SignUp</title>
<style type="text/css">
#topbar {
	width: 100%;
	height: 50px;
	color: white;
	font-size: 50px;
	font-weight: bold;
}

#topbar img {
	height: 40px;
	width: 40px;
	margin-left: 20px;
	margin-top: 40px;
}

#topmenu {
	margin-top: 50px;
	border: 1px;
	width: 100%;
	height: 60px;
	padding-right: 500px;
}

#topmenu img {
	height: 50px;
	width: 50px;
	margin-left: 5px;
	margin-top: 30px;
	padding-right: 10px;
}

body {
	background-image: url("resources/img/a.png");
	background-repeat: no-repeat;
	background-size: 1500px 1000px;
}

form {
	margin-bottom: 40px;
	background-color: #8fbbbc;
	color: black;
	height: 700px;
}

input[type=text], input[type=password], select {
	width: 60%;
	padding: 12px 10px;
	margin: 6px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}

input[type=submit] {
	width: 60%;
	background-color: #00264d;
	color: white;
	padding: 12px 10px;
	margin: 6px 0;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

.error {
	color: red;
	font-weight: bold;
}
</style>
</head> 

 <div id="body">
	<div id="container" align="center">

		<div id="topbar">
			<a href="mainhomepage"><img src="resources/img/logo.png"></a>
			DREAM JOB
		</div>
		<div id="topmenu">
			<a href="mainhomepage"><img src="resources/img/home.png"
				border="0"></a>
		</div>

		<div id="aDiv"
			style="width: 400px; text-align: center; position: right; margin-top: 10px; color: white;">

			<br>
			<h3>Sign Up with DreamJob Account</h3>
		</div>
		<div id="cDiv" align="center"
			style="width: 600px; border: 1px; text-align: center; position: left;">
			<br>
			<table>
				<form:form action="recruiterSubmitForm"
					modelAttribute="recruiterSignUp">

					<tr>
						<td><label>Email :</label></td>
						<td><form:input type="email" id="email" name="email"
								path="email"></form:input></td>
						<td><form:errors path="email" cssClass="error" /></td>
					</tr>
					<tr>
						<td><label>Password :</label></td>
						<td><form:input type="password" id="Password" path="password" /></td>
						<td><form:errors path="password" cssClass="error" /></td>
					</tr>

					<tr>
						<td><label>Conform Password :</label></td>
						<td><input type="password" name="ConformPassword" required /></td>
					</tr>

					<tr>
						<td><label>Name :</label></td>
						<td><form:input type="text" name="name" path="name" /></td>
						<td><form:errors path="name" cssClass="error" /></td>
					</tr>

					<tr>
						<td><label>Company Name :</label></td>
						<td><select name="company Name">
								<option value="Google">Google</option>
								<option value="Facebook">Facebook</option>
								<option value="LinkedIn">LinkedIn</option>
								<option value="Twitter">Twitter</option>
						</select></td>
						<td></td>
					</tr>

					<tr>
						<td><label> City :</label></td>
						<td><form:select path="city" items="${cities}" /></td>
						<td><form:errors path="city" cssClass="error" /></td>
					</tr>

					<tr>
						<td><label>State : </label></td>
						<td><form:select path="state" items="${states}" /></td>
						<td><form:errors path="state" cssClass="error" /></td>

					</tr>

					<tr>
						<td><label> Country:</label></td>
						<td><form:select path="country" items="${countries}" /></td>
						<td><form:errors path="country" cssClass="error" /></td>
					</tr>

					<tr>
						<td><label>Zip :</label></td>
						<td><form:input type="number" name="zip" path="zip" /></td>
						<td><form:errors path="zip" cssClass="error" /></td>
					</tr>

					<tr>
						<td><label>Contact No : </label></td>
						<td><form:input type="text" path="contactNumber"
								name="contactNumber" /></td>
						<td><form:errors path="contactNumber" cssClass="error" /></td>
					</tr>

					<tr>
						<td><input type="submit" value="Sign Up"></td>
					</tr>

				</form:form>
			</table>
		</div>
	</div>
</div> 
</html> --%>

<html> 
  <head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Recruiter SignUp</title>
<style type="text/css">
#topbar {
	width: 100%;
	height: 40px;
	color: white;
	font-size: 50px;
	font-weight: bold;
}

a{
 color:white
 
}

#topbar img {
	height: 40px;
	width: 40px;
	margin-left: 20px;
	margin-top: 40px;
}

#topmenu {
	margin-top: 50px;
	border: 1px;
	width: 100%;
	height: 40px;
}

#topmenu img {
	height: 50px;
	width: 50px;
	margin-left: 5px;
	margin-top: 30px;
	padding-right: 10px;
}
#bDiv{
  width: 500px;
  padding-left: 0px;

}
#bDiv label{
    display: inline-block;
    float: left;
    clear: left;
    width: 40%;
    text-align: right;
    padding: 10px 10px;
    margin: 2px 0;

}
#container{
  height: 800px;
  width: 500px;
}

body {
	background-image: url("resources/img/a.png");
	background-size: 1000px 1000px;
}

form {
	margin-bottom: 20px;
	background-color: #8fbbbc;
	color: black;
	height: 550px;
	border-radius: 8px;
}

input[type=email], input[type=text], input[type=password],input[type=number], select {
	width: 30%;
	padding: 8px 8px;
	margin: 6px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
	float: left;
}

select {
    cursor:pointer;
    display:inline-block;
    position:relative;
    font:normal 18px/22px Arial;
    color:black;
    border:1px solid #ccc;

}

input[type=submit] {
	width: 30%;
	background-color: #00264d;
	color: white;
	padding: 10px 10px;
	margin: 8px 0;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	/* margin-right: 10px; */
}

.error {
	color: red;
	font-weight: bold;
}
</style>
</head> 

 <div id="body" align="center">
	<div id="container"> 
		<div id="topbar">
			<a href="mainhomepage"><img src="resources/img/logo.png"></a>
			DREAM JOB
		</div>
		<!-- <div id="topmenu">
			<a href="mainhomepage"><img src="resources/img/home.png"
				border="0"></a>
		</div> -->

        <div id="aDiv" style="width:350px;text-align:center;margin-top:20px;color:white;">
			<br>
			<br>
			<h3>Create a DreamJob Account</h3>
		</div>
		<div id="bDiv" align="center">
			<br>
				<form:form action="recruiterSubmitForm"
					modelAttribute="recruiterSignUp">
					<br>
						<label>Email :</label>
						<form:input type="email"  path="email" />
						<form:errors path="email" cssClass="error" />
						<br><br>
					
						<label>Password :</label>
						<form:input type="password" id="Password" path="password" />
						<form:errors path="password" cssClass="error" />
						<br><br>
 
						<label>Confirm Password :</label>
						<input type="password" name="ConformPassword" required />
						<br><br>
					
						<label>Name :</label>
						<form:input type="text" name="name" path="name" />
						<form:errors path="name" cssClass="error" />
						<br><br>
					
					
						<label>Company Name :</label>
						<select name="company Name">
						        <option value=""></option>
								<option value="Google">Google</option>
								<option value="Facebook">Facebook</option>
								<option value="LinkedIn">LinkedIn</option>
								<option value="Twitter">Twitter</option>
						</select>
						<br><br>
					
						<label> City :</label>						
						<form:select path="city" items="${cities}" />
						<form:errors path="city" cssClass="error" />
						<br><br>
					
						<label>State : </label>
						<form:select path="state" items="${states}" />
						<form:errors path="state" cssClass="error" />
						<br><br>

						<label> Country :</label>
						<form:select path="country" items="${countries}" />
						<form:errors path="country" cssClass="error" />
						<br><br>

						<label>Zip :</label>
						<form:input type="number" name="zip" path="zip" />
						<form:errors path="zip" cssClass="error" />
						<br><br>
					
						<label>Contact No : </label>
						<form:input type="text" path="contactNumber"
								name="contactNumber" />
						<form:errors path="contactNumber" cssClass="error" />
						<br><br><br>
					

						<input type="submit" value="Sign Up">
						<br>
					
     
				</form:form>
				
		</div>
		<div id="cDiv" align="left">
			<p align="left"><a href="getRecruiterSignInFormForHomePage">go back</a></p>
				
		</div>
		<!-- <p align="left"><a href="getRecruiterSignInFormForHomePage">go back</a></p> -->
	</div>
	
	
</html>
