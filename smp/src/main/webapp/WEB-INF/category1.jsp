<html ng-app="countryApp">
  <head>
    <meta charset="utf-8">
    <title>Angular.js JSON Fetching Example</title>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <link rel="stylesheet" href="<c:url value='./resources/css/bootstrap.min.css'/>">
	<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.26/angular.min.js"></script>
    <script>
      var countryApp = angular.module('countryApp', []);
      countryApp.controller('CountryCtrl', function ($scope, $http){
        $http.get('CategoryDao1').success(function(data) {
        	alert("hi1"+data);
          $scope.countries = data;
        });
      });
    </script>
  </head>
  <body ng-controller="CountryCtrl">
	<h2>Angular.js JSON Fetching Example</h2>
	Search:<input type="text" value="" ng-model="search">
    <table border=1>
      <tr>
        <th>No</th>
		<th>Product Name </th>
        <th>Quantity</th>
      </tr>
      <tr ng-repeat="c in countries| filter:search">
        <td>{{c.pno}}</td>
		<td>{{c.pname}}</td>
        <td>{{c.pqty}}</td>
      </tr>
    </table>
  </body>
</html>