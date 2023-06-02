package com.vuelo.service;

import java.util.Date;
import java.util.List;

import com.vuelo.model.Vuelo;

/**
 * 
 * @author Alexander Paul Tupiza Tupiza 
 *
 */
public interface VueloService {
	
	/**
	 * 
	 * @param Busca los vuelos segun las plazas que se quiera
	 * @return Devuelve una lista con todos los vuelos con condicion pedida
	 */
	List<Vuelo> buscarVuelos (int plazas);
	/**
	 * 
	 * @return Devuelve todo los vuelos de la base de datos 
	 */
	List<Vuelo> vuelos();
	/**
	 * Metodo con el que actualizaremos las plazas de un vuelo 
	 * @param id del vuelo
	 * @param plazas indica las plazas que va a tener el vuelo 
	 */
	void actualizarVuelo(int id, int plazas);
	
}
