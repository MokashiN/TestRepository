 <%@ page language="java" contentType="text/html; charset=UTF-8"  
     pageEncoding="UTF-8"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
    <html>  
    <head>  
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
    <title></title>  
    </head>  
    <body style="background: #76b852;">  
     <center>  
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
      
      <c:if test="${!empty productList}">  
       <table border="1" bgcolor="black" width="600px">  
        <tr  
         style="background-color:gray ; color: white; text-align: center;"  
         height="40px">  
           
         <td>Product Name</td>  
      <!--    <td>Product Price</td>  
         <td>Product Quantity</td>   -->
         <td>Product Category</td>  
         <td>Product SubCategory</td>  
         <td>Product Image</td>  
         <td>Edit</td>  
         <td>Delete</td>   
          <td>View Record</td> 
        </tr>  
        <c:forEach items="${productList}" var="prod">  
         <tr  
          style="background-color: white; color: black; text-align: center;"  
          height="30px">  
            
          <td><c:out value="${prod.pname}" />  
          </td>  
        <%--   <td><c:out value="${prod.price}" />  
          </td>  
          <td><c:out value="${prod.pqty}" />  
          </td>   --%>
          <td><c:out value="${prod.ctg}" />
            
          </td>  
          
          <td><c:out value="${prod.subctg}" />
            
           </td> 
           <td>
           <!--   <c:out value="${prod.fpath}"/>-->
          <img src="${prod.fpath}" height="60" width="60">
          
          </td>  
          <td width="50"><a href="<c:url value="/Edit?id=${prod.prodid}"/>" >Edit </a></td>  
          <td width="50"><a href="<c:url value="/delete?id=${prod.prodid}"/>">Delete</a></td>
            <td width="50"><a href="<c:url value="/ViewRecord?id=${prod.prodid}"/>">View Record</a></td>  
         </tr>  
        </c:forEach>  
       </table>  
      </c:if>  
      
      
     
     </center>  
    </body>  
    </html> 