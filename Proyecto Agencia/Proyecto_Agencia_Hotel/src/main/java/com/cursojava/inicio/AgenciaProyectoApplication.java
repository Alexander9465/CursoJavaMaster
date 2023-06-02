package com.cursojava.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
/**
 * 
 * @author Alexander Paul Tupiza Tupiza 
 *
 *	Clse donde importamos todos los paquetes con los que vamos a trabajar
 */
@EntityScan(basePackages = "com.hotel.model")
@EnableJpaRepositories(basePackages = "com.hotel.dao")
@SpringBootApplication(scanBasePackages = {"com.hotel.controller","com.hotel.service","com.cursojava.inicio"})

public class AgenciaProyectoApplication {
	/**
	 * metodo que inicia la aplicacion
	 * @param args main
	 */
	public static void main(String[] args) {
		SpringApplication.run(AgenciaProyectoApplication.class, args);
	}

}
