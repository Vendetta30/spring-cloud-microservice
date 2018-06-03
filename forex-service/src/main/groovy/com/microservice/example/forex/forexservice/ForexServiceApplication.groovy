package com.microservice.example.forex.forexservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class ForexServiceApplication {

    static void main(String[] args) {
        SpringApplication.run ForexServiceApplication, args
    }
}
