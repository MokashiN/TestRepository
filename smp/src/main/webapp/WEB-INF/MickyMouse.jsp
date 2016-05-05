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
	<td><img src="<c:url value='./resources/images/mickymouse1.jpg'/>"></td>
	<td>
	<b><u><b>Product Name :</u></b> Standing Micky Mouse<br><br>
	<b><u>Description:</u></b> Mickey Mouse is an mouse created by Walt Disney<br> and Ub Iwerks in the year 1928. Mickey is, by far, The Walt Disney Company's<br> most famous character and serves as the company's mascot.<br>
				  Estimated as standing Medium - 18'' <br><br>
	<b><u>Price:</u></b>$19.95<br><br>
	
	<a href=#>Add To Cart</a>
	</td> 
</td>
</tr>
</table>