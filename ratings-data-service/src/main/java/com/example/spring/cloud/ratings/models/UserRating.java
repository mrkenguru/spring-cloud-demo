package com.example.spring.cloud.ratings.models;

import lombok.Data;

@Data
public class UserRating
{
    private final String movieId;
    private final int rating;
}
