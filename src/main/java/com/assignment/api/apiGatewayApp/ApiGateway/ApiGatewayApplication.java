package com.assignment.api.apiGatewayApp.ApiGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {

		System.setProperty("spring.config.name", "gateway-server");
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

}
