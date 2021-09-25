package com.dseagull.sistemaloja.repository;

import com.dseagull.sistemaloja.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

    List<Cliente> findAll();
}
