<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
     "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Email with Spring MVC</title>

<style type="text/css">
a {text-decoration: none;
color: white;
background-color: #00264d;
width: 20%;
padding: 10px 10px;
margin: 8px 0;
border-radius: 4px;
cursor: pointer;
margin-right: 200px;
margin-top: 40px;
float: right;
}

body{
	background-image: url("resources/img/a.png");
  background-size: 1000px 1000px;
}

#container{
  width:600px;
  height: 200px;
}

form{
margin-top:140px;
  margin-bottom:40px;
  background-color:#8fbbbc; color: black;
  height:300px;
  margin-right: 40px;
}

</style>
</head>
<div id ="body" align="center">
 <div id="container">
  
       
        <form method="post" action="sendEmail.do">
          <h1>Send email</h1>
            <table border="0" width="80%">
                <tr>
                    <td>To:</td>
                    <td><input type="text" name="recipient" size="65" value="${emailId}"/></td>
                </tr>
                <tr>
                    <td>Subject:</td>
                    <td><input type="text" name="subject" size="65" /></td>
                </tr>
                <tr>
                    <td>Message:</td>
                    <td><textarea cols="50" rows="10" name="message"></textarea></td>
                </tr>               
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="Send E-mail" />
                    </td>
                </tr>
            </table>
        </form>
   
    </div>
    </div>
</body>
</html>