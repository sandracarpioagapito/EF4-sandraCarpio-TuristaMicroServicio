package com.idat.EF4TuristaMicroservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EF4TuristaMicroservicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(EF4TuristaMicroservicioApplication.class, args);
	}

}
