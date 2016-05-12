<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="resource/images/background.jpg">
edit page

 
  <c:if test="${!empty productObject}">  
 <table align="center" border="1">  
  <tr>  
   <th>Watch ID</th>  
   <th>Watch Name</th>  
   <th>Watch price</th>  
 
  </tr>  
  <td><c:out value="${productObject.id}"/></td>  
    <td><c:out value="${productObject.name}"/></td>  
    <td><c:out value="${productObject.price}"/></td> 
    <td><img src="<c:out value="${productObject.fpath}"/>"></td>
  </tr>
 
 </table>  
 
   <form:form id="registerForm" action="update" modelAttribute="productObject" method="post" enctype="multipart/form-data" >  
    
    <table width="400px" height="150px">  
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
     <td>Image</td>  
     <td><input type="file" path="file1" name="file" id="file"/></td>  
    </tr>
 
    <tr>  
     <td></td>  
     <td><input type="submit" value="Update" />  
     </td>  
    </tr>  
   </table>  
    
      
   </table>  
  </form:form>  
  
</c:if> 
   
</body>
</html>