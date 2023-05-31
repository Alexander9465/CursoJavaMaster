package com.cliente.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cliente.model.CursoInfo;
import com.cliente.model.Formacion;

@Service
public class FormacionServiceImp implements FormacionService {
	
	@Autowired
	 RestTemplate template;
	
	private String url="http://localhost:8080/";
	@Override
	public List<Formacion> mostrar() {
		
		
		return Arrays.asList(template.getForObject(url+"curso", Formacion[].class));
	}
	@Override
	public List<CursoInfo> mostrarCurso() {
		// TODO Auto-generated method stub
		return Arrays.asList(template.getForObject(url+"curso", CursoInfo[].class));
	}
	@Override
	public List<CursoInfo> altaCurso(Formacion c) {
		template.postForLocation(url+"curso", c);
		return Arrays.asList(template.getForObject(url+"curso", CursoInfo[].class));
	}
	@Override
	public CursoInfo creacionCruso(Formacion f) {
	
		template.postForLocation(url+"curso", new CursoInfo(2,f.getNombre(),f.getAsignaturas()*10,f.getPrecio()));
		return null;
	}
	
	
	
}
