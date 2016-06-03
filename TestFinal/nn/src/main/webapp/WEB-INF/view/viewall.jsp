
 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   

    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="<c:url value='/resources/css/style.css'/>">
<title>Insert title here</title>
<style>
body {background-color:lightgrey;}
h2  {color:blue;}
p    {color:green;}
</style>
</head>
<body>
<center>
<body  style="background-color:lightgray";>
<nav class="navbar" navbar-default">
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
<div class="register-form " >
   
  <div class="row">
  
    <c:if test="${!empty productObject}"> 
    <form:form class="login-form"  method="POST" action="update"  modelAttribute="product" enctype="multipart/form-data">
                  <!--   <c:out value="${prod.fpath}"/>-->
                  <div class="col-sm-3">
          <img src="${productObject.fpath}" >
          </div>
       
         
          <div class="col-sm-6">
           <h2> <c:out value=" Model :${productObject.name}" /></h2>
            
            <br>
            
   
          
          <h3><c:out value="Price:${productObject.price}" /> <br></h3>
        
        
     
        
            
          
          
           
          <h3> <c:out value="Category :${productObject.id}" /><br></h3>
        
          <input type="submit" value="Buy Now"/>
          
          </div>

          
        
      
    </form:form>
    </c:if>
  </div>
</div>
</center>
</body>
</html>
