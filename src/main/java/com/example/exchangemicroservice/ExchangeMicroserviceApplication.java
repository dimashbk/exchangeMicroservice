package com.example.exchangemicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.example.exchangemicroservice")
@SpringBootApplication
public class ExchangeMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExchangeMicroserviceApplication.class, args);
    }

}
