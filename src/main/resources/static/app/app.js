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

    $scope.saveMovie = function() {
        MovieService
            .saveMovie($scope.movie)
            .then(pushMovie)
            .then(cleanUp);

        function pushMovie(movie) {
            $scope.movies.push(movie);
        }

        function cleanUp() {
            return $scope.movie.title = '';
        }
    }

}]);