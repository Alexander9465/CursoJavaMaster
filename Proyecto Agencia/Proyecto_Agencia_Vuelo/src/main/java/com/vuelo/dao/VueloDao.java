package com.vuelo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vuelo.model.Vuelo;
/**
 * Repositorio de datos para la entidad vuelo
 */
public interface VueloDao extends JpaRepository<Vuelo,Integer>{

}
