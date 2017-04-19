<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<%-- <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Recruiter Menu Page</title>
<style type="text/css">
#container {
	width: 1500px;
	background-color: #00264d;
	height: 1000px;
}

select {
	width: 140px;
}

form {
	background-color: white;
	height: 300px;
}
</style>
</head>

<body>
	<div id="container">
		<!-- <div id="top" align="center" style="height: 100px; font-size: 32px;">
			<a href="getJobPostingForm" style="display: block; color: white;">Post
				a Job</a>
		</div> -->
		<div align="center"
			style="width: 500px; margin-left: 500px; border: 1px; text-align: center; color: black;">
			<br>
			<form action="AdvancedSearchResults">
				<h1>Advance Search</h1>
				Job Title: <select name="jobTitle">
					<option value="Developer">Developer</option>
					<option value="Designer">Designer</option>
					<option value="Tester">Tester</option>
					<option value="Manager">Manager</option>
				</select> <br> Job Type : <select name="jobType">
					<option value="FullTime">FullTime</option>
					<option value="Intern">Intern</option>
					<option value="Contracting">Contracting</option>
				</select> <br> Job Field: <select name="jobField">
					<option value="ComputerScience">ComputerScience</option>
					<option value="Electrical">Electrical</option>
					<option value="Mechanical">Mechanical</option>
					<option value="InformationTechnology">InformationTechnology</option>
				</select> <br> Experience : <select name="experience">
					<option value="Fresher">Fresher</option>
					<option value="Mid-Level">Mid-Level</option>
					<option value="Senior-Level">Senior-Level</option>
				</select> <br> Degree : <select name="degree">
					<option value="Masters">Masters</option>
					<option value="Bachelors">Bachelors</option>
					<option value="ph.d">ph.d</option>
				</select> <br> Zip : <input type="number" name="zip" required/> radius: <input
					type="number" name="radius" required/> <input type="Submit" value="Search"
					style="font-size: 10pt; background-color: deepskyblue">

			</form>
		</div>
	</div>


</body>
</html> --%>

<%-- <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Advance Search</title>
<style type="text/css">
input[type=text], input[type=number], select {
	width: 40%;
	padding: 10px 8px;
	margin: 2px 0;
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

form {
	background-color: gray;
	height: 400px;
}
</style>
</head>

<body>
	<div id="middle" align="center"
		style="width: 500px; margin-left: 20px; border: 1px; text-align: center; color: black;">
		<br>
		<form action="AdvancedSearchResults">
			<br> <br> <label>Job Title :</label>
			 <select name="jobTitle">
				<option value="Developer">Developer</option>
				<option value="Designer">Designer</option>
				<option value="Tester">Tester</option>
				<option value="Manager">Manager</option>
			</select>
<br> <br>
				<label>Job Type :</label>
				<select name="jobType">
					<option value="FullTime">FullTime</option>
					<option value="Intern">Intern</option>
					<option value="Contracting">Contracting</option>
			</select>
			<br>
			<br>

				<label>Job Field:</label>
				<select name="jobField">
					<option value="ComputerScience">ComputerScience</option>
					<option value="Electrical">Electrical</option>
					<option value="Mechanical">Mechanical</option>
					<option value="InformationTechnology">InformationTechnology</option>
                 </select>
                 
                 <br>
			<br>
                  
					<label>Experience :</label>
					<select name="experience">
						<option value="Fresher">Fresher</option>
						<option value="Mid-Level">Mid-Level</option>
						<option value="Senior-Level">Senior-Level</option>
						</select>
						<br>
			<br>
						<label>Degree :</label>
						
						<select name="degree">
							<option value="Masters">Masters</option>
							<option value="Bachelors">Bachelors</option>
							<option value="ph.d">ph.d</option>
					</select>
						<br>
						
						<label>Zip :</label>
						<input type="number" name="zip" required /> radius:
						<input type="number" name="radius" required />
						<td><input type="submit" value="Search"></td>
		</form>
	</div>
	</div>
</body>
</html> --%>

<%-- <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Advance Search</title>
<style type="text/css">
#aDiv {
	width: 500px;
	padding-left: 0px;
}

#aDiv label {
	display: inline-block;
	float: left;
	clear: left;
	width: 40%;
	text-align: right;
	padding: 8px 10px;
	margin: 2px 0;
}

