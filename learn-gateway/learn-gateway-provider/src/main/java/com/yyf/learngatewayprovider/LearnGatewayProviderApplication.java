package com.yyf.learngatewayprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LearnGatewayProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnGatewayProviderApplication.class, args);
	}

}
