
productApp.controller(
	'ProductController',function ($scope,$http){
	$scope.product = new Product(null,null,null);
	$scope.productType = new ProductType(null,null);
	$scope.addNewProduct = function (){
	};

	$scope.createProductType = function(){
		$http({
        'url' : 'addProduct',
        'method' : 'POST',
        'headers': {'Content-Type' : 'application/json'},
        'data' : $scope.productType
	    }).success(function(data){
	        window.location = "./";
	    })
	};

	var init = function(){
		$http.get('http://localhost:8080/web-main/productTypes/1').
        success(function(data) {
           $scope.data = data;
        });
	}
	
	//init();
  }// end ProductController

);