package com.fnh.metflixconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MetflixConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetflixConfigApplication.class, args);
	}

}
