package com.learn.java.OmdbApi.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public record TitleMovies(
        @JsonAlias("Title") String title
) {
}
