<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*" import="com.project.dreamjob.domain.Skill"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Profile Conformation Page</title>

<style type="text/css">
a.class2 {text-decoration: none;
color: white;
font-size: 20px;
}
a.class1 {
text-decoration: none;
color: blue;
font-style:italic;
margin-left:190px;
text-decoration: underline;
font-size: 25px;
}
#aDiv{
  width: 500px;
  padding-left: 0px;
  color: white;

}
#aDiv label{
    display: inline-block;
    float: left;
    clear: left;
    width: 40%;
    text-align: right;
    padding: 8px 10px;
    margin: 2px 0;

}
#bDiv{
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
#container{
  width: 1200px;
  height: 800px;
}

#list{
margin-left: 10px;
}
body{
  background-image: url("resources/img/a.png");
  backgrond-repeat: no-repeat;
  background-size: 1500px 1000px;
}

form{
  margin-bottom: 40px;
  margin-top:60px;
  background-color:#8fbbbc; 
  color: black;
  height:520px;
  border-radius: 8px;
}
input[type=text],input[type=password],input[type=numeric],select {
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

<div id ="body" align="center">
<div id="container">
<div id="aDiv" align="center">
<br>
	<h1>Successfully Created Profile</h1>

		<form:form modelAttribute="jobSeekerProfile">
		<br><br>
            <h2>Review Information</h2>
	         <br>
	         
			 <label>email:</label>
			<form:input path="email" disabled="true" />
			<br><br>
			
			<label>degree:</label>
			<form:input path="degree" disabled="true" />
			<br><br>
			
			<label>experience:</label>
			<form:input path="experience" disabled="true" />
			<br><br>
			
			<label>fieldOfStudy:</label>
			<form:input path="fieldOfStudy" disabled="true" />
			<br><br>
			
			<label>jobTitle:</label>
			<form:input path="jobTitle" disabled="true" />
			<br><br>
			
			<label>jobType:</label>
			<form:input path="jobType" disabled="true" />
			<br><br>
			
			<label>Skills:</label>
			<div id="bDiv" align="center" >
			<c:forEach items="${jobSeekerProfile.skills}" var="userForm">
				<c:out value="${userForm.getSkill()}" />
			</c:forEach>
			</div>
			<br><br><br>
			<div id="cDiv" align="center"><br>
			<p><a href="singleUpload?email=${jobSeekerProfile.email}" class="class1"> upload resume here</a></p>
			</div>
		</form:form>
		</div>
		<div id="cDiv" align="left" >
			<p><a href="getJobSeekerHomePage" class="class2">Back to JobSeeker Home </a></p>
				
		</div>
</div>
</div>
</body>
</html> 

<%--  <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ProfileConformationPage</title>
</head>
<body>
	<h1 style="color: blue;">Upload Your Resume</h1>
	<h2>review information</h2>
	<table>

		<form:form modelAttribute="jobSeekerProfile">


			 <label>email:</label>
			<form:input type="text" path="email" />
			<br>
			<label>degree:</label>
			<form:input path="degree" />
			<br>
			<label>experience:</label>
			<form:input path="experience" />
			<br>
			<label>fieldOfStudy:</label>
			<form:input path="fieldOfStudy" />
			<br>
			<label>jobTitle:</label>
			<form:input path="jobTitle" />
			<br>
			<label>jobType:</label>
			<form:input path="jobType" />
			<br>
			<label>Skills:</label>
			<c:forEach items="${jobSeekerProfile.skills}" var="userForm">
				<c:out value="${userForm.getSkill()}" />
				<br>
			</c:forEach>

		</form:form>
		
		<tr>
		<td><h2> Upload your resume Here</h2></td>
		<td><a href="singleUpload?email=${jobSeekerProfile.email}"> upload resume here</a>
		</tr>


	</table>

	<a href="getJobSeekerMenuPage">go back</a>

</body>
</html>  --%>

 <%-- <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ProfileConformationPage</title>

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
#body{
	background-image: url("resources/img/a.jpg");
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
input[type=submit] {
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

   <h2> Review Of Information</h2>
    

		<form:form modelAttribute="jobSeekerProfile">
        <table cellspacing="20"  >
				
			 <tr>
				 <td>email:</td>
				 <td>
				 <form:input path="email" />
				</td>
			</tr>
			
			 <tr>
				 <td>degree:</td>
				 <td>
				 <form:input path="degree" />
				</td>
			</tr>
			
			  <tr>
				 <td>Experience:</td>
				 <td>
				 <form:input path="experience" />
				</td>
			</tr>
			
			 <tr>
				 <td>Field Of Study:</td>
				 <td>
				 <form:input path="fieldOfStudy" />
				</td>
			</tr>
			<tr>
				 <td>Job Title:</td>
				 <td>
				 <form:input path="jobTitle" />
				</td>
			</tr>
			<tr>
				 <td>Job Type:</td>
				 <td>
				 <form:input path="jobType" />
				</td>
			</tr>
			<tr>
				 <td>Skills:</td>
				 <td>
				 <c:forEach items="${jobSeekerProfile.skills}" var="userForm">
				 <c:out value="${userForm.getSkill()}" />
			     </c:forEach>
				</td>
			</tr>
			

			</table>
			
		<h2 > Upload Your Resume Here</h2>
		<p align="right" style="color:white;"><a href="singleUpload?email=${jobSeekerProfile.email}"> Upload Resume Here</a></p>
		<p align="right" style="color:white;"><a href="getJobSeekerMenuPage" style="color:white;">go back</a></p>
        </form:form>
		
				
</div>
</div>
</div>
</html> --%>