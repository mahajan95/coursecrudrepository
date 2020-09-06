package com.example.CourseCrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CourseCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseCrudApplication.class, args);
	}

}
