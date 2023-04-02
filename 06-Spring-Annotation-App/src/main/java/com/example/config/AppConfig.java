package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.Beans.Engine;

@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {

	@Bean
	public Engine getEngine() {
		System.out.println("Engine Bean");
		return new Engine();
	}
}
