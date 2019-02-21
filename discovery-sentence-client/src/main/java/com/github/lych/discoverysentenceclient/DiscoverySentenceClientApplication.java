package com.github.lych.discoverysentenceclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DiscoverySentenceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoverySentenceClientApplication.class, args);
	}

}
