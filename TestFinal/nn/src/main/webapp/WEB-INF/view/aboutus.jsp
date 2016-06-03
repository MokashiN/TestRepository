<html>
<head>
<title>Bootstrap Case</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="<c:url value='./resource/bootstrap-3.3.6-dist/css/bootstrap.min.css'/>">
<script src="<c:url value='./resource/bootstrap-3.3.6-dist/js/jquery-1.12.3.min.js'/>"></script>
<script src="<c:url value='./resource/bootstrap-3.3.6-dist/js/bootstrap.min.js'/>"></script>
</head>
   <nav class="navbar navbar-default">
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
<body  style="background-color:lightgray";>
<table border=1 height=20% width=30% align=center>
	<tr>
		<td colspan=2><center><h2>About Us</h2></center></td>
	</tr>
	<tr>
		<td><b><center>Nilesh Mokashi<br>
						Kalyan, Mumbai<br>
						Email :- nilesh.mokashi@gmail.com</center></b>
		</td>
</tr>
</table>
</body>
 