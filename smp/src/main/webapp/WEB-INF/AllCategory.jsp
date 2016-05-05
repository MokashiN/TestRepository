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
          $scope.countries = data;
        });
        $http.get('CategoryDao2').success(function(data) {
            $scope.accesories= data;
          });
        $http.get('CategoryDao').success(function(data) {
            $scope.product= data;
          });
      
      });
    </script>
  </head>
  <body ng-controller="CountryCtrl">
	<h2>Angular.js JSON Fetching Example</h2>
	Search:<input type="text" value="" ng-model="search">
    <table border=1>
      <tr>
        <th>Code</th>
		<th>Country</th>
        <th>Population</th>
      </tr>
      <tr ng-repeat="country in countries | filter:search">
        <td>{{country.pno}}</td>
		<td>{{country.pname}}</td>
        <td>{{country.pqty}}</td>
      </tr>
      
      <tr ng-repeat="a in accesories| filter:search">
        <td>{{a.pno}}</td>
		<td>{{a.pname}}</td>
        <td>{{a.pqty}}</td>
      </tr>
      
      <tr ng-repeat="p in product| filter:search">
        <td>{{p.pno}}</td>
		<td>{{p.pname}}</td>
        <td>{{p.pqty}}</td>
      </tr>
    </table>
  </body>
</html>