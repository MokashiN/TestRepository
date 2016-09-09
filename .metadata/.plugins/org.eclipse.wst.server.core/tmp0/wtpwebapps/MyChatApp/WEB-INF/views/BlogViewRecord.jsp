<%@taglib prefix="y" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="header.jsp" %><br><br>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="<c:url value='/resources/css/style.css'/>">
<title>Insert title here</title>
</head>

<body>
<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="myPage">Collaboration Center</a>
			</div>

			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav navbar-left">
							<li><a href="myPage">HOME</a></li>
							<li><a href="<y:url value='/Chat'/>">CHAT</a></li>
							<li><a href="<y:url value='/Forum'/>">FORUM</a></li>
							<li><a href="<y:url value='/BlogAdd'/>">ADD NEW BLOG</a></li>
							<li><a href="<y:url value='/admin/blogViewApprove'/>">APPROVE BLOG</a></li>
				</ul>
		</div>
		</div>
		</nav>
<div class="register-form " >
   
  <div class="form">
   <h3>View Details </h3>
    <y:if test="${!empty blogObject}"> 
    <form:form class="login-form"  method="POST" action="BlogView"  modelAttribute="blog">
       <table style="margin-left: 15%;">
          <tr>
            <td><y:out value=" Title : ${blogObject.blogtitle}" />
   
          </tr>
         <tr><td>   <y:out value="Description : ${blogObject.blogdesc}" /> </td></tr>
          
         <tr><td><a href="<y:url value='/BlogView'/>">Back To Main Category</a></td></tr>
          </table>
      
    </form:form>
    </y:if>
  </div>
</div>
</body>
</html>