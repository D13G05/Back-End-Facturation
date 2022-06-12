package com.facturation.crud.service;

import java.util.List;
import java.util.Optional;

import com.facturation.crud.Model.Factura;

public interface FacturaService {
	
	public Factura saveFactura(Factura factura);
    public List<Factura> getAllFactura();
    public Optional<Factura> findFactura(Integer id);
}
