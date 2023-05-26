package com.cursojava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursojava.dao.CursoDao;
import com.cursojava.model.Curso;

@Service
public class CursoServiceImp implements CursoService {
	
	@Autowired
	CursoDao cdao;

	@Override
	public List<Curso> altaCurso(Curso curso) {
		cdao.save(curso);
		return  cdao.findAll();
	}

	@Override
	public List<Curso> borrarCurso(int c) {
		// TODO Auto-generated method stub
		cdao.deleteById(c);
		return cdao.findAll();
		
	}

	@Override
	public void actualizarHoras(int c,int b) {
		// TODO Auto-generated method stub
		Curso curso = cdao.findById(c).orElseThrow();
		curso.setDuracion(b);
		cdao.save(curso);
		
		
	}

	@Override
	public Curso buscarCurso(int c) {
		// TODO Auto-generated method stub
		return cdao.findById(c).orElse(null);
	}

	@Override
	public List<Curso> buscarRango(double min, double max) {
		
		return cdao.findBy(min,max);
	}

	@Override
	public List<Curso> curso() {
		// TODO Auto-generated method stub
		return cdao.findAll();
	}

}
