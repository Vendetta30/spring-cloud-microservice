package com.microservice.currencyconversion

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients("com.microservice.currencyconversion")
@EnableDiscoveryClient
class CurrencyconversionApplication {

    static void main(String[] args) {
        SpringApplication.run CurrencyconversionApplication, args
    }
}
