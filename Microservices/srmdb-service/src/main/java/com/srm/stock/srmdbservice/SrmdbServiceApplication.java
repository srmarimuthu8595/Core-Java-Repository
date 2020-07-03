package com.srm.stock.srmdbservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableEurekaClient
@EnableJpaRepositories(basePackages="com.srm.stock.srmdbservice.repository")
@SpringBootApplication
public class SrmdbServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SrmdbServiceApplication.class, args);
	}

}
