package com.example.spring.cloud.movie.catalog.controller;

import com.example.spring.cloud.movie.catalog.models.*;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@RestController
@RequestMapping("/catalog")
public class MovieCatalogController
{
    private final RestTemplate restTemplate;

    @GetMapping(value = "/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CatalogItems getCatalogItemsForUser(@PathVariable("userId") String userId)
    {
        UserRatings ratings = getUserRatings(userId);

        List<CatalogItem> items = ratings.getRatings().stream().map(this::getCatalogItem).collect(Collectors.toList());

        return new CatalogItems(items);
    }

    private UserRatings getUserRatings(String userId)
    {
        return restTemplate.getForObject("http://ratings-data-service/ratings/users/" + userId, UserRatings.class);
    }

    private CatalogItem getCatalogItem(UserRating userRating)
    {
        Movie movie = getMovieInfo(userRating.getMovieId());

        return new CatalogItem(movie.getName(), movie.getDescription(), userRating.getRating());
    }

    private Movie getMovieInfo(String movieId)
    {
        return restTemplate.getForObject("http://movie-info-service/movies/" + movieId, Movie.class);
    }
}
