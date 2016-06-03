<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
    pageEncoding="ISO-8859-1"%>  
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
 <head>  
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
  <title>Spring MVC Form Handling</title>  
 </head>  
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <!-- <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"> -->
  
  <link rel="stylesheet" href="<c:url value='./resource/bootstrap-3.3.6-dist/css/bootstrap.min.css'/>">
    <script src="<c:url value='./resource/bootstrap-3.3.6-dist/js/jquery-1.12.3.min.js'/>"></script>
  <!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script> -->
  <!-- <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script> -->
    <script src="<c:url value='./resource/bootstrap-3.3.6-dist/js/bootstrap.min.js'/>"></script>
<body bgcolor=lightGray>  
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
  <h2 align=center>Add User Data</h2>  
  <form:form method="POST" modelAttribute="registerBean"  action="register1" command="command">  
      <table align=center border=1>  
       <tr>  
           
           <td><form:hidden path="id" /></td>
           
	  </tr>  
       <tr>  
           <td><form:label path="name">Name:</form:label></td>
           <td><form:input path="name"/></td>
           <td><form:errors path="name" style="color:red"/></td>
             
       </tr>
       <tr>  
           <td><form:label path="password">Password:</form:label></td>
           <td><form:password path="password"/></td>
           <td><form:errors path="password" style="color:red"/></td>
             
       </tr>  
       
       <tr>  
           <td><form:label path="cpassword">Confirm Password:</form:label></td>
           <td><form:password path="cpassword"/></td>
           <td><form:errors path="cpassword" style="color:red"/></td>
             
       </tr>  
         
       <tr>  
           <td><form:label path="city">City</form:label></td>
           <td><form:input path="city" /></td>
           <td><form:errors path="city" style="color:red;"/></td>  
                        
       </tr>  
       <tr>  
           <td><form:label path="mobileno">ContactNo</form:label></td>  
           <td><form:input path="mobileno" /></td>
			<td><form:errors path="name" style="color:red"/></td>  
       </tr>
         
       <tr>  
           <td><form:label path="email">Email Address</form:label></td>  
           <td><form:input path="email"/></td>  
           <td><form:errors path="email" style="color:red;"/></td>
       </tr>  
       <tr>  
         <td><input type="submit" value="Submit"/></td>  
         <td><input type="reset" value="reset"/></td>
         <td></td>
        </tr>  
   </table>   
  </form:form>  
  <table border=1>
  <tr>
  <td>  </td>
  <td>  </td>
  <td>  </td>
  </tr>
  </table>