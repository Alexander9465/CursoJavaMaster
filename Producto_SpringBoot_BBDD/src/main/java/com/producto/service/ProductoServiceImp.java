package com.producto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.producto.dao.ProductoDao;
import com.producto.model.Producto;
@Service
public class ProductoServiceImp implements ProdcutoService {

	@Autowired
	ProductoDao dao;
	@Override
	public List<Producto> mostrarProducto() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public void actualizarStock(int codigo, int unidades) {
		Producto p = new Producto();
		p= dao.findById(codigo).orElse(null);
		p.setStock(unidades);
		dao.save(p);
		
	}

	@Override
	public double precioProducto(Producto p) {
		
		double d= dao.findById(p.getCodigoProducto()).orElse(null).getPrecioUnitario();
		return d;
	}

}
