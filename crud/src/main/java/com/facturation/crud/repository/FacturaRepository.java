package com.facturation.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.facturation.crud.Model.Factura;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Integer>{

}
