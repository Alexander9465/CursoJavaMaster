package com.hotel.service;

import java.util.List;

import com.hotel.model.Hotel;

/**
 * 
 * @author Alexander Paul Tupiza Tupiza 
 * 
 * Interfaz que indica que metodos tendra la entidad hotel 
 *
 */
public interface HotelService {
	
	/**
	 * 
	 * @return nos regresa una lista de hoteles
	 */
	List<Hotel> listaHoteles();
	/**
	 * 
	 * @param nombre ingresamos el nombre del hotel del que queremos su informacion
	 * @return devulve el objeto hotel 
	 */
	Hotel buscarHotel(String nombre);
	
}
