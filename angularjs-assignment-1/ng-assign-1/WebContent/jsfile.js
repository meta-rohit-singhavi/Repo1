/**
 *
 */
var myApp = angular.module('myApp',[]);

myApp.controller('MainController',function($scope,$http) {
  $http.get("http://localhost:8080/CustomerManagement/rest/resources/customers")
.success(function(response) {
	$scope.customers = response;
	 $scope.totalItems = $scope.customers.length;
});

  $scope.view="col-sm-6 col-md-4 col-lg-3";
  
  $scope.listView=function(){
	  $scope.view="col-xs-12";
  }
  
  $scope.cardView=function(){
	  $scope.view="col-sm-6 col-md-4 col-lg-3";
  }
 /* $scope.email=[];
  
  $scope.emailList=function(){
	  for(var customer in $scope.customers){
		  $scope.email.push(customer.email);
	  }
  }*/
  
  $scope.customerDetail={};
  $scope.indexNum = 0;
  
  $scope.showData = function($index){
	  $scope.$index = $index;
	  angular.copy($scope.customers[$index],$scope.customerDetail);
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



