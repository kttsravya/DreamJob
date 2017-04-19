<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<%-- <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JobSeeker Menu Page</title>
<style type="text/css">
form {
	background-color: white;
	color: black;
	height: 500px;
}
</style>
</head>

<body style="background-color: #00264d;">

	<div id="container" align="center">

		<div id="aDiv"
			style="width: 500px; height: 550px; text-align: center; position: right;">
			<br>
			<h3 align="left" style="color: white;">
				<a
					href="getJobSeekerProfileForm?email=${jobSeekerSignUpObject.email}"
					style="color: white;">Create Your Profile In DreamJob Using
					Simple Two Step Process By Clicking On This Link</a>
			</h3>
			<h3 align="left" style="color: white;">Advance Search:</h3>

			<form action="getResultsForJobSeekerAdvancedSearch">
				<br> <br>
				<table cellspacing="20">

					<tr>

						<td>Job Type:</td>

						<td><select name="jobType">
								<option value="FullTime">FullTime</option>
								<option value="Intern">Intern</option>
								<option value="Contracting">Contracting</option>

						</select></td>
					</tr>

					<tr>
						<td>Field of Study :</td>
						<td><select name="FieldOfStudy">
								<option value="ComputerScience">ComputerScience</option>
								<option value="Electrical">Electrical</option>
								<option value="Mechanical">Mechanical</option>
								<option value="InformationTechnology">InformationTechnology</option>
						</select></td>
					</tr>

					<tr>
						<td>Job Title :</td>
						<td><select name="jobTitle">
								<option value="Developer">Developer</option>
								<option value="Designer">Designer</option>
								<option value="Tester">Tester</option>
								<option value="Manager">Manager</option>
						</select></td>
					</tr>
					<tr>
						<td>Experience:</td>
						<td><select name="experience">
								<option value="Fresher">Fresher</option>
								<option value="Mid-Level">Mid-Level</option>
								<option value="Senior-Level">Senior-Level</option>
						</select></td>
					</tr>

					<!-- <tr>
						<td><label>Zip : </label></td>
						<td><input type="number" name="zip" max="30"  /></td>
						
					</tr> -->

					<tr>
						<td><label>Zip : </label> <input type="number" name="zip"
							 required/></td>


						<td><label> radius:</label> <input type="number"
							name="radius"  required/></td>

					</tr>
				</table>




				<button type="Submit" id="Log In">Update</button>
			</form>
		</div>
	</div>
</body>
</html> --%>

<%-- <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JobSeeker Menu Page</title>
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
    height: 500px;
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
			<h3 align="left" style="color: white;">
				<a
					href="getJobSeekerProfileForm?email=${jobSeekerSignUpObject.email}"
					style="color: white;">Create Your Profile In DreamJob Using
					Simple Two Step Process By Clicking On This Link</a>
			</h3>
			<h3 align="left" style="color: white;">Advance Search:</h3>

			<form action="getResultsForJobSeekerAdvancedSearch">
				<table cellspacing="20">

					<tr>

						<td>Job Type:</td>

						<td><select name="jobType">
								<option value="FullTime">FullTime</option>
								<option value="Intern">Intern</option>
								<option value="Contracting">Contracting</option>

						</select></td>
					</tr>

					<tr>
						<td>Field of Study :</td>
						<td><select name="FieldOfStudy">
								<option value="ComputerScience">ComputerScience</option>
								<option value="Electrical">Electrical</option>
								<option value="Mechanical">Mechanical</option>
								<option value="InformationTechnology">InformationTechnology</option>
						</select></td>
					</tr>

					<tr>
						<td>Job Title :</td>
						<td><select name="jobTitle">
								<option value="Developer">Developer</option>
								<option value="Designer">Designer</option>
								<option value="Tester">Tester</option>
								<option value="Manager">Manager</option>
						</select></td>
					</tr>
					<tr>
						<td>Experience:</td>
						<td><select name="experience">
								<option value="Fresher">Fresher</option>
								<option value="Mid-Level">Mid-Level</option>
								<option value="Senior-Level">Senior-Level</option>
						</select></td>
					</tr>

					<!-- <tr>
						<td><label>Zip : </label></td>
						<td><input type="number" name="zip" max="30"  /></td>
						
					</tr> -->

					<tr>
						<td><label>Zip : </label> <input type="number" name="zip"
							 required/></td>


						<td><label> radius:</label> <input type="number"
							name="radius"  required/></td>

					</tr>
				</table>




				<button type="Submit" id="Log In">Search</button>
			</form>
		</div>
	</div>
	</div>
</html> --%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JobSeeker Menu Page</title>
<style type="text/css">
a {text-decoration: none;
color: white;
font-size: 20px;
}
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
    padding: 8px 10px;
    margin: 2px 0;
}
#container{
  width:1200px;
  height: 800px;
}
body{
	background-image: url("resources/img/a.png");
    background-size: 1000px 1000px;
}

form{
  margin-bottom:40px;
  background-color:#8fbbbc; color: black;
  height:370px;
  border-radius: 8px;
}

input[type=numeric], select {
	width: 50%;
	padding: 4px 8px;
	margin: 2px 0;
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
    font:normal 16px/18px Arial;
    color:black;
    border:1px solid #ccc;

}

input[type=submit] {
	width: 50%;
	background-color: #00264d;
	color: white;
	padding: 10px 10px;
	margin: 6px 0;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	margin-right: 30px;
}
</style>
</head>

<div id="body" align="center">
<div id="container">
		<div id="topbar">
			<a href="mainhomepage"><img src="resources/img/logo.png"></a>
			DREAM JOB
		</div>
<div id="aDiv"
			style="width: 500px;text-align: center;margin-top: 20px; color: white;">
			<br><br><br><br>
<h2>Advance Search</h2>	
</div>
<div id="bDiv" align="center">
		<br>
			<form action="getResultsForJobSeekerAdvancedSearch">
			<br><br> 
			
				<label>Job Type:</label>

						<select name="jobType">
								<option value="FullTime">FullTime</option>
								<option value="Intern">Intern</option>
								<option value="Contracting">Contracting</option>

						</select><br><br>
	
						<label>Field of Study :</label>
						<select name="FieldOfStudy">
								<option value="ComputerScience">ComputerScience</option>
								<option value="Electrical">Electrical</option>
								<option value="Mechanical">Mechanical</option>
								<option value="InformationTechnology">InformationTechnology</option>
						</select><br><br>
						
						<label>Job Title :</label>
						<select name="jobTitle">
								<option value="Developer">Developer</option>
								<option value="Designer">Designer</option>
								<option value="Tester">Tester</option>
								<option value="Manager">Manager</option>
								</select><br><br>
								
						<label>Experience:</label>
						<select name="experience">
								<option value="NewGrad">NewGrad</option>
								<option value="Mid-Level">Mid-Level</option>
								<option value="Senior-Level">Senior-Level</option>
						</select><br><br>
					
					
						<label>Zip : </label> 
						<input type="numeric" name="zip" required/>
						<br><br>

						<label> radius:</label> 
						<input type="numeric" name="radius"  required/></td>
						<br><br>
						<br>
						<br>
					
						<input type="submit" value="Search">
								</form>
							</div>

<div id="cDiv" align="left">
			<p><a href="getJobSeekerHomePage">Back to JobSeeker Home </a></p>		
		</div>
	</div>
</div>
</html>