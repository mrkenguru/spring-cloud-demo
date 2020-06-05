package com.example.spring.cloud.movie.info.repositories;

import com.example.spring.cloud.movie.info.models.Movie;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class MovieRepository
{
    private static final Movie GREENBOOK = new Movie("1234", "Greenbook", "Description of Greenbook");
    private static final Movie PRETTY_WOMAN = new Movie("5678", "Pretty woman", "Description of Pretty woman");

    private static final Map<String, Movie> MOVIES = Map.of(GREENBOOK.getMovieId(), GREENBOOK,
                                                            PRETTY_WOMAN.getMovieId(), PRETTY_WOMAN);

    public Movie findById(String movieId)
    {
        return MOVIES.get(movieId);
    }
}
