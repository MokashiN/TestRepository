<%@taglib prefix="y" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>

/* #wrapper */
/* { */
/* position:relative; */
/* width:900px; */
/* left:400px; */
/* top:-500px; */
/* } */
</style>
</head>
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
							
							<li><a href="BlogView">VIEW ALL BLOG</a></li>
							<li><a href="<y:url value='/admin/blogViewApprove'/>">APPROVE BLOG</a></li>
				</ul>
		</div>
		</div>
		</nav>

<body>
	<%@include file="header.jsp"%>
	
	<br><br>
	<div class="container-fluid" id="fullwrapper">
		<div class="rows">
<!-- 			<div class="col-md-3"> -->
<%-- 				<%@include file="sidebar.jsp"%> --%>
<!-- 			</div> -->

			<div class="col-md-7">
				<div id="logo-container"></div>
				<div class="col-sm-8 col-md-10 col-md-offset-1">
					<div class="form-group input-group">

						<center>
							<h3>New Blog?</h3>
						</center>
					</div>

					<form:form method="POST" action="BlogSave" class="login-form"
						commandName="blog">
						<div class="form-group input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-user"></i></span>
							<form:input class="form-control" type="text" path='blogtitle'
								placeholder="Blog Title" />
							<form:errors path="blogtitle" cssStyle="color: #ff0000;" />
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-comment"></i></span>
							<%-- 									<form:input class="form-control" type="text" path='blogdesc' --%>
							<%-- 										placeholder="Blog Description" /> --%>
							<form:textarea path="blogdesc" class="form-control" placeholder="Blog Description" rows="20"/>
							<form:errors path="blogdesc" cssStyle="color: #ff0000;" />
						</div>

						<div class="form-group">
							<button class="btn btn-def btn-block">SUBMIT</button>
						</div>

					</form:form>
				</div>
			</div>
		</div>
	</div>

</body>
</html>
