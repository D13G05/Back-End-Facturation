package com.facturation.crud.service;

import java.util.List;
import java.util.Optional;

import com.facturation.crud.Model.Detalle;
import com.facturation.crud.Model.Factura;
import com.facturation.crud.Model.Producto;

public interface DetalleService {
	
	public Detalle saveDetalle(Detalle detalle);
    public List<Detalle> getAllDetalles();
    public Optional<Detalle> findDetalle(Integer num_detalle );
}
