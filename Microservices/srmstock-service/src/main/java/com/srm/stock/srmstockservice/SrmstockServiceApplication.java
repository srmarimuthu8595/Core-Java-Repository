package com.srm.stock.srmstockservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SrmstockServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SrmstockServiceApplication.class, args);
	}

}
