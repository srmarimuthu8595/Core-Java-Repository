var app = angular.module('main', ['ui.router', 'oc.lazyLoad'])
app.config(['$stateProvider', '$urlRouterProvider', function($stateProvider, $urlRouterProvider) {
	 $urlRouterProvider.otherwise('/m');
	 $stateProvider
	 .state('home', {
         url: '/m',
         templateUrl: 'resources/app/home/home.html',
        controller: 'HomeController'
     })
     .state('home.emplyees', {
    	 url: '/emplyee',
    	 templateUrl: 'resources/app/employees/employees.html',
    	 controller: 'employessController',
    	 resolve: {
    		 loadPlugin: function ($ocLazyLoad) {
    			    return $ocLazyLoad.load(['resources/app/employees/employeeService.js','resources/app/employees/employees.js']);
    			  }
   	 }
     }).state('home.employers', {
    	 url: '/employers',
    	 templateUrl: 'resources/app/employers/employers.html', 
    	 controller: 'employersController',
    	 resolve: {
    		 loadPlugin: function ($ocLazyLoad) {
 			    return $ocLazyLoad.load(['resources/app/employers/employersService.js','resources/app/employers/employers.js']);
 			  }
    		
      	 }
    	
     }).state('home.mem', {
    	 url: '/mem',
    	 templateUrl: 'resources/app/MEMDetail/memdeatils.html',
    	 controller: 'memdetailsController',
    	 resolve: {
    		 loadPlugin: function ($ocLazyLoad) {
  			    return $ocLazyLoad.load(['resources/app/MEMDetail/memDetailsService.js','resources/app/MEMDetail/memdeatils.js']);
  			  }
    		
      	 }
     })
	
	
}])
app.controller('HomeController', ['$scope', function($scope) {
	$scope.$on('$viewContentLoaded', function() {  
	 $scope.menus = [
         {name: 'Employers', sref: 'home.employers'},
         {name: 'Employees', sref: 'home.emplyees'},
         {name: 'MEM Detail', sref: 'home.mem'}
        ];
	})
}])
app.constant('config', {  
url: 'http://localhost:8080/cpfb-web/',
}); 