package com.microservice.eurekaservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class EurekaserviceApplication {

    static void main(String[] args) {
        SpringApplication.run EurekaserviceApplication, args
    }
}
