package com.example.spring.cloud.movie.info.models;

import lombok.Data;

@Data
public class Movie
{
    private final String movieId;
    private final String name;
    private final String description;
}
