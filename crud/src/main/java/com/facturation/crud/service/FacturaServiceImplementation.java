package com.facturation.crud.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facturation.crud.Model.Cliente;
import com.facturation.crud.Model.Factura;
import com.facturation.crud.repository.ClienteRepository;
import com.facturation.crud.repository.FacturaRepository;


@Service
public class FacturaServiceImplementation implements FacturaService{
	
	@Id

    @Autowired
    private FacturaRepository facturaRepository;

	@Override
	public Factura saveFactura(Factura factura) {
		// TODO Auto-generated method stub
		return facturaRepository.save(factura);
	}

	@Override
	public Optional<Factura> findFactura(Integer id) {
		// TODO Auto-generated method stub
		return facturaRepository.findById(id);
	}

	@Override
	public List<Factura> getAllFactura() {
		// TODO Auto-generated method stub
		return facturaRepository.findAll();
	}

}
