package com.srm.stock.srmeurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class SrmeurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SrmeurekaServiceApplication.class, args);
	}

}
