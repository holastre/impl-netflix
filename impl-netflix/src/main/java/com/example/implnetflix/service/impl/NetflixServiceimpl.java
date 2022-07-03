package com.example.implnetflix.service.impl;

import org.springframework.stereotype.Service;

import com.example.implnetflix.client.NetflixClient;
import com.example.implnetflix.dto.NetflixRequest;
import com.example.implnetflix.dto.NetflixResponse;
import com.example.implnetflix.service.NetflixService;
import com.example.implnetflix.translate.NetflixSearchTranslate;

@Service
public class NetflixServiceimpl implements NetflixService {

    
    NetflixClient netflixClient;
    NetflixSearchTranslate translate;
    
    @Override
    public NetflixResponse searchMovies(NetflixRequest request){
        return netflixClient.SearchMovie(request.getApiKey(),
        request.getS(),
        request.getType());
    }
}
