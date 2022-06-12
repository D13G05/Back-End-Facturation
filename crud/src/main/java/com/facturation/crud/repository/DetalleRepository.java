package com.facturation.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.facturation.crud.Model.Detalle;

@Repository
public interface DetalleRepository extends JpaRepository<Detalle, Integer>{

}
