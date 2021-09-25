package com.dseagull.sistemaloja.service;

import com.dseagull.sistemaloja.entity.Venda;

import java.util.List;

public interface VendaService {
    public List<Venda> findAll();

    public Venda findById(Long id);
}
