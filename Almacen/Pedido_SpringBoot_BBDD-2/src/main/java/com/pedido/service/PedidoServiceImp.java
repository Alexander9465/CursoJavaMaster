package com.pedido.service;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pedido.dao.PedidoDao;
import com.pedido.dao.ProductoAux;
import com.pedido.model.Pedido;

@Service
public class PedidoServiceImp implements PedidoService {

	@Autowired
	PedidoDao dao;
	
	@Autowired
	RestTemplate template;
	
	private String url="http://localhost:8080/";

	@Override
	public List<Pedido> mostrarPedido() {
		
		return dao.findAll();
	}

	@Override
	public void altaPedido(int codigoProducto, int unidades) {
		
//		Date fecha = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		String fechaFormateada = sdf.format(fecha);
		
		Double  precio = template.getForObject(url+"producto/"+codigoProducto, Double.class);
	
		
		Pedido p1 = new Pedido();
		p1.setCodigoProducto(codigoProducto);
		p1.setTotal(unidades*precio);
		p1.setUnidades(unidades);
		
		dao.save(p1);
		actualizarStock(codigoProducto,unidades);

		
	}
	private void actualizarStock(int codigoProducto, int unidades) {
		template.put(url+"producto/{codigo}/{unidades}", null, codigoProducto,unidades);
	}

}
