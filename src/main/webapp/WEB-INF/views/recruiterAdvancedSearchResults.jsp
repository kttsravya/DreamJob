<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%-- <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Recruiter Advance serach result page</title>
</head>

<body>
	<h2>list of profiles that matched advanced search requirements</h2>

	<table>
		<tr>

			<th>JobSeekerName</th>
			<th>JobSeekerEmailId</th>
			<th>JobSeekerResume</th>
			<th>JobSeekerDegree</th>
			<th>JobSeekerExperience</th>
			<th>JobSeekerCity</th>

		</tr>

		<form:form action="getRecruiterMenuPage"
			modelAttribute="jobSeekerInfoList">


			<c:forEach items="${jobSeekerInfoList}" var="userForm">
				<tr>
					<td><c:out value="${userForm.getSignUp().getName()}" /></td>
					<td><a href="email?emailId=${userForm.getSignUp().getEmail()}"><c:out
								value="${userForm.getSignUp().getEmail()}" /></a></td>
					<td><a
						href="download.do?jobSeekerId=${userForm.getSignUp().getJobSeekerId()}"><c:out
								value="${userForm.getDoc().getName()}" /></a></td>
					<td><c:out value="${userForm.getProfile().getDegree()}" /></td>
					<td><c:out value="${userForm.getProfile().getExperience()}" /></td>
					<td><c:out value="${userForm.getSignUp().getCity()}" /></td>
				</tr>

			</c:forEach>




		</form:form>





	</table>

	<a href="getRecruiterMenuPage">home page</a>



</body>
</html> --%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Recruiter Advance search result page</title>
<style type="text/css">
a {
/* text-decoration: none; */
color: white;
font-size: 20px;
}
body{
	background-image: url("resources/img/a.png");
  background-size: cover;
}
#container{
  width:1200px;
  height: 700px;
}
form{
  margin-bottom:20px;
  background-color:#8fbbbc; color: black;
  height:550px;
  margin-right: 40px;
}
#bDiv{
  width: 1200px;
}
</style>
</head>

<div id="body" align="center">
<div id="container">
  <div id="aDiv" style="width:650px;text-align:center;margin-top:20px;color:white;">
    <br>
	<h2>list of profiles that matched advanced search requirements</h2>
</div>
<div id="bDiv" align="center">
<br>
<form:form action="getRecruiterMenuPage"
			modelAttribute="jobSeekerInfoList">
<br>			
	<table border="0">
	    <tr>
	    
	    <th width="10%"> JobSeekerName </th>
	    <th width="20%"> JobSeekerEmailId</th>
	    <th width="5%"> JobSeekerResume</th>
	    <th width="5%">JobSeekerDegree</th>
	    <th width="5%"> JobSeekerExperience</th>
	    <th width="5%">JobSeekerCity</th>
	    
	    </tr>

		<c:forEach items="${jobSeekerInfoList}" var="userForm">
                    <tr>
						<td><c:out value="${userForm.getSignUp().getName()}" /></td>
						<td><a href="email?emailId=${userForm.getSignUp().getEmail()}"><c:out
								value="${userForm.getSignUp().getEmail()}" /></a></td>
						<td><a
							href="download.do?jobSeekerId=${userForm.getSignUp().getJobSeekerId()}"><c:out
								value="${userForm.getDoc().getName()}" /></a></td>
						<td><c:out value="${userForm.getProfile().getDegree()}" /></td>
						<td><c:out value="${userForm.getProfile().getExperience()}" /></td>
						<td><c:out value="${userForm.getSignUp().getCity()}" /></td>
					</tr>
						
					</c:forEach>
				
		</table>

		</form:form>

	<!--  <a href="getRecruiterMenuPage">home page</a>  -->

</div>
<div id="cDiv" align="left">
			<p><a href="getRecruiterHomePage">Back to Recruiter home </a></p>
				
		</div>
</div>
</div>
</body>
</html>
