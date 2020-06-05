package com.example.spring.cloud.movie.catalog.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Movie
{
    private String movieId;
    private String name;
    private String description;
}
