package com.producto.service;

import java.util.List;

import com.producto.model.Producto;

public interface ProdcutoService {
	List<Producto> mostrarProducto();
	void actualizarStock(int codigo,int unidades);
	double precioProducto(Producto p);

	
	
}
