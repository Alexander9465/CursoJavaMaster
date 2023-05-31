package com.pedido.service;

import java.util.List;

import com.pedido.model.Pedido;

public interface PedidoService {
	List<Pedido> mostrarPedido();
	void altaPedido(int codigoProducto,int unidades);
}
