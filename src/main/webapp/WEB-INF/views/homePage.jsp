<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="resources/homepage.css">
<title>DreamJob Home Page</title>

</head>

<body id="body" style="background-image: url(resources/img/a.png)">

	<div id="container">
		<div id="topbar">
			<img src="resources/img/logo.png"> DREAM JOB
		</div>
		<div id="topmenu">

			<ul>
				<li style="font-size: 22px"><a
					href="https://www.youtube.com/watch?v=C31rj-bZ7dA">About Us</a></li>
				<li style="font-size: 22px"><a
					href="getRecruiterSignInFormForHomePage">Recruiter</a></li>
				<li style="font-size: 22px"><a
					href="getJobSeekerSignInFormForHomePage">JobSeeker</a></li>
				<li style="font-size: 22px"><a href="feedback.html">Feedback</a></li>
				<div class="dropdown">
					<button id="dropbtn">Knowledge Base</button>
					<div class="dropdown-content">

						<a href="https://www.w3schools.com">w3schools</a> <a
							href="http://www.sitesbay.com/">Sitesbay</a> <a
							href="https://www.codecademy.com/">codecademy</a>
					</div>
				</div>
			</ul>
		</div>


		<div id="third" style="background-image: url(resources/img/feed.png)">
			<iframe width="300" height="300"
				src="https://www.youtube.com/embed/U-pAqX_PBxY"> </iframe>
		</div>

	</div>


</body>
</html>