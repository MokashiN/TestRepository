<%@taglib prefix="y" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="header.jsp" %><br><br>
<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#myPage">Collaboration Center</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
        <li><a href="myPage">HOME</a></li>
        <li class="active"><a href="<y:url value='/Chat'/>"> Chat</a></li>
        <li><a href="Register">Register With Us</a></li>
          <li><a href="other">Other</a></li>
        <li><a href="AboutUs">About Us</a></li>
      </ul>
    </div>
  </div>
</nav>