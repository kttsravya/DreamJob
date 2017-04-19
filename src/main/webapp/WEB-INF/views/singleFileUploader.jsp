<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Single File Upload</title>
<link href="<c:url value='/static/css/bootstrap.css' />"  rel="stylesheet" type="text/css"></link>
 <link href="<c:url value='/static/css/app.css' />" rel="stylesheet" type="text/css"></link>
</head>
<body>

<div class="form-container">
       <!--  <h1>Spring 4 MVC File Upload Example </h1> -->
        <form:form method="POST" modelAttribute="fileBucket" enctype="multipart/form-data" class="form-horizontal">
         
            <div class="row">
                <div class="form-group col-md-12">
                    <label class="col-md-3 control-lable" for="file">Upload a file</label>
                    <div class="col-md-7">
                        <form:input type="file" path="file" id="file" class="form-control input-sm"/>
                        <div class="has-error">
                            <form:errors path="file" class="help-inline"/>
                        </div>
                    </div>
                </div>
            </div>
     
            <div class="row">
                <div class="form-actions floatRight">
                    <input type="submit" value="Upload" class="btn btn-primary btn-sm">
                </div>
            </div>
        </form:form>
        <a href="getJobSeekerProfileForm">Go Back to Profile Page</a>
    </div>

</body>
</html> --%>

<%-- <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Single File Upload</title>
<link href="<c:url value='/static/css/bootstrap.css' />"
	rel="stylesheet" type="text/css"></link>
<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"
	type="text/css"></link>

<style type="text/css">
#topbar {
	width: 100%;
	height: 60px;
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

#topmenu {
	margin-top: 10px;
	border: 1px;
	width: 100%;
	height: 10px;
	padding-right: 500px;
}

#topmenu img {
	height: 50px;
	width: 50px;
	margin-left: 5px;
	margin-top: 30px;
	padding-right: 10px;
}

body {
	background-image: url("resources/img/a.png");
	background-repeat: no-repeat;
	background-size: 1500px 1000px;
}

form {
	margin-top: 20px;
	background-color: #8fbbbc;
	color: black;
	height: 350px;
}

input[type=text], input[type=password], select {
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

  <h2> Upload a File</h2> 

<div class="form-container">
       <!--  <h1>Spring 4 MVC File Upload Example </h1> -->
        <form:form method="POST" modelAttribute="fileBucket" enctype="multipart/form-data" class="form-horizontal">
         
            <div class="row">
                <div class="form-group col-md-12">
                 
                   <!-- <label class="col-md-3 control-lable" for="file">click choose file button to Upload file</label> --> 
                    <br>
                    <br>
                    <br>
                    <div class="col-md-7">
                        <form:input type="file" path="file" id="file" class="form-control input-sm"/>
                        <div class="has-error">
                            <form:errors path="file" class="help-inline"/>
                        </div>
                    </div>
                </div>
            </div>
     
            <div class="row">
                <div class="form-actions floatRight">
                    <input type="submit" value="Upload" class="btn btn-primary btn-sm">
                </div>
            </div>
        </form:form>
       <h3> <a href="getJobSeekerHomePage">Go Back to JobSeekerHome</a></h3>
    </div>
</div>
</div>
</div>
</html> --%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Single File Upload</title>
<link href="<c:url value='/static/css/bootstrap.css' />"
	rel="stylesheet" type="text/css"></link>
<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"
	type="text/css"></link>

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
	margin-bottom: 40px;
	background-color: #8fbbbc;
	color: black;
	height: 200px;
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
			
		<div id="aDiv"
			style="width: 350px;text-align: center;margin-top: 20px; color: white;">
			<br>
			<h1>Upload a File</h1>
		</div>
		<br>
		<br>
		<br>
		
		<div id="bDiv" align="center">
			
			   <form:form method="POST" modelAttribute="fileBucket" enctype="multipart/form-data" class="form-horizontal">
			<br><br>
			   <form:input type="file" path="file" id="file" class="form-control input-sm"/>
                            <form:errors path="file" class="help-inline"/>
			<br><br>	
				<input type="Submit" value="Upload">
							</form:form>
		</div>
		<div id="cDiv" align="left">
			<p><a href="getRecruiterHomePage">Back to JobSeeker Home </a></p>
				
		</div>
</div>
</div>
</html>				
		
		



