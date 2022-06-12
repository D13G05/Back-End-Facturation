package com.facturation.crud.service;

import java.util.List;
import java.util.Optional;

import com.facturation.crud.Model.Factura;
import com.facturation.crud.Model.Producto;

public interface ProductoService {
	
	public Producto saveProducto(Producto producto);
    public List<Producto> getAllProductos();
}
