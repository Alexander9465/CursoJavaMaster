package com.reserva.model;
/**
 * Clase auxiliar con la que cogeremos los datos de las peticiones de vuelo 
 * @author Alexander Pual Tupiza Tupiza 
 *
 */
public class HotelAux {
	private int idHotel;
	private String nombre;
	private String categoria;
	private double precio;
	private boolean disponible;
	/**
	 * @param idHotel id del hotel
	 * @param nombre nombre del hotel
	 * @param categoria categoria del hotel
	 * @param precio precio del hotel 
	 * @param disponible muestra si esta disponible
	 */
	public HotelAux(int idHotel, String nombre, String categoria, double precio, boolean disponible) {
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
	public HotelAux() {
		super();
	}
	/**
	 * @return the idHotel
	 */
	public int getIdHotel() {
		return idHotel;
	}
	/**
	 * @param idHotel the idHotel to set
	 */
	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}
	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	/**
	 * @return the disponible
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
	
	
}
