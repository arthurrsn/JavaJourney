package com.learn.java.OmdbApi.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties
public record ReturnOmdb(
        @JsonAlias("Search") List<TitleMovies> movies
) {
}
