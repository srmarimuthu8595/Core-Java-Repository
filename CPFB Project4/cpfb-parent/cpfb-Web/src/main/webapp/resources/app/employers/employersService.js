angular.module('main')
.service('employerService', ['$http', 'config', function($http, config) {
	this.employer = function() {
		return $http.get( config.url  + 'service/rest/employer/getEmployerDetails');
	}
}])