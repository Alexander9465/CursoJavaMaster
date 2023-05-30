package com.cursojava.service;

import java.util.List;
import java.util.Optional;

import com.cursojava.model.Curso;

public interface CursoService {
	List<Curso> altaCurso(Curso curso);
	List<Curso> borrarCurso(int c);
	void actualizarHoras(int c,int b);
	Curso buscarCurso(int c);
	List<Curso> buscarRango(double min,double max);
	List<Curso> curso();
	//int getDuracion(Integer c);

}
