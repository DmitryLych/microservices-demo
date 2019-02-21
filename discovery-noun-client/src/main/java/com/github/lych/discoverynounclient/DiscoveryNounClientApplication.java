package com.github.lych.discoverynounclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DiscoveryNounClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryNounClientApplication.class, args);
    }

}
