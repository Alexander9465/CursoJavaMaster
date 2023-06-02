package com.cursojava.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "com.vuelo.model")
@EnableJpaRepositories(basePackages = "com.vuelo.dao")
@SpringBootApplication(scanBasePackages = {"com.vuelo.controller","com.vuelo.service,com.cursojava.inicio"})
public class VueloAgenciaProyectoApplication {

	public static void main(String[] args) {
		SpringApplication.run(VueloAgenciaProyectoApplication.class, args);
	}

}
