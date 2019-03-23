package com.eltaieb.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
 

@EnableAsync
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@EnableResourceServer
@PropertySource(value = "classpath:db.properties")
public class RoleServiceApplication {

 
	public static void main(String[] args) {
		SpringApplication.run(RoleServiceApplication.class, args);
	}
	
	 	
	 
	 
	 
}

