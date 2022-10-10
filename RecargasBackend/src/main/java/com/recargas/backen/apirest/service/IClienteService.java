package com.recargas.backen.apirest.service;

import com.recargas.backen.apirest.models.Cliente;

import java.util.List;


public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public void save(Cliente cliente);
	
	public Cliente findById(Long id);
	
	public void delete(Cliente cliente);

}

