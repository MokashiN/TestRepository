<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
 <link rel="stylesheet" href="<c:url value='/resource/css/style.css'/>">
<title>Insert title here</title>
</head>
<body background="resource/images/background.jpg">
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