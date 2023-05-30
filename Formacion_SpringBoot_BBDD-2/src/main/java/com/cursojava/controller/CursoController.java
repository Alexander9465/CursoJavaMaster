package com.cursojava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cursojava.model.Curso;
import com.cursojava.service.CursoService;

@RestController
public class CursoController {
	
	@Autowired
	CursoService service;
	
	@GetMapping(value="curso/{codCurso}",produces =MediaType.APPLICATION_JSON_VALUE)
	public Curso buscarCurso( @PathVariable int codCurso) {
		return service.buscarCurso(codCurso);
	}
	
//	@GetMapping(value="cursoDuracion/{codCurso}",produces =MediaType.APPLICATION_JSON_VALUE)
//	public Integer getDuracion(Integer codCurso) {
//		return service.getDuracion(codCurso);
//	}
	@GetMapping(value="curso" ,produces =MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> Curso(){
		return service.curso()	;	
	}
	
	@PostMapping(value="curso" , produces =MediaType.APPLICATION_JSON_VALUE)
	public void altaCurso(@RequestBody Curso curso) {
		service.altaCurso(curso);
	}
	
	@PutMapping(value="curso/{codCurso}/{horas}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void actualizarHoras(@PathVariable int codCurso,@PathVariable int horas) {
		service.actualizarHoras(codCurso,horas);
	}
	
	@DeleteMapping(value="curso/{codCurso}",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> borrarCurso(@PathVariable int codCurso){
		return service.borrarCurso(codCurso);
		
	}
	
	@GetMapping(value="curso/{min}/{max}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> buscarRango(@PathVariable("min") int min,@PathVariable("max") int max){
		
		return service.buscarRango(min, max);
	}
	

}
