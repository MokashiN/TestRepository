<html>
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <link rel="stylesheet" href="<c:url value='./resources/css/bootstrap.min.css'/>">
  <script src="<c:url value='./resources/js/jquery-1.12.3.min.js'/>"></script>
  <script src="<c:url value='./resources/js/bootstrap.min.js'/>"></script>
  
<table align=center border=1>
<tr>
<td colspan=2 align=center><b>Product Information</b></td>
</tr>
<tr>
	<td><img src="<c:url value='./resources/images/DonalDuck1.jpg'/>"></td>
	<td>
	<b> Product Name :- Donald Duck Waving</b><br><br>
	<b><u>Description:</u></b>Donald Duck is a cartoon character created in 1934 at Walt Disney Productions.</u></b> <br><br>
	<b><u>Price:</u></b>$25<br><br>
	<a href=#>Add To Cart</a>
	</td> 
</td>
</tr>
</table>