package com.producto.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.producto.model.Producto;

public interface ProductoDao extends JpaRepository<Producto, Integer>{

}
