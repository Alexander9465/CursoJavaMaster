package com.vuelo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vuelo.dao.VueloDao;
import com.vuelo.model.Vuelo;
/**
 * 
 * @author Alexander Paul Tupiza 
 *
 */
@Service
public class VueloServiceImp implements VueloService{

	@Autowired
	VueloDao dao; 
	
	
	
	@Override
	public List<Vuelo> buscarVuelos(int plazas) {
		List<Vuelo> lista = new ArrayList<>();
		//Recorremos los vuelos que tengamos 
		for (Vuelo vuelo : dao.findAll()) {
			//Si las plazas son menores o iguales a las que existen podremos añadir ese vuelo a la lista de vuelos disponibles 
			if(plazas<=vuelo.getPlazasDisponibles()) lista.add(vuelo);
				
		}
		return lista;
	}

	@Override
	public void actualizarVuelo(int id, int plazas) {
		//Creamos un objeto vuelo que sera el vuelo buscado por id
		Vuelo vuelo =dao.findById(id).orElse(null);
		 if(vuelo!=null) {
			 //introducimos las nuevas plazas 
			if(plazas<=vuelo.getPlazasDisponibles()) vuelo.setPlazasDisponibles(vuelo.getPlazasDisponibles()-plazas);
			 //actualizamos el vuelo
			 dao.save(vuelo);
		 }
		
	}

	@Override
	public List<Vuelo> vuelos() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	
	
}
