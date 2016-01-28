package com.mala.movie;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Arrays.asList;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final List<Movie> MOVIES = asList(
            new Movie("Le voyage de Chihiro"),
            new Movie("Princesse Mononoke"),
            new Movie("Braindead")
    );

    @RequestMapping(method = GET)
    public List<Movie> getMovies() {
        return MOVIES;
    }
}