package com.dseagull.sistemaloja.service;

import com.dseagull.sistemaloja.entity.ItemVenda;

import java.util.List;

public interface ItemVendaService {

    public List<ItemVenda> findAll();

    public ItemVenda findById(Long id);
}
