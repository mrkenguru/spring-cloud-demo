package com.example.spring.cloud.movie.catalog.models;

import lombok.Data;

@Data
public class UserRating
{
    private String movieId;
    private int rating;
}
