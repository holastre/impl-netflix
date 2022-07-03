package com.example.implnetflix.service;

import com.example.implnetflix.dto.NetflixResponse;
import com.example.implnetflix.dto.NetflixSearch;

public interface CacheManager {

    void save(NetflixSearch search, NetflixResponse response);

    NetflixResponse retrieve(NetflixSearch search);

    Boolean contains(NetflixSearch search);
    
}
