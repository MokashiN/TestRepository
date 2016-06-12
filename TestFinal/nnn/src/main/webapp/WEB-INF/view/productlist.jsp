<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<title>All Products</title>  
</head>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<div class="container">
<h1 align=center>List Watch Products</h1>  
<c:if test="${!empty prdList}">
  <div class="table-responsive">
    <table class="table" align=center border=1>            
 <thead> 
<tr>  
   <th>Mobile ID</th>  
   <th>Mobile Name</th>  
   <th>Mobile price</th>  
   <th>Mobile Quantity</th>
   <th>Mobile Description</th>th>
</tr>  
  </thead>
  <c:forEach items="${prdList}" var="p">  
   <tr>  
    <td><c:out value="${p.id}"/></td>  
    <td><c:out value="${p.name}"/></td>  
    <td><c:out value="${p.price}"/></td>
     <td><c:out value="${p.qty}"/></td>
     <td><c:out value="${p.description}"/></td>
     
    <td><img src="<c:out value="${p.fpath}"/>"></td>
    <td align="center"><a href="<c:url value='/edit?id=${p.id}'/>">Edit</a> | <a href="<c:url value='/delete?id=${p.id}'/>">Delete</a> | <a href="<c:url value='/viewAll?id=${p.id}'/>">View All</a> | </td> 
   </tr>  
  </c:forEach>  
 </table>  
</c:if>  
</body>  
</html>  