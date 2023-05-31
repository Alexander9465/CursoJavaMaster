package com.cliente.model;

public class Formacion {
	private String nombre;
	private int asignaturas;
	private double precio ;
	/**
	 * @param curso
	 * @param asignaturas
	 * @param precio
	 */
	public Formacion(String nombre, int asignaturas, double precio) {
		super();
		this.nombre = nombre;
		this.asignaturas = asignaturas;
		this.precio = precio;
	}
	/**
	 * 
	 */
	public Formacion() {
		super();
	}
	/**
	 * @return the curso
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param curso the curso to set
	 */
	public void setNombre(String curso) {
		this.nombre = curso;
	}
	/**
	 * @return the asignaturas
	 */
	public int getAsignaturas() {
		return asignaturas;
	}
	/**
	 * @param asignaturas the asignaturas to set
	 */
	public void setAsignaturas(int asignaturas) {
		this.asignaturas = asignaturas;
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
	@Override
	public String toString() {
		return "Formacion [curso=" + nombre + ", asignaturas=" + asignaturas + ", precio=" + precio + "]";
	}
	
	
}
