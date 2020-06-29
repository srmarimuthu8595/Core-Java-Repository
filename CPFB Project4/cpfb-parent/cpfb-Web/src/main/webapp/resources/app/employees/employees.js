angular.module('main')
.controller('employessController', ['$scope', 'employeeService', function($scope, employeeService) {
	$scope.$on('$viewContentLoaded', function() {  
		 $scope.Employees = {
			        column: ['S.no','ACC NUM', 'EMPL NAME', 'EMPL DOB', 'AGE'],
//			        data: [
//			            {rollno: '01)', num: 'S9112321M', name: 'Ramkumar', dob: '1995-04-16', age: '49'}
//			        ]
			    };
		employeeService.employee().then(function(response) {
			 $scope.Employees['data'] = response.data;
		})
	})
}])