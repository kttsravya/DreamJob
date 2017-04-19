<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%-- <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JobSeeker Profile Form</title>
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
			<h2 align="center" style="color: white;"> Step 1:  Enter Profile Info</h2>

			<form:form action="submitJobSeekerProfileForm" modelAttribute="jobSeekerProfile">
				<br> <br>
				<table cellspacing="20">
					<tr>
						<td>Email<span class="req">*</span>
						</td>
						<td><form:input type="text" id="email" name="email" path="email" /></td>
					</tr>
					<tr>
						<td>Degree</td>
						<td><form:select type="text" id="degree" name="degree" path="degree"  items="${allDegreeTypes}"/></td>
					</tr>

					<tr>
						<td>Skills :</td>
						<td><textarea rows="4" cols="25" name="skills"></textarea></td>
					</tr>

					<tr>
						<td>Field of Study :</td>
						<td><form:select type="text" id="fieldOfStudy" path="fieldOfStudy" items="${allFieldOfStudy}"
							placeholder="IT/EE" /></td>
					</tr>

					<tr>
						<td>Job Title :</td>
						<td><form:select type="text" id="jobTitle" path="jobTitle"
							items="${allJobTitles}" /></td>
					</tr>
					<tr>
						<td>Job Type:</td>
						<td><form:select name="jobType" path="jobType" items="${allJobTypes}">		
						</form:select></td>
					</tr>
					<tr>
						<td>Experience:</td>
						<td><form:select id="experience" path="experience" items="${allExperiences}"/></td>
					</tr>
					
					<!-- <tr>
					
					<td><a href="singleUpload"> Upload a resume Here </a></td>
					
					</tr> -->

				</table>

				<button type="Submit" id="Log In">Update</button>
			</form:form>
			
			
		</div>
	</div>
	
	
	
</body>
</html> --%>

<%-- <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JobSeeker Profile Form</title>
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
    <h2 align="center" style="color:white;"> Update Profile</h2>


			<form:form action="submitJobSeekerProfileForm" modelAttribute="jobSeekerProfile">
				<table cellspacing="20">
					<tr>
						<td>Email<span class="req">*</span>
						</td>
						<td><form:input type="text" id="email" name="email" path="email" /></td>
					</tr>
					<tr>
						<td>Degree</td>
						<td><form:select type="text" id="degree" name="degree" path="degree"  items="${allDegreeTypes}"/></td>
					</tr>

					<tr>
						<td>Skills :</td>
						<td><textarea rows="4" cols="25" name="skills"></textarea></td>
					</tr>

					<tr>
						<td>Field of Study :</td>
						<td><form:select type="text" id="fieldOfStudy" path="fieldOfStudy" items="${allFieldOfStudy}"
							placeholder="IT/EE" /></td>
					</tr>

					<tr>
						<td>Job Title :</td>
						<td><form:select type="text" id="jobTitle" path="jobTitle"
							items="${allJobTitles}" /></td>
					</tr>
					<tr>
						<td>Job Type:</td>
						<td><form:select name="jobType" path="jobType" items="${allJobTypes}">		
						</form:select></td>
					</tr>
					<tr>
						<td>Experience:</td>
						<td><form:select id="experience" path="experience" items="${allExperiences}"/></td>
					</tr>
					
					<!-- <tr>
					
					<td><a href="singleUpload"> Upload a resume Here </a></td>
					
					</tr> -->

				</table>

				<button type="Submit" id="Log In">Update</button>
			</form:form>
			
			
		</div>
	</div>
	</div>
	
	
</body>
</html> --%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JobSeeker Profile Form</title>
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

#bDiv  {
  width: 500px;
  padding-left: 0px;

}

#bDiv label  {
    display: inline-block;
    float: left;
    clear: left;
    width: 40%;
    text-align: right;
    padding: 8px 10px;
    margin: 2px 0;

}
#container {
	width: 1200px;
	height: 800px;
}
body {
	background-image: url("resources/img/a.png");
	background-repeat: no-repeat;
	background-size: cover
	/* cover */
	/* 1500px 1000px; */
}
form {
	margin-bottom: 40px;
	background-color: #8fbbbc;
	color: black;
	height: 400px;
	border-radius: 8px;
	}

input[type=text],input[type=numeric], select {
	width: 50%;
	padding: 6px 8px;
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
    font:normal 18px/22px Arial;
    color:black;
    border:1px solid #ccc;

}
input[type=submit] {
	width: 50%;
	background-color: #00264d;
	color: white;
	padding: 10px 10px;
	margin: 10px 0;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	margin-left: 190px;
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
        <br>
		<div id="aDiv"
			style="width: 400px;text-align: center;margin-top: 20px; color: white;">
			<br>
			<h1>Create or Update Profile</h1>
		</div>

		<div id="bDiv" align="center">
			<br>
			<form:form action="submitJobSeekerProfileForm" modelAttribute="jobSeekerProfile">
			<br>
			<label> Email:</label>
				<form:input type="text" name="email" id="email" path = "email"></form:input>
				<br><br>
			
				<label>Degree</label>
				<form:select type="text" id="degree" name="degree" path="degree"  items="${allDegreeTypes}"></form:select>
				<br><br>
				
				<label>Skills :</label>
				<textarea rows="4" cols="25" name="skills"></textarea>
				<br><br>

				<label>Field of Study :</label>
				<form:select type="text" id="fieldOfStudy" path="fieldOfStudy" items="${allFieldOfStudy}"></form:select>
				<br><br>
				
				<label>Job Title :</label>
				<form:select type="text" id="jobTitle" path="jobTitle" items="${allJobTitles}" ></form:select>
				<br><br>
					
				<label>Job Type:</label>
				<form:select name="jobType" path="jobType" items="${allJobTypes}"></form:select>
				<br><br>
					
				<label>Experience:</label>
				<form:select id="experience" path="experience" items="${allExperiences}"></form:select>
				<br><br><br>
				
				<input type="Submit" value="Create">
				
			</form:form>
			
</div>
		<div id="cDiv" align="left">
			<p><a href="getJobSeekerHomePage">Back to JobSeeker Home </a></p>
				
		</div>
	</div>
	</body>
</html>