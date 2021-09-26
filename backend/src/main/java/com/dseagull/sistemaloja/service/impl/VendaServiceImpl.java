package com.dseagull.sistemaloja.service.impl;

import com.dseagull.sistemaloja.entity.Venda;
import com.dseagull.sistemaloja.repository.VendaRepository;
import com.dseagull.sistemaloja.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class VendaServiceImpl implements VendaService {

    @Autowired
    private VendaRepository vendaRepository;

    @Override
    public List<Venda> findAll() {
        return this.vendaRepository.findAll();
    }

    @Override
    public Venda findById(Long id) {
        Optional<Venda> venda = this.vendaRepository.findById(id);
        if (venda.isPresent())
            return venda.get();
        return null;
    }
}
