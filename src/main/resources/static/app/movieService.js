angular.module('movieApp')
    .factory('MovieService', [
    '$http',

function($http) {

    return {
        getMovies: getMovies
    };

    function getMovies() {
        return $http
            .get("/movies")
            .then(movieData);

        function movieData(response) {
            return response.data;
        }
    }
}]);