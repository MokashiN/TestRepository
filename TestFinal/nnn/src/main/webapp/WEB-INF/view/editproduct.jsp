<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
 <c:if test="${!empty productObject}">  
 	<table align="center" border="1">  
  	<tr>  
   		<th>Watch ID</th>  
   		<th>Watch Name</th>  
   		<th>Watch price</th>  
	</tr>  
  	<tr>
  		<td><c:out value="${productObject.id}"/></td>  
    	<td><c:out value="${productObject.name}"/></td>  
    	<td><c:out value="${productObject.price}"/></td> 
    	<td><img src="<c:out value="${productObject.fpath}"/>"></td>
  	</tr>
 </table>  
 
 <form:form id="registerForm" action="update" modelAttribute="productObject" method="post" enctype="multipart/form-data" >  
 <table width="400px" height="150px" align=center>  
 <tr>  
     <td><form:label path="id">ID</form:label></td>  
     <td><form:input path="id" value="${productObject.id}" /></td>  
 </tr>  
 <tr>  
     <td><form:label path="name">Name</form:label></td>  
     <td><form:input path="name" value="${productObject.name}"/></td>  
</tr>  
<tr>  
     <td><form:label path="price">Price</form:label></td>  
     <td><form:input path="price" value="${productObject.price}"/></td>  
</tr>
<tr>  
     <td><form:label path="qty">Quantity</form:label></td>  
     <td><form:input path="qty" value="${productObject.qty}"/></td>  
</tr>  
<tr>  
     <td><form:label path="description">description</form:label></td>  
     <td><form:input path="description" value="${productObject.description}"/></td>  
</tr>  

  
<tr>  
     <td>Image</td>  
     <td><input type="file" path="file1" name="file1" id="file1"/></td>  
</tr>
<tr>  
     <td><input type="submit" value="Update" />  
     </td>  
</tr>  
</table>  
</table>  
</form:form>  
</c:if> 
   
</body>
</html>