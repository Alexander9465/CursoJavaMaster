package com.producto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.producto.model.Producto;
import com.producto.service.ProdcutoService;

@RestController
public class ProductoController {
	
	@Autowired
	ProdcutoService servicio;
	
	@GetMapping(value="producto",produces =MediaType.APPLICATION_JSON_VALUE)
	public List<Producto> mostrarProducto(){
		return servicio.mostrarProducto();
		
	}
	
	@PutMapping(value="producto/{codigoProducto}/{unidades}")
	public void actualizarProducto(@PathVariable int codigoProducto,@PathVariable int unidades) {
		servicio.actualizarStock(codigoProducto, unidades);
	}

}
