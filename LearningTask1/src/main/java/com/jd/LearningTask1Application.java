package com.jd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.jd.controller", "com.jd.service"})
public class LearningTask1Application {

	public static void main(String[] args) {
		SpringApplication.run(LearningTask1Application.class, args);
	}
}
