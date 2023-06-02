package com.vuelo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author Alexander Paul Tupiza Tupiza 
 * Clase con la que haremos referencia a la tabla vuelos que tenemos en la base de datos 
 */
@Entity
@Table(name="vuelos")

public class Vuelo {
	@Id
	private int idVuelo;
	private String compañia;
	private Date fechaVuelo;
	private double precio;
	private int plazasDisponibles;
	/**
	 * @param idVuelo id de los vuelos
	 * @param compañia	nombre de la compañia aerea
	 * @param fechaVuelo fecha del vuelo 
	 * @param precio	precio del vuelo 
	 * @param plazasDisponibles	plazas disponibles que tiene el vuelo 
	 */
	public Vuelo(int idVuelo, String compañia, Date fechaVuelo, double precio, int plazasDisponibles) {
		super();
		this.idVuelo = idVuelo;
		this.compañia = compañia;
		this.fechaVuelo = fechaVuelo;
		this.precio = precio;
		this.plazasDisponibles = plazasDisponibles;
	}
	/**
	 * 
	 */
	public Vuelo() {
		super();
	}
	/**
	 * @return nos devuelv el id del vuelo 
	 */
	public int getIdVuelo() {
		return idVuelo;
	}
	
	/**
	 * @return nos devuelve el nombre de la compañia 
	 */
	public String getCompañia() {
		return compañia;
	}
	/**
	 * @param insertamos el nuevo nombre de la compañia para cambiarla
	 */
	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	/**
	 * @return nos devuelve la fecha del vuelo 
	 */
	public Date getFechaVuelo() {
		return fechaVuelo;
	}
	/**
	 * @param insertamos la nueva fecha para modificarla
	 */
	public void setFechaVuelo(Date fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}
	/**
	 * @return nos da el precio del vuelo 
	 */
	public double getPrecio() {
		return precio;
	}
	/**
	 * @param Insertamos el nuevo precio del vuelo 
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	/**
	 * @return Devuelve las plazas disponibles 
	 */
	public int getPlazasDisponibles() {
		return plazasDisponibles;
	}
	/**
	 * @param Insertamos la nuevas plazas disponibles 
	 */
	public void setPlazasDisponibles(int plazasDisponibles) {
		this.plazasDisponibles = plazasDisponibles;
	}
	
	

}
