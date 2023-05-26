package com.cursojava.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cursojava.model.Curso;



public interface CursoDao extends JpaRepository<Curso, Integer> {

	
	@Query("SELECT c FROM Curso c WHERE c.precio BETWEEN :a AND :b")
	List<Curso> findBy(double a ,double b);
	
	
}
 