<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*" import="com.project.dreamjob.domain.Skill"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<%-- <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Job Posting Conformation Page</title>
<style type="text/css">
#aDiv {
	width: 500px;
	padding-left: 0px;
	color: white;
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

#bDiv {
	margin-top: 30px;
	width: 50%;
	padding: 8px 8px;
	margin: 2px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
	float: left;
	background-color: white;
}

#container {
	width: 1200px;
	height: 800px;
}

#list {
	margin-left: 10px;
}

body {
	background-image: url("resources/img/a.png");
	backgrond-repeat: no-repeat;
	background-size: 1500px 1000px;
}

form {
	margin-bottom: 40px;
	margin-top: 60px;
	background-color: #8fbbbc;
	color: black;
	height: 650px;
	border-radius: 8px;
}

input[type=text], input[type=password], input[type=numeric], select {
	width: 50%;
	padding: 8px 8px;
	margin: 2px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
	float: left;
}

input[type=submit] {
	width: 50%;
	background-color: #00264d;
	color: white;
	padding: 8px 8px;
	margin: 8px 0;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	margin-right: 30px;
	margin-top: 40px;
	float: right;
}
</style>
</head>

<div id="body" align="center">
	<div id="container">
		<div id="aDiv" align="center">
			<br>
			<!-- <h1>Successfully Posted Job!</h1> -->

			<form:form action="submitJobPostingForm" modelAttribute="jobPosted">
				<br>
				<br>
				<h2>Review Information</h2>
				<br>
                <label> Posted by:</label> 
                <form:input path="recruiterEmail" name="recruiterEmail" />
                <br>
                <br>
				<label>City:</label>
				<form:input path="city" name ="city" />
				<br>
				<br>
				<label>Company Name:</label>
				<form:input path="companyName" name ="companyName"  />
				<br>
				<br>
				<label>country:</label>
				<form:input path="country" name = "country"  />
				<br>
				<br>
				<label>EmploymentType:</label>
				<form:input path="employmentType" name = "employmentType" />
				<br>
				<br>
				<label>JobField:</label>
				<form:input path="jobField" name = "jobField" />
				<br>
				<br>
				<label>JobTitle:</label>
				<form:input path="jobtitle" name = "jobtitle" />
				<br>
				<br>
				<label>SeniorityLevel:</label>
				<form:input path="seniorityLevel" name="seniorityLevel"  />
				<br>
				<br>
				<label>State:</label>
				<form:input path="state" name = "state" />
				<br>
				<br>
				<label>Zip:</label>
				<form:input path="zip" name="zip"  />
				<br>
				<br>


				<label>Technologies:</label>
				
				<textarea  rows="4" cols="25" name="technologies" >
				 <c:forEach items="${jobPosted.technologies}" var="userForm">
						<c:out value="${userForm.getTechnology()}" />
						<c:out value=","/>
				</c:forEach>
				</textarea>
				
				<div id="bDiv" align="center" name ="technologies">
					<c:forEach items="${jobPosted.technologies}" var="userForm">
						<c:out value="${userForm.getTechnology()}" />
					</c:forEach>
				</div>
				<input type="Submit" value="Post" />
				<br>
				<br>

				 <a
					href="getJobPostingForm?city=${jobPosted.city}&companyName=${jobPosted.companyName}&country=${jobPosted.country}&employmentType=${jobPosted.employmentType}&jobField=${jobPosted.jobField}&jobtitle=${jobPosted.jobtitle}&recruiterEmail=${jobPosted.recruiterEmail}&seniorityLevel=${jobPosted.seniorityLevel}&state=${jobPosted.state}&technologies=${jobPosted.technologies}&zip=${jobPosted.zip}">edit</a> 
			</form:form>


		</div>
	</div>
</div>

</html> --%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Job Posting Conformation Page</title>
<style type="text/css">
a {text-decoration: none;
color: white;
background-color: #00264d;
width: 20%;
padding: 10px 10px;
margin: 8px 0;
border-radius: 4px;
cursor: pointer;
margin-right: 30px;
margin-top: 40px;
float: right;
}

#aDiv {
	width: 500px;
	padding-left: 0px;
	color: white;
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

#bDiv {
	margin-top: 30px;
	width: 50%;
	padding: 8px 8px;
	margin: 2px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
	float: left;
	background-color: white;
}

#container {
	width: 1200px;
	height: 700px;
}

#list {
	margin-left: 10px;
}

body {
	background-image: url("resources/img/a.png");
	backgrond-repeat: no-repeat;
	background-size: cover;
}

form {
	margin-bottom: 40px;
	margin-top: 60px;
	background-color: #8fbbbc;
	color: black;
	height: 670px;
	border-radius: 8px;
}

input[type=text], input[type=password], input[type=numeric], select {
	width: 50%;
	padding: 8px 8px;
	margin: 2px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
	float: left;
}

input[type=submit] {
	width: 25%;
	background-color: #00264d;
	color: white;
	padding: 12px 10px;
	margin: 10px 0;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	margin-right: 30px;
	margin-top: 40px;
	float: right;
	font-size: 12px;
}

</style>
</head>

<div id="body" align="center">
	<div id="container">
		<div id="aDiv" align="center">
			<br>
			<!-- <h1>Successfully Posted Job!</h1> -->

			<form:form action="submitJobPostingForm" modelAttribute="jobPosted">
				<br>
				<br>
				<h2>Review Information</h2>
				
                <label> Posted by:</label> 
                <form:input path="recruiterEmail" name="recruiterEmail" />
                <br>
                <br>
				<label>City:</label>
				<form:input path="city" name ="city" />
				<br>
				<br>
				<label>Company Name:</label>
				<form:input path="companyName" name ="companyName"  />
				<br>
				<br>
				<label>country:</label>
				<form:input path="country" name = "country"  />
				<br>
				<br>
				<label>EmploymentType:</label>
				<form:input path="employmentType" name = "employmentType" />
				<br>
				<br>
				<label>JobField:</label>
				<form:input path="jobField" name = "jobField" />
				<br>
				<br>
				<label>JobTitle:</label>
				<form:input path="jobtitle" name = "jobtitle" />
				<br>
				<br>
				<label>SeniorityLevel:</label>
				<form:input path="seniorityLevel" name="seniorityLevel"  />
				<br>
				<br>
				<label>State:</label>
				<form:input path="state" name = "state" />
				<br>
				<br>
				<label>Zip:</label>
				<form:input path="zip" name="zip"  />
				<br>
				<br>


				<label>Technologies:</label>
				
				<textarea  id = 'thisarea' rows="4" cols="25" name="technologies" >
				
				  <c:forEach items="${jobPosted.technologies}" var="userForm">
						<c:out value="${userForm.getTechnology()}" />
						<c:out value=","/>
				</c:forEach> 
				
				</textarea>
	
				<input type="Submit" value="Post" />
				
				 <a
					href="getJobPostingForm?city=${jobPosted.city}&companyName=${jobPosted.companyName}&country=${jobPosted.country}&employmentType=${jobPosted.employmentType}&jobField=${jobPosted.jobField}&jobtitle=${jobPosted.jobtitle}&recruiterEmail=${jobPosted.recruiterEmail}&seniorityLevel=${jobPosted.seniorityLevel}&state=${jobPosted.state}&technologies=${jobPosted.technologies}&zip=${jobPosted.zip}">Edit</a> 
			</form:form>


		</div>
	</div>
</div>

</html>