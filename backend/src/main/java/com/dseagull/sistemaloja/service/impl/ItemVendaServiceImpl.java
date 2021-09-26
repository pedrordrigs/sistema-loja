package com.dseagull.sistemaloja.service.impl;

import com.dseagull.sistemaloja.entity.ItemVenda;
import com.dseagull.sistemaloja.repository.ItemVendaRepository;
import com.dseagull.sistemaloja.service.ItemVendaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ItemVendaServiceImpl implements ItemVendaService {

    @Autowired
    private ItemVendaRepository itemVendaRepository;

    @Override
    public List<ItemVenda> findAll() {
        return this.itemVendaRepository.findAll();
    }

    @Override
    public ItemVenda findById(Long id) {
        Optional<ItemVenda> itemVenda = this.itemVendaRepository.findById(id);
        if (itemVenda.isPresent())
            return itemVenda.get();
        return null;
    }
}
