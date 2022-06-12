package com.facturation.crud.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facturation.crud.Model.Cliente;
import com.facturation.crud.Model.Factura;
import com.facturation.crud.Model.Producto;
import com.facturation.crud.repository.ClienteRepository;
import com.facturation.crud.repository.FacturaRepository;
import com.facturation.crud.repository.ProductoRepository;


@Service
public class ProductoServiceImplementation implements ProductoService{
	
	@Id

    @Autowired
    private ProductoRepository productoRepository;

	@Override
	public Producto saveProducto(Producto producto) {
		// TODO Auto-generated method stub
		return productoRepository.save(producto);
	}

	@Override
	public List<Producto> getAllProductos() {
		// TODO Auto-generated method stub
		return productoRepository.findAll();
	}

}
