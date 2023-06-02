package com.cursojava.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;
/**
 * 
 * @author Alexander Paul Tupiza Tupiza 
 *
 */
@EntityScan(basePackages = "com.reserva.model")
@EnableJpaRepositories(basePackages = "com.reserva.dao")
@SpringBootApplication(scanBasePackages = {"com.reserva.controller","com.reserva.service","com.cursojava.inicio"})
public class ProyectoAgenciaReservaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoAgenciaReservaApplication.class, args);
	}
	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}
}
