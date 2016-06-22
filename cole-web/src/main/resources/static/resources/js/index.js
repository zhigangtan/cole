var app = angular.module("navApp", []);
app.controller("navCtrl", function($scope,$http) {
	$http({
		url:'cole-api/project/getall',
		method:'GET'
		}).success(function(data,header,config,status){
		    $scope.records = data;
		}).error(function(data,header,config,status){
		//处理响应失败
		});

});