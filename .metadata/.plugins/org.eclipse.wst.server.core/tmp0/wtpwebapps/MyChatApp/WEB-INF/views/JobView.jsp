<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
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
<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="myPage">Collaboration Center</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
       <li><a href="myPage">HOME</a></li>
							<li><a href="<c:url value='/JobAdd'/>">Add Job</a></li>
							<li><a href="<c:url value='/JobSave'/>">Save Job</a></li>
							<li><a href="<c:url value='/JobView'/>">View Job</a></li>
							<li><a href="<c:url value='/admin/JobDelete'/>">Delete Job</a></li>
							<li><a href="<c:url value='/admin/JobEdit'/>">Edit Job</a></li>
							<li><a href="<c:url value='/admin/updateJob'/>">Update Job</a></li>
							<li><a href="<c:url value='/JobViewRecord'/>">View Job</a></li>
      </ul>
    </div>
  </div>
</nav>
<body>
	<%@include file="header.jsp"%><br><br>
	<div class="container-fluid" id="fullwrapper">
		<div class="rows">
			<!-- 			<div class="col-md-3"> -->
			<%-- 				<%@include file="sidebar.jsp"%> --%>
			<!-- 			</div> -->

			<div class="col-md-7">
				<div id="logo-container"></div>
				<div class="col-sm-8 col-md-10 col-md-offset-1">
				<!-- 	<c:if test="${!empty jobList}"> -->
						<div class="container">
							<table class="table">
								<thead>
									<tr style="text-align: center;" height="40px">
										<td>Job Title</td>
										<td>Company Name</td>
										<td>Description</td>
										<td>Location</td>
										<td>Salary</td>
										<td>Working Hour</td>
										<c:if test="${pageContext.request.userPrincipal.name != null}">
											<c:if	test="${pageContext.request.userPrincipal.name == 'nilima'}"> 
												<td>Edit</td>
												<td>Delete</td>
											</c:if>
										</c:if>
										<td>View</td>
									</tr>
								</thead>
								<c:forEach items="${jobList}" var="job">
									<tr
										style="background-color: white; color: black; text-align: center;"
										height="30px">
										<td><c:out value="${job.job_type}" /></td>
										<td><c:out value="${job.company_name}" /></td>
										<td><c:out value="${job.desc}" /></td>
										<td><c:out value="${job.location}" /></td>
										<td><c:out value="${job.salary}" /></td>
										<td><c:out value="${job.workinghour}" /></td>
										<c:if test="${pageContext.request.userPrincipal.name != null}">
											<c:if
												test="${pageContext.request.userPrincipal.name == 'nilima'}"> 
												<td width="50"><a
													href="<c:url value="/admin/JobEdit?id=${job.id}"/>">Edit</a></td>
												<td width="50"><a
													href="<c:url value="/admin/JobDelete?id=${job.id}"/>">Delete</a></td>
											</c:if>
										</c:if>
										<td width="50"><a
											href="<c:url value="/JobViewRecord?id=${job.id}"/>">View
										</a></td>
									</tr>
								</c:forEach>
							</table>
						</div>
					</c:if>



				</div>
			</div>
		</div>
	</div>
	<%@include file="footer.jsp"%>
</body>
</html>