<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <link rel="stylesheet" href="<c:url value='/resource/css/style.css'/>">
<title>Insert title here</title>
</head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="<c:url value='./resource/bootstrap-3.3.6-dist/css/bootstrap.min.css'/>">
<script src="<c:url value='./resource/bootstrap-3.3.6-dist/js/jquery-1.12.3.min.js'/>"></script>
<script src="<c:url value='./resource/bootstrap-3.3.6-dist/js/bootstrap.min.js'/>"></script>

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">BestWatches.com</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="AboutUs">About Us</a></li>
      <li><a href="Login">Login</a></li>
      <li><a href="<c:url value='/register'/>">Register</a></li>
      <li><a href="<c:url value='/add'/>">Add Products</a></li>
      <li><a href="<c:url value='/productlist'/>">Display products</a></li>
    </ul>
  </div>
</nav>
<body  style="background-color:lightgray";>
<div class="login-page">
  <div class="form">
  <table align=center>
     <c:out value="${message}"/>
    <form class="login-form" action="<c:url value='j_spring_security_check' />" method="POST">
    <tr>
    	<td>UserName</td>
    	<td><input type="text" placeholder="username" name="j_username"/></td>
    </tr>
	<tr>
      	<td>Password</td>
      	<td><input type="password" placeholder="password" name="j_password"/></td>
    </tr>
    <tr>
      	<td><input type="submit" value="login"></td>
      	<td><input type=reset></td>
     </tr>
  <!-- <input type="hidden" 
                     name="${_csrf.parameterName}" value="${_csrf.token}" /> -->   
    </form>
    </table>
    </div>
</div>

</body>
</html>