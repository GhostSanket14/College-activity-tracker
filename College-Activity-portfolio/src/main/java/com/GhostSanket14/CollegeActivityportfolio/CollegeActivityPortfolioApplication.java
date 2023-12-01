package com.GhostSanket14.CollegeActivityportfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.GhostSanket14.CollegeActivityportfolio")
@SpringBootApplication
public class CollegeActivityPortfolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollegeActivityPortfolioApplication.class, args);
	}
}