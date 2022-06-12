package com.facturation.crud.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facturation.crud.Model.Cliente;
import com.facturation.crud.Model.Detalle;
import com.facturation.crud.Model.Factura;
import com.facturation.crud.Model.Producto;
import com.facturation.crud.repository.ClienteRepository;
import com.facturation.crud.repository.DetalleRepository;
import com.facturation.crud.repository.FacturaRepository;
import com.facturation.crud.repository.ProductoRepository;


@Service
public class DetalleServiceImplementation implements DetalleService{
	
	@Id

    @Autowired
    private DetalleRepository detalleRepository;

	@Override
	public Detalle saveDetalle(Detalle detalle) {
		// TODO Auto-generated method stub
		return detalleRepository.save(detalle);
	}

	@Override
	public List<Detalle> getAllDetalles() {
		// TODO Auto-generated method stub
		return detalleRepository.findAll();
	}

	@Override
	public Optional<Detalle> findDetalle(Integer num_detalle ) {
		// TODO Auto-generated method stub
		return detalleRepository.findById(num_detalle );
	}

}
