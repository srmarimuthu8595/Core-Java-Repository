angular.module('main')
.controller('memdetailsController', ['$scope', 'memDeatilsService', function($scope, memDeatilsService) {
	$scope.$on('$viewContentLoaded', function() {  
		$scope.Detail = {
		        column: ['MONTHLY CONTRIBUTION', 'TOTAL CONTRIBUTION'],
		        /*data: [
		            {roll: 'OA:', mon: '000001267', tot: '000469947'},
		            {roll: 'SA:', mon: '000000533', tot: '000220577'},
		            {roll: 'MA:', mon: '00000666', tot: '000191707'},
		            {roll: 'CDAC:', mon: '00000000', tot: '00000006'},
		            {roll: 'MBMF:', mon: '0000010', tot: '00000108'},
		            {roll: 'SINDA:', mon: '00000000', tot: '00000004'},
		            {roll: 'ECF:', mon: '00000000', tot: '00000006'},
		            
		        ]*/
		    }
		memDeatilsService.memdetails().then(function(r) {
			$scope.Detail.info = r.data;
		})
	})
}])