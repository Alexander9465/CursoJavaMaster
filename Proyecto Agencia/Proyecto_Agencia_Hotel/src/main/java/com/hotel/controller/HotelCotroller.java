package com.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.model.Hotel;
import com.hotel.service.HotelService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
/**
 * 
 * @author Alexander Paul Tupiza Tupiza
 * 
 * Clase que controla las solicitudes del hotel 
 *
 */
@RestController
public class HotelCotroller {
	
	//Inyectamos HotelService
	@Autowired
	HotelService servicio;
	
	/**
	 * mediante un metodo obtenemos los hoteles que tenemos en la base de datos 
	 * @return todos los hoteles
	 */
	@ApiOperation(value= "Obtiene una lista de hoteles")
	@ApiResponses (value= {
            @ApiResponse(code = 200, message = "OK. El recurso se obtiene correctamente", response = Hotel.class ),
            @ApiResponse(code = 404, message = "Método no permitido."),
            @ApiResponse(code = 500, message = "Error inesperado del sistema")

	})
	@GetMapping(value="hotel",produces =MediaType.APPLICATION_JSON_VALUE)
	public List<Hotel> buscarHoteles(){
		return servicio.listaHoteles();
		
	}
	/**
	 * Meotodo que nos devuel los datos de un hotel 
	 * @param nombre pasamos por url el nombre del hotel para saber sus datos
	 * @return devuelve un objeto hotel del que visualizaremos sus atributos 
	 */
	
	@ApiOperation(value="Busca un hotel mediante el nombre")
	@ApiResponses (value= {
            @ApiResponse(code = 200, message = "OK. El recurso se obtiene correctamente", response = Hotel.class ),
            @ApiResponse(code = 404, message = "Método no permitido."),
            @ApiResponse(code = 500, message = "Error inesperado del sistema")

	})
	@GetMapping(value="hotel/{nombre}",produces =MediaType.APPLICATION_JSON_VALUE)
	public Hotel buscarHotel(@PathVariable String nombre) {
		return servicio.buscarHotel(nombre);
	}

}
