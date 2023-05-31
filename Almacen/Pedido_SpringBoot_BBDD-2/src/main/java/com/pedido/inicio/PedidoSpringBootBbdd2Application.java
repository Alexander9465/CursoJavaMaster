package com.pedido.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@EntityScan(basePackages = "com.pedido.model")
@EnableJpaRepositories(basePackages = "com.pedido.dao")
@SpringBootApplication(scanBasePackages = {"com.pedido.controller","com.pedido.service"})
public class PedidoSpringBootBbdd2Application {

	public static void main(String[] args) {
		SpringApplication.run(PedidoSpringBootBbdd2Application.class, args);
	}
	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}
}
