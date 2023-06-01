package src.main.java.com.pedido.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedido.model.Pedido;
import com.pedido.service.PedidoService;

@RestController
public class PedidoController {
	
	@Autowired
	PedidoService servicio;
	
	@GetMapping(value="pedido",produces =MediaType.APPLICATION_JSON_VALUE )
	public List<Pedido> mostrarPedidos(){
		return servicio.mostrarPedido();
	}
	
	@PostMapping(value="pedido/{codigo}/{unidades}")
	public void altaPedido(@PathVariable int codigo, @PathVariable int unidades) {
		servicio.altaPedido(codigo, unidades);
		
	}
	
	
}
