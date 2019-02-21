package com.github.lych.discoveryverbclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DiscoveryVerbClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryVerbClientApplication.class, args);
    }

}
