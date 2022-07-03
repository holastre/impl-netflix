package com.example.implnetflix.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.implnetflix.dto.NetflixResponse;

@FeignClient(url = "https://www.omdbapi.com/",
value = "netflix-clientj")
@Component
public interface NetflixClient {

    @GetMapping()
    public NetflixResponse SearchMovie(@RequestParam(value = "apikey") String apikey,
    @RequestParam(value = "s") String s,
    @RequestParam(value = "type") String type);

}
