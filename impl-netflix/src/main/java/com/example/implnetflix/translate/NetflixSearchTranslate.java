package com.example.implnetflix.translate;


import org.springframework.stereotype.Service;

import com.example.implnetflix.dto.NetflixRequest;
import com.example.implnetflix.dto.NetflixSearch;

@Service
public class NetflixSearchTranslate {
    public NetflixSearch translate(NetflixRequest request){
        return NetflixSearch.builder()
        .s(request.getS())
        .type(request.getType())
        .build();
    }
}
