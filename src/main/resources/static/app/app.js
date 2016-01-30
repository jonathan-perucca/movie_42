angular.module('movieApp', [])
       .controller('MovieController', [
    '$scope',
    'MovieService',

function($scope, MovieService) {

    MovieService
        .getMovies()
        .then(assignToModel);

    function assignToModel(movies){
        $scope.movies = movies;
    }
}]);