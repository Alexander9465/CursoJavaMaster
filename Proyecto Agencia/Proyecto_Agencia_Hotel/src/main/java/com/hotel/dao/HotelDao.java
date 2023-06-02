package com.hotel.dao;


 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hotel.model.Hotel;
/**
 * Repositorio de datos para la entidad hotel 
 */
public interface HotelDao extends JpaRepository<Hotel, Integer> {
	
	/**
	 * 
	 * @param nombre El nombre del hotel a buscar.
	 * @return El hotel encontrado o null si no se encuentra.
	 */
	@Query("SELECT c FROM Hotel c WHERE c.nombre = :nombre ")
	Hotel findByNombre(String nombre);
}
