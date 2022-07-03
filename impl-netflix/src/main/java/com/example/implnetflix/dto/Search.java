package com.example.implnetflix.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Search {

    @JsonProperty("movies")
    List<Movie> movies;
}
