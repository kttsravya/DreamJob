<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Job Seeker Home Page</title>

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
  background-size:  cover;
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
<img src="resources/img/Profile.png" width="550" height="350" alt="createjob">
<p><h2><a href="getJobSeekerProfileForm?email=${jobSeekerSignUpObject.email}"> Create Profile </a></h2></p>
</div>

<div id="image2" align="left">
<img height="350" width="550" src="resources/img/advsearch.jpg" name="ifr">
<p><h2><a href="getJobSeekerMenuPage" > Advance Search </a></h2></p>
</div>
</div>
  </body>
  </html>