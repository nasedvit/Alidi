package com.irlix.alidi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class AlidiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlidiApplication.class, args);
	}
}
