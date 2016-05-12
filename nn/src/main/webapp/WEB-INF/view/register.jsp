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
  <h2 align=center>Add Employee Data</h2>  
  <form:form method="POST" modelAttribute="registerBean"  action="register1" command="command">  
      <table align=center border=1>  
       <tr>  
           <td><form:label path="id">No :</form:label></td>
           <td><form:input path="id" /></td>
           
	  </tr>  
       <tr>  
           <td><form:label path="name">Name:</form:label></td>
           <td><form:input path="name"/></td>
           <td><form:errors path="name" style="color:red"/></td>
             
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