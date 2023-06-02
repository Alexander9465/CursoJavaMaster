package com.reserva.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.reserva.dao.ReservaDao;
import com.reserva.model.HotelAux;
import com.reserva.model.Reserva;

/**
 * 
 * @author Alexander Paul Tupiza Tupiza 
 *
 */
@Service
public class ReservaServiceImp  implements ReservaService{

	@Autowired
	ReservaDao dao;
	//url que hace referencia a las peticiones de vuelo
	String url="http://localhost:9090/";
	//url que hace referencia  a las peticiones de hotel 
	String url1 ="http://localhost:8080/";
	@Autowired
	RestTemplate template;
	
	@Override
	public List<Reserva> listaReserva() {
		
		return dao.findAll();
	}
	
	
	@Override
	public void reserva(Reserva r) {
		//metodo con el que actulizamos la reserva
		actualizarReserva(r.getVuelo(), r.getNumpersonas());
		//guardamos la reserva
		dao.save(r);
		
		
	}
	/**
	 * Meotod para actulizar las plazas disponibles en los vuelo 
	 * @param id numero del vuelo
	 * @param plazas plazas con las que vamos a modifiacar
	 */
	public void actualizarReserva(int id,int plazas) {
		//hacemos la peticion a vuelos
		
		
		
		template.put(url+"vuelo/{id}/{plazas}",null,id,plazas);
	}
	
	
	@Override
	public List<Reserva> listaConcreta(String nombre) {
		List<Reserva> lista = new ArrayList<>();
		//recorremos la lista de reservas 
		for(Reserva reserva : dao.findAll()) {
			//mediante el metodo buscarHotel conseguimo el id y comparamos las reservas que tengas el mismo id 
			if(reserva.getHotel() == buscarHotel(nombre)) {
				//lo añadimos a la lista que vamos a devolver 
				lista.add(reserva);
			}
			
		}
		
		return lista;
		
		
	}
	/**
	 * Metodo con el que vamos a buscar el id del hotel mediante una peticion a hotel 
	 * @param nombre del hotel que queremos buscar
	 * @return id del hotel al que corresponde el nombre
	 */
	public int buscarHotel(String nombre ) {
		HotelAux hotel ;
		hotel = template.getForObject(url1 + "hotel/"+nombre, HotelAux.class);
		return hotel.getIdHotel();
	}
	
	
}
