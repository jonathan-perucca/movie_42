angular.module('movieApp')
    .factory('MovieService', [
    '$http',

function($http) {

    return {
        getMovies: getMovies,
        saveMovie: saveMovie
    };

    function getMovies() {
        return $http
            .get("/movies")
            .then(movieData);
    }

    function saveMovie(movie) {
        return $http
            .post("/movies", movie)
            .then(movieData)
    }

    function movieData(response) {
        return response.data;
    }
}]);