package com.mala.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @RequestMapping(method = GET)
    public List<Movie> getMovies() {
        return movieRepository.findAll()
                              .stream()
                              .sorted()
                              .collect(toList());
    }
}