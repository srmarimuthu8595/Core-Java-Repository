angular.module('main')
.controller('employersController', ['$scope', 'employerService', function($scope, employerService) {
	$scope.$on('$viewContentLoaded', function() {  
		 $scope.Employers = {
			        column: ['S.no', 'EMPR NUM', 'EMPR NAME', 'EMPR ADDRESS', 'INDUSTRY', 'GST NO'],
			        /*data: [
			            {rollno: '01)', num: '10000001', name: 'vijayanand', add: 'annastreet', ind: 'tcs', gst: '0000'},
			            {rollno: '02)', num: '10000002', name: 'eswar', add: 'joythinagar', ind: 'tcs', gst: '0000'},
			            {rollno: '03)', num: '10000003', name: 'morrthy', add: 'mprstreet', ind: 'tcs', gst: '0000'},
			            {rollno: '04)', num: '10000004', name: 'ganesh', add: 'gststreet', ind: 'tcs', gst: '0000'},
			            {rollno: '05)', num: '10000005', name: 'mahadevan', add: 'vitnagar', ind: 'tcs', gst: '0000'},
			            {rollno: '06)', num: '10000006', name: 'arumngaraj', add: 'jnustreet', ind: 'tcs', gst: '0000'},
			            
			        ]*/
			    }
		 employerService.employer().then(function(r) {
			 $scope.Employers.data = r.data;
		 })
	})
}])