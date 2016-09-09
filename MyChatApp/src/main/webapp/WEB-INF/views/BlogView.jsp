<%@taglib prefix="y" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
#bd {
	margin-top: 100px;
}
</style>
</head>

<body>
	<%@include file="header.jsp"%>
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
							<li><a href="<y:url value='/BlogView'/>">VIEW ALL BLOG</a></li>
							<li><a href="<y:url value='/admin/blogViewApprove'/>">APPROVE BLOG</a></li>
				</ul>
		</div>
		</div>
		</nav>
	<br><br>
	<div class="container-fluid" id="fullwrapper">
		<div class="rows">

			<div class="col-md-7">
				<div id="logo-container"></div>
				<div class="col-sm-8 col-md-10 col-md-offset-1">
					<y:if test="${!empty blogList}"> 
						<div class="container">
							<table class="table">
								<thead>
									<tr style="text-align: center;" height="40px">
										<td>Blog Title</td>
										<td>Description</td>
										<td>View Blog</td>
									</tr>
								</thead>
								<y:forEach items="${blogList}" var="blog">
								
									<tr
										style="background-color: white; color: black; text-align: center;"
										height="30px">
										<td><y:out value="${blog.blogtitle}" /></td>
										<td><y:out value="${blog.blogdesc}" /></td>
										<y:if test="${pageContext.request.userPrincipal.name != null}">
											<y:if
												test="${pageContext.request.userPrincipal.name == 'nilima'}"> 
										<td width="50"><a href="<y:url value="/admin/delete?blogid=${blog.blogid}"/>">Delete</a></td>
											
										<td width="50"><a
											href="<y:url value="/BlogViewRecord?blogid=${blog.blogid}"/>">View
												Blog</a></td>
												</y:if>
												</y:if>
									</tr>
								</y:forEach>
							</table>
						</div>
						</y:if>
					</div>
			</div>
		</div>
	</div>
	<%@include file="footer.jsp"%>
</body>
</html>