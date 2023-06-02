package com.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.dao.HotelDao;
import com.hotel.model.Hotel;
/**
 * 
 * @author Alexander Paul Tupiza Tupiza 
 *
 */
@Service
public class HotelServiceImp implements HotelService{
	
	/**
	 * inyectamos hotel dao
	 */
	@Autowired
	HotelDao dao;
	
	
	@Override
	public List<Hotel> listaHoteles() {
		
		return dao.findAll();
	}

	@Override
	public Hotel buscarHotel(String nombre) {
		Hotel h = dao.findByNombre(nombre);
		return h;
	}

}
