package com.machintosh1983.var.register;

import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.SpringBootApplication;  
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;  

@SpringBootApplication  
@EnableEurekaServer  
public class ApplicationLaunch {

	public static void main(String[] args) {
        SpringApplication.run(ApplicationLaunch.class, args);  

	}

}

