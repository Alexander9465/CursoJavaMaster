package com.pedido.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido {
	
	@Id
	private int idPedido;
	private int codigoProducto;
	private int unidades;
	private double total;
	private Date fechaPedido;
	/**
	 * @param idPedido
	 * @param codigoProducto
	 * @param unidades
	 * @param total
	 * @param fecha
	 */
	public Pedido(int idPedido, int codigoProducto, int unidades, double total, Date fechaPedido) {
		super();
		this.idPedido = idPedido;
		this.codigoProducto = codigoProducto;
		this.unidades = unidades;
		this.total = total;
		this.fechaPedido = fechaPedido;
	}
	/**
	 * 
	 */
	public Pedido() {
		super();
	}
	/**
	 * @return the idPedido
	 */
	public int getIdPedido() {
		return idPedido;
	}
	/**
	 * @param idPedido the idPedido to set
	 */
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	/**
	 * @return the codigoProducto
	 */
	public int getCodigoProducto() {
		return codigoProducto;
	}
	/**
	 * @param codigoProducto the codigoProducto to set
	 */
	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	/**
	 * @return the unidades
	 */
	public int getUnidades() {
		return unidades;
	}
	/**
	 * @param unidades the unidades to set
	 */
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(double total) {
		this.total = total;
	}
	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fechaPedido;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fechaPedido = fecha;
	}
	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", codigoProducto=" + codigoProducto + ", unidades=" + unidades
				+ ", total=" + total + ", fecha=" + fechaPedido + "]";
	}
	
	
}
