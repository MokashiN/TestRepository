<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Case</title>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <!-- <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"> -->
  
  <link rel="stylesheet" href="<c:url value='./resource/bootstrap-3.3.6-dist/css/bootstrap.min.css'/>">
    <script src="<c:url value='./resource/bootstrap-3.3.6-dist/js/jquery-1.12.3.min.js'/>"></script>
  <!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script> -->
  <!-- <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script> -->
    <script src="<c:url value='./resource/bootstrap-3.3.6-dist/js/bootstrap.min.js'/>"></script>
   <style>
 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    

    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
    
  .carousel-inner img {
      width: 50%; /* Set width to 100% */
      margin: auto;
      min-height:30px;
  }

  /* Hide the carousel text when the screen is less than 600 pixels wide */
  @media (max-width: 600px) {
    .carousel-caption {
      display: none; 
    }
  }
  </style>
</head>
<body bgcolor="/resource/images/background.jpg">

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
  
<div class="container">
  <h3>Basic Navbar Example</h3>
  <p>A navigation bar is a navigation header that is placed at the top of the page.</p>
</div>
<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner" role="listbox">
    <div class="item active">
      <img src="resource/images/download.jpg" alt="Chania" align=center>
    </div>

    <div class="item">
      <img src="resource/images/download1.jpg" alt="India" align=center>
    </div>

    <div class="item">
      <img src="resource/images/download2.jpg" alt="Flower" align=center>
    </div>
    <div class="container">
        
</div>
<div class="container">
   
</div>

  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
<div class="row">
<div class="col-md-3 col-sm-4 col-xs-6"><a href="category4"><img src="resource/images/download5.jpg"/><br>Amazone Watches  </a></div>
 <div class="col-md-3 col-sm-4 col-xs-6"> <a href="category5"><img src="resource/images/download3.jpg"/><br>Flipcart Watches</a></div>
 <div class="col-md-3 col-sm-4 col-xs-6""> <a href="category4"><img src="resource/images/download4.jpg"/></a></div>
 </div>
</body>
</html>
