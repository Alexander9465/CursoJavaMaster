package com.pedido.dao;

public class ProductoAux {
	private int codigoProducto;
	private String producto;
	private double precioUnitario;
	private int stock;
	/**
	 * @param codigoProducto
	 * @param prodcuto
	 * @param unidades
	 * @param total
	 * @param fecha
	 */
	public ProductoAux(int codigoProducto, String producto, double precioUnitario, int stock) {
		super();
		this.codigoProducto = codigoProducto;
		this.producto = producto;
		this.precioUnitario = precioUnitario;
		this.stock = stock;
	}
	/**
	 * 
	 */
	public ProductoAux() {
		super();
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
	 * @return the prodcuto
	 */
	public String getProdcuto() {
		return producto;
	}
	/**
	 * @param prodcuto the prodcuto to set
	 */
	public void setProdcuto(String prodcuto) {
		this.producto = prodcuto;
	}
	/**
	 * @return the unidades
	 */
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	/**
	 * @param unidades the unidades to set
	 */
	public void setPrecioUnitario(double unidades) {
		this.precioUnitario = unidades;
	}
	/**
	 * @return the total
	 */
	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}
	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Producto [codigoProducto=" + codigoProducto + ", prodcuto=" + producto + ", precioUnitario="
				+ precioUnitario + ", stock=" + stock + "]";
	}
	
}
