<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%-- <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JobSeeker Sign In form</title>
<style type="text/css">
form {
	background-color: white;
	color: black;
	height: 300px;
}
</style>
</head>
<body style="background-color: #00264d; color: white;">
	<div id="container" align="center">

		<div id="aDiv"
			style="width: 400px; height: 350px; text-align: center; position: right;">
			<br>
			<p>Sign In with DreamJob Account</p>
			<form action="validateJobSeekerSignInDetails">
				<br> <br> <label>Email <input id="EmailAddress"
					maxlength="100" name="EmailAddress"
					placeholder="Your email Address" type="email" value=""></input><br>
					<br>
				</label> <label> Password <input id="Password" name="Password"
					placeholder="Your password" type="password" value="" /> <br>
					<br>
				</label>
				<!-- </label> <input type="checkbox" checked="checked"> Remember me<br><br> -->

				<button type="Submit" id="Log In">Sign In</button>

				<div align="center">
					<p>
						Don't have an Account?<a href="jobSeekerSignUpForm">Sign Up
							for Free</a>
					</p>
					<!-- <button type="Submit">Sign Up</button> -->
				</div>
			</form>

		</div>

	</div>




</body>
</html> --%>

<%-- <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JobSeeker Sign In form</title>
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
    margin-top: 50px;
    border: 1px;
    width:100%;
    height:60px;
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
    margin-top: 40px;
    background-color: #8fbbbc; color: black;
    height: 350px;
}
input[type=email],input[type=password],select {
    width: 60%;
    padding: 12px 10px;
    margin: 6px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}
input[type=submit] {
    width: 50%;
    background-color: #00264d;
    color: white;
    padding: 12px 10px;
    margin: 6px 0;
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
<div id = "topmenu" >
  <a href="mainhomepage"><img src="resources/img/home.png" border="0"></a>
</div>

<div id="aDiv"
    style="width:400px; text-align:center;position:right;margin-top:20px;color:white;">
    <br>
    <h2> Sign In with DreamJob Account</h2>


			<form action="validateJobSeekerSignInDetails">
				<br> <br> <label>Email <input id="EmailAddress"
					maxlength="100" name="EmailAddress"
					placeholder="Your email Address" type="email" value=""></input><br>
					<br>
				</label> <label> Password <input id="Password" name="Password"
					placeholder="Your password" type="password" value="" /> <br>
					<br>
				</label>
				<!-- </label> <input type="checkbox" checked="checked"> Remember me<br><br> -->

				<button type="Submit" id="Log In">Sign In</button>

				<div align="center">
					<p>
						Don't have an Account?<a href="jobSeekerSignUpForm">Sign Up
							for Free</a>
					</p>
					<!-- <button type="Submit">Sign Up</button> -->
				</div>
			</form>

		</div>

	</div>




</body>
</html> --%>

<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>JobSeeker Log In</title>
<style type="text/css">


#topbar {
	width: 100%;
	height: 60px;
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
#bDiv{
  width: 500px;
  padding-left: 0px;
}
#bDiv label{
    display: inline-block;
    float: left;
    clear: left;
    width: 40%;
    text-align: center;
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
	margin-top: 20px;
	background-color: #8fbbbc;
	color: black;
	height: 300px;
	border-radius: 8px;
}

input[type=email], input[type=password], select {
	width: 50%;
	padding: 10px 10px;
	margin: 2px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
	float:left;
}
input[type=checkbox] {
  width: 8%;
  padding: 2px 2px;
  margin: 2px 0;
  border: 1px solid #ccc;
  border-radius: 4px;
}

input[type=submit] {
	width: 50%;
	background-color: #00264d;
	color: white;
	padding: 10px 10px;
	margin: 4px 0;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	margin-left:190px;
}
</style>

<div id="body" align="center">
	<div id="container" >
		<div id="topbar">
			<a href="mainhomepage"><img src="resources/img/logo.png"></a>
			DREAM JOB
		</div>
		<div id="aDiv"
		    style="width:350px; text-align:center;margin-top:40px;color:white;">
		    <br>
			<h2>Log In To Your DreamJob Account</h2>
		</div>
	  <div id="bDiv" align="center">
	    <br>
			<form action="validateJobSeekerSignInDetails">
				<br> <br> <label>Email:</label> 
				<input type="email"
					id="EmailAddress" name="EmailAddress"
					placeholder="Your email Address" value=""></input><br>
				<br> <label>Password:</label> <input type="password"
					id="Password" name="Password" placeholder="Your password" value="" /></input><br>
				<br>
				<!--        <input type="checkbox" checked="checked"> Remember me<br><br>-->
				<!-- <input type="checkbox" align="center">Remember Me</input> -->
        <br><br>
				<input type="submit" value="Log In"></input>

				<div id="bDiv" align="center">
					<p>
						Don't have an Account?<a href="jobSeekerSignUpForm">Sign Up
							for Free</a>
					</p>

				</div>
		</div>
	</div>
	</form>
</div>
</html>
