package com.cliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cliente.model.CursoInfo;
import com.cliente.model.Formacion;
import com.cliente.service.FormacionService;




@RestController
public class FormacionController {
	
	@Autowired
	FormacionService servicio;
	
	@GetMapping(value="formacion" ,produces =MediaType.APPLICATION_JSON_VALUE)
	public List<Formacion> mostrar(){
		List<CursoInfo> listaCurso =  servicio.mostrarCurso();
		List<Formacion> listaFormacion = servicio.mostrar();
		
		for (CursoInfo curso : listaCurso) {
			int duracion = curso.getDuracion();
			int asignatura = duracion >= 50 ? 10:5;
			for (Formacion formacion : listaFormacion) {
				if(curso.getNombre().equals(formacion.getNombre())) {
					formacion.setAsignaturas(asignatura);
				}
			}
		}
		return listaFormacion;
	}


	@PostMapping(value="formacion",produces =MediaType.APPLICATION_JSON_VALUE)
	public CursoInfo altaCurso(@RequestBody Formacion f) {
		return servicio.creacionCruso(f);
		
	}
	
		
		

}
