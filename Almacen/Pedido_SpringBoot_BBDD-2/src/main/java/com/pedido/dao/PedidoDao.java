package com.pedido.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedido.model.Pedido;

public interface PedidoDao extends JpaRepository<Pedido, Integer>{

}
