package com.fnh.metflixgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MetflixGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetflixGatewayApplication.class, args);
	}

}
