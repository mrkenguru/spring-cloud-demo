package com.example.spring.cloud.ratings.controller;

import com.example.spring.cloud.ratings.models.UserRating;
import com.example.spring.cloud.ratings.models.UserRatings;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class UserRatingsController
{
    @GetMapping(value = "/users/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public UserRatings getUserRatings(@PathVariable("userId") String userId)
    {
        return new UserRatings(List.of(new UserRating("1234", 4), new UserRating("5678", 3)));
    }
}
