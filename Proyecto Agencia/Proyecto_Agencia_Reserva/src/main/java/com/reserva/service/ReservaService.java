package com.reserva.service;

import java.util.List;

import com.reserva.model.HotelAux;
import com.reserva.model.Reserva;
/**
 * 
 * @author Alexander Paul Tupiza tupiza 
 *
 *
 * Esta interfaz define los métodos para el servicio de reservas.
 */
public interface ReservaService {
	/**
	 * Metodo que nos devuelve una lista con todas las reervas
	 * @return una lista con todas las reservas
	 */
	List<Reserva> listaReserva();
	/**
	 * Muestra una lista de reservas que tiene un hotel 
	 * @param nombre del hotel 
	 * @return La lista de reservas que tiene un hotel 
	 */
	List<Reserva> listaConcreta(String nombre);
	/**
	 * Metod que da de alta un reserva actulizando las plazas dispobibles de un vuelo
	 * @param Recibo una reserva 
	 */
	void reserva(Reserva r);
	
	
}
