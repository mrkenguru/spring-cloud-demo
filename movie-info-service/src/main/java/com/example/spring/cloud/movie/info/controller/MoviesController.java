package com.example.spring.cloud.movie.info.controller;

import com.example.spring.cloud.movie.info.models.Movie;
import com.example.spring.cloud.movie.info.repositories.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/movies")
public class MoviesController
{
    private final MovieRepository movieRepository;

    @GetMapping(value = "/{movieId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Movie getMovieInfo(@PathVariable("movieId") String movieId)
    {
        return movieRepository.findById(movieId);
    }
}

