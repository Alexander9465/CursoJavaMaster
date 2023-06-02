package com.reserva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.reserva.model.HotelAux;
import com.reserva.model.Reserva;
import com.reserva.service.ReservaService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
/**
 * 
 * @author Alexander Paul Tupiza Tupiza 
 * Clase con la que vmaos resolver las peticiones a reserva 
 *
 */
@RestController
public class ReservaController {
	@Autowired
	ReservaService servicio;
	
	/**
	 * Metodo que mediante un json hacemos una reserva 
	 * @param r json de donde cogemos los datos para la reserva 
	 */
	@ApiOperation(value= "Metodo que mediante un json hacemos una reserva")
	@ApiResponses (value= {
            @ApiResponse(code = 200, message = "OK. El recurso se obtiene correctamente", response = Reserva.class ),
            @ApiResponse(code = 404, message = "Método no permitido."),
            @ApiResponse(code = 500, message = "Error inesperado del sistema")

	})
	@PostMapping(value="reserva",produces =MediaType.APPLICATION_JSON_VALUE)
	public void reservar(@ApiParam(value ="Json que sera utilizado para crear una reserva")@RequestBody Reserva r) {
		servicio.reserva(r);
	}
	
	/**
	 * Lista con todas las reservas 
	 * @returnlista con todas las reservas
	 */
	
	@ApiOperation(value= "Devuelve una lista con todas las reservas")
	@ApiResponses (value= {
            @ApiResponse(code = 200, message = "OK. El recurso se obtiene correctamente", response = Reserva.class ),
            @ApiResponse(code = 404, message = "Método no permitido."),
            @ApiResponse(code = 500, message = "Error inesperado del sistema")

	})
	@GetMapping(value="reserva",produces =MediaType.APPLICATION_JSON_VALUE)
	public List<Reserva> listaReserva(){
		return servicio.listaReserva();
	}
	/**
	 * Metodo que nos duvuelve una lista de reservas de un hotel 
	 * @param nombre del hotel pasado por url 
	 * @return Lista de reservas para ese hotel 
	 */
	@ApiOperation(value= "metodo que nos devulve una lista de reservas de un hotel ")
	@ApiResponses (value= {
            @ApiResponse(code = 200, message = "OK. El recurso se obtiene correctamente", response = Reserva.class ),
            @ApiResponse(code = 404, message = "Método no permitido."),
            @ApiResponse(code = 500, message = "Error inesperado del sistema")

	})
	@GetMapping(value="reserva/{nombre}",produces =MediaType.APPLICATION_JSON_VALUE)
	public List<Reserva> listaConcreta(@ApiParam(value= "nombre que utilizaremos para saber el hotel que buscamos ")
	@PathVariable String nombre){
		return servicio.listaConcreta(nombre);
	}
	
	
}
