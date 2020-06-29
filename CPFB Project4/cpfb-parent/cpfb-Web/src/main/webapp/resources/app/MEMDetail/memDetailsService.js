angular.module('main')
.service('memDeatilsService', ['$http', 'config', function($http, config) {
	this.memdetails = function() {
		return $http.get(config.url  + 'service/rest/memdetails/getMEMDetails');
	}
}])