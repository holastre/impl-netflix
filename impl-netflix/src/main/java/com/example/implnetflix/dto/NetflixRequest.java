package com.example.implnetflix.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class NetflixRequest {
    private String type;
    private String s;
    private String apiKey;
}
