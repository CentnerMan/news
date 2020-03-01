package com.geekbrains.newsportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.geekbrains.newsportal"})
public class NewsportalApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewsportalApplication.class, args);
	}

}
