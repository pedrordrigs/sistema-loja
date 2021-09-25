package com.dseagull.sistemaloja.service;

import com.dseagull.sistemaloja.entity.Cliente;

import java.util.List;

public interface ClienteService {

    public List<Cliente> findAll();

    public Cliente findById(Long id);

    public Cliente save(String nome, Integer cpf);
}
