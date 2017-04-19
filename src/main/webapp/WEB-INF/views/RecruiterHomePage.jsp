<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%-- <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Recruiter Homepage</title>
<style type="text/css">

#image1 {
    width: 500px;
    padding: 5px;
    margin: 80px;
    height:0px;
    margin-bottom: 0px;
    margin-top: 150px;
}

#image2 {
    width: 750px;
    padding: 5px;
    margin-left: 700px;
    margin: 750px;
    height:0px;
    margin-top: -11.0px;
}

body{
  width: 1500px;
  height: 1000px;
  background-image: url("resources/img/a.jpg");
}
</style>
</head>

<body>

<div id="image1" align="left" >
<img src="resources/img/postjob.jpg" width="550" height="350" alt="postjob">
<a href="getJobPostingForm?recemail=${recSignUp.getEmail()}"> Post a Job </a>
</div>

<div id="image2" align="left">
<iframe height="350" width="550" src="resources/img/advsearch.jpg" name="ifr"></iframe>
<a href="getRecruiterMenuPage"> Advance Search </a>
</div>

  </body>
  </html> --%>
  
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Recruiter Homepage</title>
<style type="text/css">
a {text-decoration: none;
color: white;
font-size: 22px;
margin-left: 200px}

#topbar {
	width: 100%;
	height: 20px;
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

#image1 {
    width: 400px;
    padding: 20px;
    margin: 50px;
    height:0px;
    margin-top: 150px;
    
}
#image1 img{
  border-radius:10px;
}
#image2 {
    width: 400px;
    padding: 20px;
    margin-left: 700px;
    margin: 700px;
    height:0px;
    margin-top: -11.0px;
}
#image2 img{
  border-radius:10px;
}
#container{
  height: 700px;
  width: 1200px;
}

body{
  background-size: cover;
  background-image: url("resources/img/a.png");
}
</style>
</head>

<body align="center">
<div id="container">
<div id="topbar">
			<a href="mainhomepage"><img src="resources/img/logo.png"></a> DREAM JOB
		</div>
<div id="image1" align="left" >
<img src="resources/img/postjob.jpg" width="550" height="350" alt="postjob">
<p><h2><a href="getJobPostingForm?recemail=${recSignUp.getEmail()}"> Post a Job </a></h2></p>
</div>

<div id="image2" align="left">
<img height="350" width="550" src="resources/img/advsearch.jpg" name="ifr">
<p><h2><a href="getRecruiterMenuPage" > Advance Search </a></h2></p>
</div>
</div>
  </body>
  </html>

  
