package com.example.implnetflix.service;

import com.example.implnetflix.dto.NetflixRequest;
import com.example.implnetflix.dto.NetflixResponse;

public interface NetflixService {
    NetflixResponse searchMovies(NetflixRequest request);
}
