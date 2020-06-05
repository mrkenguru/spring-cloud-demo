package com.example.spring.cloud.ratings.models;

import lombok.Data;

import java.util.List;

@Data
public class UserRatings
{
    private final List<UserRating> ratings;
}
