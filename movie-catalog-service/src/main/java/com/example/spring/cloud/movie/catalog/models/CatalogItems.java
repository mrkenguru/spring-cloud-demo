package com.example.spring.cloud.movie.catalog.models;

import lombok.Data;

import java.util.List;

@Data
public class CatalogItems
{
    private final List<CatalogItem> items;
}
