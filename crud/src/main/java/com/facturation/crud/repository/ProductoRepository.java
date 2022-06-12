package com.facturation.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.facturation.crud.Model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
