/**
 *
 */
var myApp = angular.module('myApp',[]);

myApp.controller('MainController',function($scope,$http) {
  $http.get("http://localhost:8080/carbechospring/car/carlist")
.success(function(response) {
	$scope.carlist = response;
	alert("hiiii");
	alert($scope.carlist);
});
  
  $http.get("http://localhost:8080/carbechospring/car/carvolist")
  .success(function(response) {
  	$scope.carvolist = response;
  	 //$scope.totalItems = $scope.customers.length;
  });
  
  $http.get("http://localhost:8080/carbechospring/car/vehiclevoist")
  .success(function(response) {
  	$scope.vehiclevolist = response;
  });
  
  $scope.myCar = [ $scope.carlist , $scope.carvolist, $scope.vehiclevolist ];

  $scope.view="col-sm-6 col-md-4 col-lg-3";
  
  $scope.listView=function(){
	  $scope.view="col-xs-12";
  }
  
  $scope.cardView=function(){
	  $scope.view="col-sm-6 col-md-4 col-lg-3";
  }
  
  $scope.myCarDetail={};
  $scope.indexNum = 0;
  
  $scope.showData = function($index){
	  $scope.$index = $index;
	  angular.copy($scope.myCar[$index],$scope.myCarDetail);
	  
	  
	  
	  $scope.indexNum = $index;
	  
  } 

  $scope.updateView = function($index){
	  
      $scope.customers[$index]=$scope.customerDetail;
    }
 
  $scope.deleteCustomer = function($index){
	  $scope.customers.splice($index,1);
  }

  $scope.updateCustomer = function(){
	  angular.copy($scope.customerDetail , $scope.customers[$scope.$index]);
  }
}); 



