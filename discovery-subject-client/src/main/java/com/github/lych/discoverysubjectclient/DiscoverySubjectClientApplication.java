package com.github.lych.discoverysubjectclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DiscoverySubjectClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoverySubjectClientApplication.class, args);
    }

}
