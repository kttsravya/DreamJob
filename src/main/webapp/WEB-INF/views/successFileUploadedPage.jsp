<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> --%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>file upload success</title>
<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
 <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>
<body>

<div class="success">
        File  <strong>${fileName}</strong> uploaded successfully.
        <br/><br/>
        <a href="getJobSeekerMenuPage">Back</a> 
    </div>

</body>
</html> --%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>File Upload Success</title>
<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
 <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
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
  height:200px;
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
strong{
color:salmon;
}
</style>
</head>
<div id ="body" align="center">
<div id="container">
<div id="aDiv" align="center">
<br>
		<form><br><br><br>
        File  <strong >${fileName}</strong> <h2>Uploaded Successfully.</h2>
        <br/><br/>
        </form>
        </div>
		<div id="cDiv" align="left" >
			<p><a href="getJobSeekerHomePage" class="class2">Back to JobSeeker Home </a></p>
				
		</div>
    </div>
</div>
</html>