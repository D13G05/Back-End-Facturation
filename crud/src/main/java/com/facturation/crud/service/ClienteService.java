package com.facturation.crud.service;

import java.util.List;
import java.util.Optional;

import com.facturation.crud.Model.Cliente;

public interface ClienteService {
	
	public Cliente saveCliente(Cliente cliente);
    public List<Cliente> getAllClientes();

}
