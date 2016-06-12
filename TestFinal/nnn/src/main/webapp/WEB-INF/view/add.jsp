<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>  
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
 <head>  
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
  <title>Spring MVC Form Handling</title>  
  <title>Bootstrap Case</title>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <link rel="stylesheet" href="<c:url value='./resource/bootstrap-3.3.6-dist/css/bootstrap.min.css'/>">
 <script src="<c:url value='./resource/bootstrap-3.3.6-dist/js/jquery-1.12.3.min.js'/>"></script>
 <script src="<c:url value='./resource/bootstrap-3.3.6-dist/js/bootstrap.min.js'/>"></script>
 </head>  
  
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
    <li><a href="<c:url value='/LogOut'/>">Logout</a></li>
    </ul>
  </div>
</nav>
<body  style="background-color:lightgray";>
<h2 Align=center>Add Product Data</h2>  
<form:form method="POST" modelAttribute="productBean"  action="save" command="command" enctype="multipart/form-data">  
<table align=center>  
	<tr>  
		<td><form:hidden path="id" /></td>  
	</tr>  
	<tr>  
		<td><form:label path="name">product Name:</form:label></td>  
		<td><form:input path="name" /></td>  
	</tr>
	<tr>  
		<td><form:label path="qty">product Quantity:</form:label></td>  
	    <td><form:input path="qty" /></td>  
	</tr>  
	<tr>  
		<td><form:label path="description">product description:</form:label></td>  
	    <td><form:input path="description" /></td>  
	</tr>  
	<tr>  
		<td><form:label path="price">product price:</form:label></td>  
	    <td><form:input path="price" /></td>  
	</tr>  
	<tr>  
		<td><form:label path="fpath">product Image :</form:label></td>  
	    <td><input type="file" name="file1" /></td>
	</tr>    
	<tr>  
		<td colspan="2"><input type="submit" value="Submit"/></td>  
	</tr>  
 </table>   
 </form:form>  