#container {
	width: 500px;
	height: 200px;
}

body {
	background-image: url("resources/img/a.png");
	background-size: 1000px 1000px;
}

form {
	margin-bottom: 40px;
	background-color: #8fbbbc;
	color: black;
	height: 400px;
}

input[type=numeric], select {
	width: 50%;
	padding: 8px 8px;
	margin: 2px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
	float: left;
}

select {
	cursor: pointer;
	display: inline-block;
	position: relative;
	font: normal 16px/18px Arial;
	color: black;
	border: 1px solid #ccc;
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
		<div id="aDiv" align="center">
			<br>
			<form action="AdvancedSearchResults">
				<br> <br> <label>Job Title :</label>  <select name="jobTitle">
					<option value=""></option>
					<option value="Developer">Developer</option>
				<option value="Designer">Designer</option>
				<option value="Tester">Tester</option>
				<option value="Manager">Manager</option>
				</select><br>
				<br> <label>Job Type :</label><select name="jobType">
					<option value=""></option>
					<option value="FullTime">FullTime</option>
					<option value="Intern">Intern</option>
					<option value="Contracting">Contracting</option>
				</select><br>
				<br> <label>Job Field:</label> <select name="jobField">
					<option value=""></option>
					<option value="ComputerScience">ComputerScience</option>
					<option value="Electrical">Electrical</option>
					<option value="Mechanical">Mechanical</option>
					<option value="InformationTechnology">InformationTechnology</option>
				</select><br>
				<br> <label>Experience:</label> <select name="experience">
					<option value=""></option>
					<option value="Fresher">Fresher</option>
						<option value="Mid-Level">Mid-Level</option>
						<option value="Senior-Level">Senior-Level</option>
				</select><br>
				<br> <label>Degree :</label> <select name="degree">
					<option value=""></option>
					<option value="Masters">Masters</option>
							<option value="Bachelors">Bachelors</option>
							<option value="ph.d">ph.d</option>
				</select><br>
				<br> <label>ZIP :</label> <input type="numeric" name="zip"
					required></input><br>
				<br> <label>Radius :</label> <input type="numeric"
					name="radius" required></input><br>
				<br> <input type="submit" value="Search">

			</form>
		</div>
	</div>
	</body>
</html> --%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Advance Search</title>
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
  height:400px;
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
<h3>Instantly receive qualified candidate resumes</h3>	
</div>
	<div id="bDiv" align="center">
		<br>
		<form action="AdvancedSearchResults">
			<br><br> 
			<label>Job Title :</label>
			 <select name="jobTitle">
			    <option value=""></option>
				<option value="Developer">Developer</option>
				<option value="Designer">Designer</option>
				<option value="Tester">Tester</option>
				<option value="Manager">Manager</option>
			</select>
             <br> <br>
				<label>Job Type :</label>
				<select name="jobType">
				    <option value=""></option>
					<option value="FullTime">FullTime</option>
					<option value="Intern">Intern</option>
					<option value="Contracting">Contracting</option>
			</select>
			<br><br>

				<label>Job Field:</label>
				<select name="jobField">
				    <option value=""></option>
					<option value="ComputerScience">ComputerScience</option>
					<option value="Electrical">Electrical</option>
					<option value="Mechanical">Mechanical</option>
					<option value="InformationTechnology">InformationTechnology</option>
                 </select>
                  <br><br>
                  
					<label>Experience :</label>
					<select name="experience">
					    <option value=""></option>
						<option value="NewGrad">NewGrad</option>
						<option value="Mid-Level">Mid-Level</option>
						<option value="Senior-Level">Senior-Level</option>
						</select>
						<br><br>

						<label>Degree :</label>
						<select name="degree">
						    <option value=""></option>
							<option value="Masters">Masters</option>
							<option value="Bachelors">Bachelors</option>
							<option value="ph.d">ph.d</option>
					</select>
					<br><br>
						
						<label>Zip :</label>
						<input type="numeric" name="zip" required />
						<br><br> 

						<label>Radius :</label>
						<input type="numeric" name="radius" required />
						<br><br>

						<input type="submit" value="Search">
		</form>
	</div>
	<div id="cDiv" align="left">
			<p><a href="getRecruiterHomePage">Back to Recruiter home </a></p>		
		</div>
	</div>
</div>
</html>
