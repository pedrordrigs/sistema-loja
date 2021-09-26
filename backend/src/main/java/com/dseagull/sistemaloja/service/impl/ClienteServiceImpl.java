package com.dseagull.sistemaloja.service.impl;

import com.dseagull.sistemaloja.entity.Cliente;
import com.dseagull.sistemaloja.repository.ClienteRepository;
import com.dseagull.sistemaloja.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> findAll() {
        return this.clienteRepository.findAll();
    }

    @Override
    public Cliente findById(Long id) {
        Optional<Cliente> cliente = this.clienteRepository.findById(id);
        if (cliente.isPresent())
            return cliente.get();
        return null;
    }

    @Override
    public Cliente save(String nome, Integer cpf) {
        Cliente cliente = new Cliente(nome, cpf);
        return this.clienteRepository.save(cliente);
    }
}
