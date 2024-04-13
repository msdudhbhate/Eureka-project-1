package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringbootEurekaProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEurekaProject1Application.class, args);
	}

}
