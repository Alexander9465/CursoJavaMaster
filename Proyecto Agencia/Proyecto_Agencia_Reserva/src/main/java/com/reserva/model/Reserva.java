package com.reserva.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author Alexander Paul Tupiza Tupiza 
 *	Clase que hara referencia a la tabla Reservas 
 */
@Entity
@Table(name="reservas")
public class Reserva {
	@Id
	@Column(name="idReservas")
	private int idReserva;
	@Column(name="nombreCliente")
	private String nombre;
	private String dni;
	private int idHotel;
	private int idVuelo;
	private int numpersonas;
	/**
	 * @param idReserva 	Id del hotel 
	 * @param nombre		Nombre del hotel
	 * @param dni			Dni de la parsona que hace la reserva
	 * @param idHotel 		Id del hote
	 * @param idVuelo		Id del vuelo
	 * @param numpersonas	Numero de personas para la reserva
	 */
	public Reserva(int idReserva, String nombre, String dni, int idHotel, int idVuelo, int numpersonas) {
		super();
		this.idReserva = idReserva;
		this.nombre = nombre;
		this.dni = dni;
		this.idHotel = idHotel;
		this.idVuelo = idVuelo;
		this.numpersonas = numpersonas;
	}
	
	
	


	/**
	 * 
	 */
	public Reserva() {
		super();
	}


	/**
	 * 
	 * @return idReserva regresa el id de la reserva
	 */
	public int getIdReserva() {
		return idReserva;
	}
	
	/**
	 * @return the nombre de la reserva 
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * cambia el nombre de quien hizo la reserva
	 * @param nombre 
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**Devuelve el dni de la persona que hizo la reserva
	 * @return the dni 
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * Cambia el dni de la persona que hizo la reserva
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * Nos devuele el id del hotel 
	 * @return the hotel
	 */
	public int getHotel() {
		return idHotel;
	}
	/**
	 * cambiamos el id del hotel 
	 * @param hotel the hotel to set
	 */
	public void setHotel(int hotel) {
		this.idHotel = hotel;
	}
	/**
	 * Nos devuelve el id del vuelo 
	 * @return the vuelo
	 */
	public int getVuelo() {
		return idVuelo;
	}
	/**
	 * CAmbiamos el id del vuelo 
	 * @param vuelo the vuelo to set
	 */
	public void setVuelo(int vuelo) {
		this.idVuelo = vuelo;
	}
	/**
	 * Nos devulve el numero de personas para la reserva
	 * @return the numpersonas
	 */
	public int getNumpersonas() {
		return numpersonas;
	}
	/**
	 * Cambiamos el numero de persona para la reserva
	 * @param numpersonas the numpersonas 
	 */
	public void setNumpersonas(int numpersonas) {
		this.numpersonas = numpersonas;
	}
	
	
}
