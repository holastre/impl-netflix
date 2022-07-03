package com.example.implnetflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ImplNetflixApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImplNetflixApplication.class, args);
	}

}
