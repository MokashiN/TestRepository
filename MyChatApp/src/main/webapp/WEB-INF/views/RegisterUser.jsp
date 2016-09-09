<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>
<title>Save</title>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <!--  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>-->
  <link rel="stylesheet" href="<c:url value='./resource/bootstrap-3.3.6-dist/css/bootstrap.min.css'/>">
  <script src="<c:url value='./resource/bootstrap-3.3.6-dist/js/jquery-1.12.3.min.js'/>"></script>
  <script src="<c:url value='./resource/bootstrap-3.3.6-dist/js/bootstrap.min.js'/>"></script>
 
  <style>
  .container {
      padding: 80px 120px;
  }
  .person {
      border: 10px solid transparent;
      margin-bottom: 25px;
      width: 80%;
      height: 80%;
      opacity: 0.7;
  }
  .person:hover {
      border-color: #f1f1f1;
  }
  </style>
</head><body>
<%@include file="header.jsp" %><br><br>
<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#myPage">Collaboration Center</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
        <li><a href="myPage">HOME</a></li>
        
        <li class="active"><a href="<c:url value='/Chat'/>"> Chat</a></li>
        <li><a href="Register">Register With Us</a></li>
          <li><a href="other">Other</a></li>
        <li><a href="AboutUs">About Us</a></li>
      </ul>
    </div>
  </div>
</nav>

  <h2>Add User Data</h2>  
    <form:form method="POST" modelAttribute="registerBean"  action="register1" command="command">    
      <table>
      <tr>
      	<td><form:hidden path="id"></form:hidden>td>
      </td>
       <tr>  
           <td><form:label path="name">Name:</form:label></td>  
           <td><form:input path="name" /></td>
           <td><form:errors path="name" style="color:red"/></td>  
       </tr>
       <tr>  
           <td><form:label path="surname">surName:</form:label></td>  
           <td><form:input path="surname" /></td>  
           <td><form:errors path="surname" style="color:red"/></td>
       </tr>  
       <tr>  
           <td><form:label path="emailid">Email ID</form:label></td>  
           <td><form:input path="emailid" /></td>
           <td><form:errors path="emailid" style="color:red"/></td>  
       </tr>  
       <tr>  
           <td><form:label path="reemailid">ReEnter Email ID</form:label></td>  
           <td><form:input path="reemailid" /></td>
           <td><form:errors path="reemailid" style="color:red"/></td>  
       </tr>
       <tr>  
           <td><form:label path="password">Enter Password</form:label></td>  
           <td><form:input path="password" /></td>
           <td><form:errors path="password" style="color:red"/></td>  
       </tr>  
       <tr>  
           <td><form:label path="cpassword">Enter Confirm Password</form:label></td>  
           <td><form:input path="cpassword" /></td>
           <td><form:errors path="cpassword" style="color:red"/></td>  
       </tr>  
         
       <tr>  
           <td><form:label path="mobileno">MobileNo</form:label></td>  
           <td><form:input path="mobileno" /></td>
           <td><form:errors path="mobileno" style="color:red"/></td>  
       </tr>
         
       <tr>  
         <td colspan="2"><input type="submit" value="Submit"/></td>  
        </tr>  
   </table>   
  </form:form>  