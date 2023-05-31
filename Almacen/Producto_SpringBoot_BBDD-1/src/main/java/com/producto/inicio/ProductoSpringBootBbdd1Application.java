package com.producto.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "com.producto.model")
@EnableJpaRepositories(basePackages = "com.producto.dao")
@SpringBootApplication(scanBasePackages = {"com.producto.controller","com.producto.service"})
public class ProductoSpringBootBbdd1Application {

	public static void main(String[] args) {
		SpringApplication.run(ProductoSpringBootBbdd1Application.class, args);
	}

}
