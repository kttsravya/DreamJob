<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%-- <html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>JobSeeker SignUp Form</title>

<style type="text/css">
form {
	background-color: white;
	color: black;
	height: 500px;
}

.error {
	color: red;
	font-weight: bold;
}
</style>

</head>

<body style="background-color: #00264d; color: white;">
	<div id="container" align="center">

		<div id="aDiv"
			style="width: 400px; height: 550px; text-align: center; position: right;">
			<br>
			<p>SignUp with DreamJob Account</p>

			<form:form action="jobSeekerSubmitForm"
				modelAttribute="jobSeekerSignUp">
				<br>
				<br>
				<label>Name: <span class="req">*</span> <form:input
						 placeholder="name" path="name" /><br> 
						<form:errors
						path="name" cssClass="error" /> <br>
				</label>
				<label>Email<span class="req">*</span> <form:input
						type="text"
						path="email" /><br> <form:errors path="email"
						cssClass="error" /> <br>
				</label>
				<label>Password <span class="req">*</span> <form:input
						 name="Password" 
						type="password" path="password" /><br> <form:errors
						path="password" cssClass="error" /> <br>
				</label>
				<label>Confirm Password <span class="req">*</span> <input
					id="cnfrmpwd"  name="ConformPassword"
					 type="password" value="" required></input><br>

					<br>
				</label>
				<label>Contact Number<span class="req">*</span> <form:input
						maxlength="10" name="contactNo" 
						type="number" path="contactNumber" /><br> <form:errors
						path="contactNumber" cssClass="error" /> <br>
				</label>
				<label>Country <form:select path="country"
						items="${countries}" /><br> <br>
				</label>
				<label>State <form:select path="state" items="${states}" /><br>
					<br>
				</label>
				<label>City <form:select path="city" items="${cities}" /><br>
					<br>
				</label>
				<label>Zip <span class="req">*</span> <form:input
					type="number" path="zip" /><br>
					<form:errors path="zip" cssClass="error" /> <br>
				</label>
				<button type="Submit" id="Log In">Sign Up</button>
			</form:form>

		</div>

	</div>
</body>

</html> --%>

<%-- <html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>JobSeeker SignUp Form</title>

<style type="text/css">
#topbar{
    width:100%;
    height:60px;
    color: white;
    font-size:50px;
    font-weight: bold;
}

#topbar img{
    height: 40px;
    width: 40px;
    margin-left: 20px;
    margin-top: 40px;
}

#topmenu {
    margin-top: 10px;
    border: 1px;
    width:100%;
    height:10px;
    padding-right: 500px;
}
#topmenu img{
    height: 50px;
    width: 50px;
    margin-left: 5px;
    margin-top: 30px;
    padding-right: 10px;
}
body{
	background-image: url("resources/img/a.png");
	background-repeat: no-repeat;
	background-size: 1500px 1000px;
}
form{
    margin-top: 20px;
    background-color: #8fbbbc; color: black;
    height: 550px;
}
input[type=text],input[type=password],select {
    width: 100%;
    padding: 5px 4px;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 2px;
    box-sizing: border-box;
}
button[type=submit] {
    width: 50%;
    background-color: #00264d;
    color: white;
    padding: 15px 12px;
    margin: 10px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}
</style>

</head>

<div id="body">
<div id="container" align="center" >
<div id="topbar" style="margin-top:10px;">
      <a href="mainhomepage"><img src="resources/img/logo.png"></a>
     DREAM JOB
</div>
<div id = "topmenu">
  <a href="mainhomepage"><img src="resources/img/home.png" border="0"></a>
</div>

<div id="aDaDiviv"
    style="width:500px; text-align:center;position:right;margin-top:40px;color:white;">
    <br>
    <h2> Sign In with DreamJob Account</h2>


			<form:form action="jobSeekerSubmitForm"
				modelAttribute="jobSeekerSignUp">
				
				 <table cellspacing="20"  >
				  <tr>
					<td>Name:<span class="req">*</span> </td>
					<td>
					<form:input name="name" placeholder="Name" path="name" type="text" /><br> 
					<form:errors path="name" cssClass="error" /> <br>
					</td>
				</tr>
				
				<tr>
					<td>Email:<span class="req">*</span> </td>
					<td>
					<form:input name="email" type="text" path="email" placeholder="Email" /><br> 
					<form:errors path="email" cssClass="error" /> <br>
					</td>
				</tr>
				<tr>
					<td>Password:<span class="req">*</span> </td>
					<td>
					<form:input name="Password" type="password" path="password" placeholder="Password"/><br>
				    <form:errors path="password" cssClass="error" /> <br>
					</td>
				</tr>
				<tr>
					<td>Confirm Password:<span class="req">*</span> </td>
					<td>
					<input id="cnfrmpwd"  name="ConformPassword" type="password" value="" required></input><br>
					</td>
				</tr>
				<tr>
					<td>Contact Number:<span class="req">*</span> </td>
					<td>
					<form:input name="contactNo" maxlength="10" type="number" path="contactNumber" placeholder="Contact Number"/><br>
				    <form:errors path="contactNumber" cssClass="error" /> <br>
					</td>
				</tr>
				<tr>
					<td>City: </td>
					<td>
					<form:select path="city" items="${cities}" /><br>
					</td>
				</tr>
				<tr>
					<td>State:</td>
					<td>
					<form:select path="state" items="${states}" /><br>
					</td>
				</tr>
					
				<tr>
					<td>Country: </td>
					<td>
					<form:select path="country" items="${countries}" /><br> 
					</td>
				</tr>
				<tr>
					<td>Zip:<span class="req">*</span> </td>
					<td>
					<form:input placeholder="Zip" path="zip" type="number" /><br> 
					<form:errors path="zip" cssClass="error" /> <br>
					</td>
				</tr>
				</table>
				
				<button type="Submit" id="Log In">Sign Up</button>
			</form:form>

		</div>

	</div>

</html>
 --%>


<html> 
  <head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>JobSeeker SignUp</title>
<style type="text/css">

a{
color:white
}

#topbar {
	width: 100%;
	height: 40px;
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
	height: 500px;
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
	width: 20%;
	background-color: #00264d;
	color: white;
	padding: 10px 10px;
	margin: 8px 0;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	margin-left: 100px;
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

        <div id="aDiv" style="width:350px;text-align:center;margin-top:40px;color:white;">
			<br>
			<h3>Create a DreamJob Account</h3>
		</div>
		<div id="bDiv" align="center">
			<br>
			<form:form action="jobSeekerSubmitForm"
				modelAttribute="jobSeekerSignUp">
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
					
					
						<label>Contact No : </label>
						<form:input type="text" path="contactNumber"
								name="contactNumber" />
						<form:errors path="contactNumber" cssClass="error" />
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

						<label> Zip :</label>
						<form:input type="number" name="zip" path="zip" />
						<form:errors path="zip" cssClass="error" />
						<br>
						<br>
						<br>
						<br>
					
						
					

						<input type="submit" value="Sign Up">
					

				</form:form>
		</div>
		<div id="cDiv" align="left">
			<p align="left"><a href="getJobSeekerSignInFormForHomePage">go back</a></p>
				
		</div>
	</div>
	
</html>