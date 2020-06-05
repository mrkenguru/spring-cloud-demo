package com.example.spring.cloud.movie.catalog.models;

import lombok.Data;

@Data
public class CatalogItem
{
    private final String name;
    private final String description;
    private final int rating;
}
