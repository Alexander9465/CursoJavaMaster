package com.cliente.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = {"com.cliente.controller","com.cliente.service"})
public class FormacionClienteSpringBootBbdd2Application {

	public static void main(String[] args) {
		SpringApplication.run(FormacionClienteSpringBootBbdd2Application.class, args);
	}
	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}
}
