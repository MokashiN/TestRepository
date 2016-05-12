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
<body background="resource/images/background.jpg">  
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