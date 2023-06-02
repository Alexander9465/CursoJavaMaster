package com.vuelo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;


import com.vuelo.model.Vuelo;
import com.vuelo.service.VueloService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
/**
 * 
 * @author Alexander Paul Tupiza Tupiza 
 * 
 * Clase que controla las solicutudes del vuelo 
 *
 */
@RestController
public class VueloController {

	@Autowired
	VueloService servicio;
	
	
	@ApiOperation(value= "Meotodo que nos devuelve una lista con todos los vuelos ")
	@ApiResponses (value= {
            @ApiResponse(code = 200, message = "OK. El recurso se obtiene correctamente", response = Vuelo.class ),
            @ApiResponse(code = 404, message = "Método no permitido."),
            @ApiResponse(code = 500, message = "Error inesperado del sistema")

	})
	/**
	 * Metodo que nos devuelve una lista con todos los vuelos
	 * @return Lista de todos los vuelos
	 */
	@GetMapping(value="vuelo",produces =MediaType.APPLICATION_JSON_VALUE)
	public List<Vuelo> lista( ){
		return servicio.vuelos();
	}
	/**
	 * Metodo que nos devuelve una lista con los vuelos que tengas plazas disponibles
	 * @param Plazas que el cliente necesita
	 * @return Lista con todos los vuelos con esas plazas disponibles 
	 */
	@ApiOperation(value= "Metodo que nos devuelve una lista con los vuelos que tengas plazas disponibles")
	@ApiResponses (value= {
            @ApiResponse(code = 200, message = "OK. El recurso se obtiene correctamente", response = Vuelo.class ),
            @ApiResponse(code = 404, message = "Método no permitido."),
            @ApiResponse(code = 500, message = "Error inesperado del sistema")

	})
	@GetMapping(value="vuelo/{plazas}",produces =MediaType.APPLICATION_JSON_VALUE)
	public List<Vuelo> lista(@ApiParam(value="numero de plazas que busca ")@PathVariable int plazas){
		return servicio.buscarVuelos(plazas);
	}
	
	/**
	 * Metodo para actulizar las plazas del vuel 
	 * @param id pasamos por url el vuelo del que queremos modificar sus plazas
	 * @param plazas numero de plazas con las que vamos a modificaRLA
	 */
	@ApiOperation(value= "Metodo con el actualizamos las plazas disponibles de un vuelo ")
	@ApiResponses (value= {
            @ApiResponse(code = 200, message = "OK. El recurso se obtiene correctamente", response = Vuelo.class ),
            @ApiResponse(code = 404, message = "Método no permitido."),
            @ApiResponse(code = 500, message = "Error inesperado del sistema")

	})
	@PutMapping(value="vuelo/{id}/{plazas}")
	public void actualizarVuelo(@ApiParam(value="id del vuelo ")@PathVariable int id ,@ApiParam(value="numero de plazas que vas a modificar ")@PathVariable int plazas) {
		servicio.actualizarVuelo(id, plazas);
	}
	

	
}
