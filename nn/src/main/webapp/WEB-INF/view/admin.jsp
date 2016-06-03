<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<html>  
<head>  
<title>Admin Page | www.bestwatches.com</title>  
</head>  
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<c:url value="/j_spring_security_logout" var="logoutUrl" />  
 <center>  
  <h2 align=center>Admin | You are now logged in</h2>  
  <h3><a href="${logoutUrl}">Logout</a></h3>  
 </center>  
</body>  
</html>  