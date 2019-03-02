package com.skilldistillery.leaders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.skilldistillery.leadersdata")
public class BootMvcWorldLeadersApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMvcWorldLeadersApplication.class, args);
	}

}
