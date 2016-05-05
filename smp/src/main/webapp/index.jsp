<html>
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <link rel="stylesheet" href="<c:url value='./resources/css/bootstrap.min.css'/>">
  <script src="<c:url value='./resources/js/jquery-1.12.3.min.js'/>"></script>
  <script src="<c:url value='./resources/js/bootstrap.min.js'/>"></script>
   
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
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">Logo</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Home</a></li>
        <li><a href="#">About</a></li>
        <li><a href="Register">Register</a></li>
        <li><a href="Contact">Contact</a></li>
        <li><a href="ViewAll">View All</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="Login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>
    </div>
  </div>
</nav>

<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
      <img src="<c:url value='./resources/images/bigimg1.png'/>">
        <div class="carousel-caption">
          <h3>Sell $</h3>
          <p>Money Money.</p>
        </div>      
      </div>

      <div class="item">
        <img src="<c:url value='./resources/images/bigimg4.png'/>">
        <div class="carousel-caption">
          <h3>More Sell $</h3>
          <p>Lorem ipsum...</p>
        </div>      
      </div>
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
<div class="col-md-3 col-sm-4 col-xs-6"> <a href="category1"><img src="<c:url value='./resources/images/bigimg1.png'/>"  class="img-rounded" height="200" width="270" ></a></div>
 <div class="col-md-3 col-sm-4 col-xs-6"> <a href="category2"><img src="<c:url value='./resources/images/bigimg3.png'/>"  class="img-rounded"" height="200" width="270" ></a></div>
 <div class="col-md-3 col-sm-4 col-xs-6""> <a href="category3"><img src="<c:url value='./resources/images/bigimg4.png'/>"  class="img-rounded" height="200" width="270" ></a></div>
 </div>
</body>
</html>