<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%-- <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Post a job page</title>
<style type="text/css">
#container {
	width: 1500px;
	background-color: #00264d;
	height: 1000px;
}

#cDiv {
	width: 600px;
	background-color: #ffffff;
	height: 600px;
	margin: 0 auto;
}

 form {
	background-color: white;
	height: 600px;
} 

.error {
	color: red;
	font-weight: bold;
}
</style>
</head>
<body>
	<div id="container">
		<div id="cDiv" align="center"
			style="width: 600px; margin-left: 500px; border: 1px; text-align: center; color: black;">
            	
			
				<form:form action="submitJobPostingForm"
					modelAttribute="postingObject">
			   <form:errors path="*" cssClass="error" />		

				        <h1>Post a Job</h1>
				    <table border="0" width="90%">    
					<tr>
						<td>Recruiter Email:</td>
						<td><input type="text" name="recruiterEmail" required></input></td>
						
					</tr>
					<tr>
						<td>Job Title :</td>
						<td><form:select name="jobtitle" path="jobtitle"
								items="${jobtitles}"></form:select></td>
						<td><form:errors path="jobtitle" cssClass="error" /></td>		
					</tr>
					<tr>
						<td>Employment Type :</td>
						<td><form:select name="employmentType" path="employmentType"
								items="${jobtypes}"></form:select></td>
						<td><form:errors path="employmentType" cssClass="error" /></td>		
					</tr>
					<tr>

						<td>Job Field:</td>
						<td><form:select name="jobField" path="jobField"
								items="${jobFields}"></form:select></td>
						<td><form:errors path="jobField" cssClass="error" /></td>		

					</tr>
					<tr>

						<td>Company Name:</td>
						<td><form:select name="companyName" path="companyName"
								items="${companies}"></form:select></td>
						<td><form:errors path="companyName" cssClass="error" /></td>		

					</tr>

					<tr>
						<td>Seniority Level :</td>
						<td><form:select name="seniorityLevel" path="seniorityLevel"
								items="${seniorityLevel}"></form:select></td>
						<td><form:errors path="seniorityLevel" cssClass="error" /></td>		
					</tr>

					<tr>
						<td>Technology:</td>
						<td><textarea rows="4" cols="25" name="technologies"></textarea></td>
						<td><form:errors path="technologies" cssClass="error" /></td>
					</tr>

					<tr>
						<td><br> City:</td>
						<td><form:select name="city" path="city" items="${cities}"></form:select></td>
						<td><form:errors path="city" cssClass="error" /></td>
					</tr>
					<tr>
						<td><br> State:</td>
						<td><form:select name="state" path="state" items="${states}"></form:select></td>
						<td><form:errors path="state" cssClass="error" /></td>

					</tr>
					<tr>
						<td><br> Country:</td>
						<td><form:select name="country" path="country"
								items="${countries}"></form:select></td>
						<td><form:errors path="country" cssClass="error" /></td>		
					</tr>

					<tr>
						<td><br> ZIP:</td>
						<td><input type="numeric" name="zip" required></input></td>
						

					</tr>
					<tr>

					<td align="center"><input type="Submit" value="Post"
						style="font-size: 10pt; background-color: deepskyblue"></td>

                   </tr>
                   </table>
				</form:form>
			
		</div>
	</div>

</body>
</html> --%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Post a Job</title>
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
	margin-bottom: 20px;
	background-color: #8fbbbc;
	color: black;
	height: 500px;
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
	margin-right: 30px;
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
			<h1>Post A Job</h1>
		</div>

		<div id="bDiv" align="center">
			<br>
			<form:form action="getJobPostingConformationPage"
				modelAttribute="postingObject">
				<form:errors path="*" cssClass="error" />
				<br>
				<label>Recruiter Email:</label>
				<form:input type="text" name="recruiterEmail"  path = "recruiterEmail"></form:input>
				<form:errors path="recruiterEmail" cssClass="error" />
				<br>
				<br>

				<label>Job Title :</label>
				<form:select name="jobtitle" path="jobtitle" items="${jobtitles}"></form:select>
				<form:errors path="jobtitle" cssClass="error" />
				<br>
				<br>

				<label>Employment Type :</label>
				<form:select name="employmentType" path="employmentType"
					items="${jobtypes}"></form:select>
				<form:errors path="employmentType" cssClass="error" />
				<br>
				<br>

				<label>Job Field:</label>
				<form:select name="jobField" path="jobField" items="${jobFields}"></form:select>
				<form:errors path="jobField" cssClass="error" />
				<br>
				<br>

				<label>Company Name:</label>
				<form:select name="companyName" path="companyName"
					items="${companies}"></form:select>
				<form:errors path="companyName" cssClass="error" />
				<br>
				<br>

				<label>Seniority Level :</label>
				<form:select name="seniorityLevel" path="seniorityLevel"
					items="${seniorityLevel}"></form:select>
				<form:errors path="seniorityLevel" cssClass="error" />
				<br>
				<br>

				<label>Technology:</label>
				<textarea  rows="4" cols="25" name="technologies" ></textarea>
				<form:errors path="technologies" cssClass="error" />
				

				<label>City:</label>
				<form:select name="city" path="city" items="${cities}"></form:select>
				<form:errors path="city" cssClass="error" />
				<br>
				<br>

				<label>State:</label>
				<form:select name="state" path="state" items="${states}"></form:select>
				<form:errors path="state" cssClass="error" />
				<br>
				<br>

				<label>Country:</label>
				<form:select name="country" path="country" items="${countries}"></form:select>
				<form:errors path="country" cssClass="error" />
				<br>
				<br>

				<label>ZIP:</label>
				<form:input type="numeric"  name="zip" value="${postingObject.zip}" path="zip" ></form:input>
				<form:errors path="zip" cssClass="error" />
				<br>
				<br>

				<td><input type="Submit" value="Post"></td>

			</form:form>
		</div>
		<div id="cDiv" align="left">
			<p><a href="getRecruiterHomePage">Back to Recruiter home </a></p>
				
		</div>
	</div>
	</body>
</html>
