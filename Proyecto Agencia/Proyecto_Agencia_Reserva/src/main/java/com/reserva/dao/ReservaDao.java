package com.reserva.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reserva.model.Reserva;
/**
 * Repositorio de datos para la entidad Reserva
 */
public interface ReservaDao  extends JpaRepository<Reserva,Integer>{

}
