package com.cliente.service;

import java.util.List;

import com.cliente.model.CursoInfo;
import com.cliente.model.Formacion;

public interface FormacionService {
	List<Formacion> mostrar();
	List<CursoInfo> mostrarCurso();
	List<CursoInfo> altaCurso(Formacion curso);
	CursoInfo creacionCruso(Formacion f);

}
