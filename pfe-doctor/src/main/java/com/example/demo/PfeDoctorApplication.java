package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = { "com.example.core.domain.entities" })
@EnableJpaRepositories(basePackages = { "com.example.core.domain.repositories" })
@ComponentScan(basePackages = { "com.example.core.domain.services" })
@ComponentScan(basePackages = { "com.example.core.model" })
@ComponentScan(basePackages = { "com.example.controller" })
@PropertySource("classpath:/application.properties")
@EnableAutoConfiguration
@SpringBootApplication
@Configuration
public class PfeDoctorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PfeDoctorApplication.class, args);
	}
}
