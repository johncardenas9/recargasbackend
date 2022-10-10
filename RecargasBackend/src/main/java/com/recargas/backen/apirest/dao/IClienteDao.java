package com.recargas.backen.apirest.dao;

import org.springframework.data.repository.CrudRepository;

import com.recargas.backen.apirest.models.Cliente;



public interface IClienteDao extends CrudRepository<Cliente, Long>{

}

