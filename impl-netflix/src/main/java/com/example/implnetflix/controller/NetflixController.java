package com.example.implnetflix.controller;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.implnetflix.client.NetflixClient;
import com.example.implnetflix.dto.NetflixRequest;
import com.example.implnetflix.dto.NetflixResponse;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/imdb/search")
public class NetflixController {

    private final NetflixClient netflixClient;

    @PostMapping
    public ResponseEntity<NetflixResponse> searchMovies (@RequestBody NetflixRequest request) {
        NetflixResponse netflixResponse = netflixClient.SearchMovie(
            request.getApiKey(),
            request.getS(),
            request.getType());
        return ResponseEntity.status(HttpStatus.OK).body(netflixResponse);
    }
    
}
