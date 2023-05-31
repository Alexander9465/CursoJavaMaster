package com.cliente.model;



public class CursoInfo {
	
	private int codCurso;
	private String nombre;
	private int duracion;
	private double precio;

	
	


	/**
	 * @param codCurso
	 * @param nombre
	 * @param duracion
	 * @param precio
	 */
	public CursoInfo(int codCurso, String nombre, int duracion, double precio) {
		super();
		this.codCurso = codCurso;
		this.nombre = nombre;
		this.duracion = duracion;
		this.precio = precio;
	}
	

	/**
	 * 
	 */
	public CursoInfo() {
		
	}


	/**
	 * @return the codCurso
	 */
	public int getCodCurso() {
		return codCurso;
	}


	/**
	 * @param codCurso the codCurso to set
	 */
	public void setCodCurso(int codCurso) {
		this.codCurso = codCurso;
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
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}


	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
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
		return "Curso [codCurso=" + codCurso + ", nombre=" + nombre + ", duracion=" + duracion + ", precio=" + precio
				+ "]";
	}
	
	
}
