<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Contact Us</title>
	<style type="text/css">
	#heading{
		background-color: #cce6ff;
		padding:10px;
		margin-top: 60px;
		width: 800px;

	}
	#aDiv{
		background-color: #cce6ff;
		padding:10px;
		width: 800px;
		height:400px;
		margin-top: 40px;
	}
	#aDiv label{
	    display: inline-block;
	    float: left;
	    clear: left;
	    width: 40%;
	    text-align: right;
	    padding: 8px 10px;
	    margin: 4px 0;

	}
	#aDiv textarea{
		width: 50%;
	  padding: 8px 12px;
	  margin: 8px 0;
	  display: inline-block;
	  border: 1px solid #ccc;
	  border-radius: 4px;
	  box-sizing: border-box;
	  float: left;
	}
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

	#container{
	  width:1200px;
	  height: 600px;
	}
	body{
	  background-image: url("resources/img/a.png");
	  background-size: 1000px 1000px;
	}
	input[type=text],select {
	    width: 50%;
	    padding: 8px 12px;
	    margin: 10px 0;
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
	    padding: 10px 10px;
	    margin: 10px 0;
	    border: none;
	    border-radius: 4px;
	    cursor: pointer;
	    margin-left: 280px;
	}

</style>
</head>


<div id="body" align="center">
<div id="container">
	<div id="topbar">
	     <a href="mainhomepage"><img src="resources/img/logo.png"></a>
	        DREAM JOB
	   </div>
	<div id="heading" align="left">
	<h1>Contact Us</h1>
	</div>
<div id="aDiv" align="center">
<form action="sendEmail.do" method="post" >
<br>
<br>
		<label>Name:</label>
	    <input type="text" name="name" value="admin"></input>
		<br><br>

	    <label>Email:</label>
	    <input type="text" id="EmailAddress" maxlength="30" name="recipient" value="kttsravya@gmail.com"></input>
	    <br><br>
		<label>Subject:</label>
	    <input type="text" name="subject"></input>
	    <br><br>
	    <label>Your Message:</label>
		<textarea id="subject" name="message"></textarea>
        <input type="submit" value="Send">
 </form>       
	
</div>
</div>
</div>
</html>
