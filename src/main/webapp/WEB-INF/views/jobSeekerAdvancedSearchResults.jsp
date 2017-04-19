<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%-- <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JobSeeker Advance serach result page</title>
</head>

<body>
	<h2>list of Job Postings that matched advanced search requirements</h2>

	<table>
	  <tr>
	  <th> companyName </th>
	  <th> city </th>
	  <th> employment Type </th>
	  <th> jobTitle </th>
	  <th> seniority Level </th>
	  <th> recruiter Email </th>
	  </tr>

		<form:form action="" modelAttribute="list">

			
                
				<c:forEach items="${list}" var="userForm">
				     <tr>
					<td><c:out value="${userForm.getCompanyName()}" /></td>
					<td><c:out value="${userForm.getCity()}" /></td>
					<td><c:out value="${userForm.getEmploymentType()}" /></td>
					<td><c:out value="${userForm.getJobtitle()}" /></td>
					<td><c:out value="${userForm.getSeniorityLevel()}" /></td>
					<td><a href="email?emailId=${userForm.getRecruiterEmail()}">"${userForm.getRecruiterEmail()}"</a></td>
					</tr>
					
				</c:forEach>
				

			

		</form:form>





	</table>

	<a href="getJobSeekerMenuPage">home page</a>



</body>
</html> --%>

<%-- <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Recruiter Advance serach result page</title>
<style type="text/css">
body{
  background-image: url("resources/img/a.png");
  background-size: 1500px 1000px;
}
#container{
  width:1400px;
  height: 800px;
}
form{
  margin-bottom:40px;
  background-color:#8fbbbc; color: black;
  height:600px;
  margin-right: 40px;
}
#topmenu {
    margin-top: 40px;
    border: 1px;
    width:100%;
    height:40px;
}
#topmenu img{
    height: 50px;
    width: 50px;
    margin-left: 5px;
    margin-top: 30px;
    padding-right: 10px;
}
#bDiv{
  width: 1000px;
}
</style>
</head>

  <div id="body" align="center">
  <div id="container">
  <div id = "topmenu">
    <a href="getJobSeekerMenuPage"><img src="resources/img/home.png" border="0"></a>
  </div>
  <div id="aDiv" style="width:650px;text-align:center;margin-top:20px;color:white;">
    <br>
	<h2>List of profiles that matched advanced search requirements</h2>
</div>
  <div id="bDiv" align="center">
    <br>
    <form:form action="" modelAttribute="list">
    <br>
    <table border="0">
	    <tr>
	    <th width="10%"> companyName  </th>
	    <th width="10%"> city</th>
	    <th width="10%">  employment Type</th>
	    <th width="10%">jobTitle</th>
	    <th width="10%"> seniority Level</th>
	    <th width="10%">recruiter Email</th>
	    </tr>
	    
	    <c:forEach items="${list}" var="userForm">
				     <tr>
					<td><c:out value="${userForm.getCompanyName()}" /></td>
					<td><c:out value="${userForm.getCity()}" /></td>
					<td><c:out value="${userForm.getEmploymentType()}" /></td>
					<td><c:out value="${userForm.getJobtitle()}" /></td>
					<td><c:out value="${userForm.getSeniorityLevel()}" /></td>
					<td><a href="email?emailId=${userForm.getRecruiterEmail()}">"${userForm.getRecruiterEmail()}"</a></td>
					</tr>
					
				</c:forEach>
	    
	    

    </table>
	</form:form>
</div>
</div>
</div>
</div>
</html> --%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JobSeeker Advance Search Result Page</title>
<style type="text/css">
a.class2 {text-decoration: none;
color: white;
font-size: 20px;
}

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
  width:1400px;
  height: 600px;
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
 <h2>List of Profiles that Matched Advanced Search Requirements</h2>
</div>
  <div id="bDiv" align="center">
<br>

<form:form action="getJobSeekerMenuPage"
			modelAttribute="list">
<br>	
  <table border="0">
	    <tr>
	    <th width="5%"> CompanyName  </th>
	    <th width="5%"> City</th>
	    <th width="5%"> Employment Type</th>
	    <th width="5%">JobTitle</th>
	    <th width="5%"> Seniority Level</th>
	    <th width="5%">Recruiter Email</th>
	    </tr>
	    
	    <c:forEach items="${list}" var="userForm">
				     <tr>
					<td style="padding-left:30px"><c:out value="${userForm.getCompanyName()}" /></td>
					<td style="padding-left:30px"><c:out value="${userForm.getCity()}" /></td>
					<td style="padding-left:30px"><c:out value="${userForm.getEmploymentType()}" /></td>
					<td style="padding-left:30px"><c:out value="${userForm.getJobtitle()}" /></td>
					<td style="padding-left:30px"><c:out value="${userForm.getSeniorityLevel()}" /></td>
					<td style="padding-left:30px"><a href="email?emailId=${userForm.getRecruiterEmail()}">${userForm.getRecruiterEmail()}</a></td>
					</tr>
					
				</c:forEach>
	        

    </table>
	</form:form>
	
	</div>
<div id="cDiv" align="left">
			<p><a href="getJobSeekerHomePage" class="class2">Back to JobSeeker Home </a></p>
				
		</div>
</div>
</div>
</html>

