package com.github.lych.discoveryadjectiveclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DiscoveryAdjectiveClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryAdjectiveClientApplication.class, args);
    }

}
