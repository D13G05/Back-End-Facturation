package com.facturation.crud.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facturation.crud.Model.Cliente;
import com.facturation.crud.repository.ClienteRepository;


@Service
public class ClienteServiceImplementation implements ClienteService{
	
	@Id

    @Autowired
    private ClienteRepository clienteRepository;
    

	@Override
	public Cliente saveCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteRepository.save(cliente);
	}
	

	@Override
	public List<Cliente> getAllClientes() {
		// TODO Auto-generated method stub
		return clienteRepository.findAll();
	}

}
