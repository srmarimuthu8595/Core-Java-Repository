angular.module('main')
.service('employeeService', ['$http', 'config', function($http, config) {
	this.employee = function() {
		return $http.get(  config.url  + 'service/rest/employees/getEmployeeDetails');
	}
}])