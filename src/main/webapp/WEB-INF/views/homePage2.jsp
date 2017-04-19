<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New Home Page</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="homepage.css">
<title>HomePage</title>
<style>
.mySlides {
	display: none;
	padding: 5px;
}
</style>
</head>

<body id="body">

<div id="container">
  <div id="topbar">
     <img src="/Users/PraMri/Desktop/project workspace/images/logo.png">
  
     DREAM JOB
   </div>
	<div id = "topmenu">
	
					<ul>
					<li style="font-size:22px"><a href="/Users/PraMri/Desktop/project workspace/homepage.html">Home</li></a>
					<li style="font-size:22px"><a href="/Users/PraMri/Desktop/project workspace/Aboutus.html">About Us</li></a>
					<li style="font-size:22px"><a href="/Users/PraMri/Desktop/project workspace/rlogin.html">Recruiter</li></a>
					<li style="font-size:22px"><a href="/Users/PraMri/Desktop/project workspace/jlogin.html">JobSeeker</li></a>
					<li style="font-size:22px"><a href="/Users/PraMri/Desktop/project workspace/contact.html">Contact Us</a></li>
                    <div class="dropdown">
                     <button id="dropbtn">Knowledge Base</button> 
                      <div class="dropdown-content">

                     <a href="https://www.w3schools.com">w3schools</a>
                     <a href="http://www.sitesbay.com/">Sitesbay</a>
                     <a href="https://www.codecademy.com/">codecademy</a>
                       </div>
                     </div>
				 </div>		    
				
		
	<div id="third">

<div class="w3-content w3-section">
  <img class="mySlides" src="resources/img/img1.jpg" height="300" width="1200">
  <img class="mySlides" src="resources/img/img2.jpg" height="300" width="1200">
  <img class="mySlides" src="resources/img/img3.jpg" height="300" width="1200">

</div>

<iframe width="300" height="300" src="https://www.youtube.com/embed/U-pAqX_PBxY">
</iframe>

</div>
<div id="secondbar">
      <h2> Welcome to Our Online Job Portal</h2>
        <p>Dream Job is a global online employment solution for people seeking jobs and the employers who need great people</p>
   
</div>

</div>

<script>
var myIndex = 0;
carousel();

function carousel() {
    var i;
    var x = document.getElementsByClassName("mySlides");
    for (i = 0; i < x.length; i++) {
       x[i].style.display = "none";  
    }
    myIndex++;
    if (myIndex > x.length) {myIndex = 1}    
    x[myIndex-1].style.display = "block";  
    setTimeout(carousel, 2000); // Change image every 2 seconds
}
</script>

</body>
</html>