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
							<li><a href="<c:url value='/Chat'/>">CHAT</a></li>
							<li><a href="<c:url value='/Forum'/>">FORUM</a></li>
							<li><a href="<c:url value='/ForumView'/>">Forum View</a></li>
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
					<y:if test="${!empty forumList}"> 
						<div class="container">
							<table class="table">
								<thead>
									<tr style="text-align: center;" height="40px">
										<td>forum ID</td>
										<td>Category</td>
										<td>Creation Date Time</td>
													
										<td>Forum Content</td>
										<td>Forum Title</td>
										<td>Edit</td>
										<td>Delete</td>		
									</tr>
								</thead>
								<y:forEach items="${forumList}" var="forum">
								
									<tr
										style="background-color: white; color: black; text-align: center;"
										height="30px">
										<td><y:out value="${forum.forumid}" /></td>
										<td><y:out value="${forum.category}" /></td>
										<td><y:out value="${forum.creationdatetime}" /></td>
								
										<td><y:out value="${forum.forumcontent}" /></td>
										<td><y:out value="${forum.forumtitle}" /></td>
										<y:if test="${pageContext.request.userPrincipal.name != null}">
											<y:if
												test="${pageContext.request.userPrincipal.name == 'nilima'}"> 
										<td width="50"><a href="<y:url value="/admin/delete1?forumid=${forum.forumid}"/>">Delete</a></td>
											
										<td width="50"><a
											href="<y:url value="/ForumViewRecord?forumid=${forum.forumid}"/>">View
												forum</a></td>
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