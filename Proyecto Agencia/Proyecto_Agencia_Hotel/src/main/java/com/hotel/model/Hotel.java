package com.hotel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author Alexander Paul Tupiza Tupiza 
 * Clase con la que haremos referencia a la tabla hoteles
 *
 */
@Entity
@Table(name="hoteles")
public class Hotel {
	@Id
	@Column(name = "idhoteles")
	private int idHotel;
	private String nombre;
	private String categoria;
	private double precio;
	private boolean disponible;
	/**
	 * @param idHotel id del hotel 
	 * @param nombre nombre del hotel 
	 * @param categoria categoria del hotel 
	 * @param precio precio que cuesta el hotel
	 * @param disponible si esta disponible el hotel 
	 */
	public Hotel(int idHotel, String nombre, String categoria, double precio, boolean disponible) {
		super();
		this.idHotel = idHotel;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.disponible = disponible;
	}
	/**
	 * 
	 */
	public Hotel() {
		super();
	}
	/**
	 * @return the id_hotel
	 */
	public int getIdHotel() {
		return idHotel;
	}
	
	/**
	 * @return nos regresa el nombre del hotel 
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre insertamos el nuevo nombre del hotel 
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return nos regresa la categoria del hotel
	 */
	public String getCategoria() {
		return categoria;
	}
	/**
	 * @param categoria ingresamos la nueva categoria del hotel 
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	/**
	 * @return obtenemos el precio del hotel 
	 */
	public double getPrecio() {
		return precio;
	}
	/**
	 * @param precio introducimos el nuevo precio del hotel 
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	/**
	 * @return nos devuelve si esta disponible o no el hotel 
	 */
	public boolean isDisponible() {
		return disponible;
	}
	/**
	 * @param disponible the disponible to set
	 */
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	@Override
	public String toString() {
		return "Hotel [id_hotel=" + idHotel + ", nombre=" + nombre + ", categoria=" + categoria + ", precio=" + precio
				+ ", disponible=" + disponible + "]";
	}
	
	
}
