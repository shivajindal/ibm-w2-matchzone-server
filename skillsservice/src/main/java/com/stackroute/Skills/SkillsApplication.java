package com.stackroute.Skills;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SkillsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkillsApplication.class, args);
	}
}
