package com.dseagull.sistemaloja.service.impl;

import com.dseagull.sistemaloja.entity.Item;
import com.dseagull.sistemaloja.repository.ItemRepository;
import com.dseagull.sistemaloja.service.ItemEstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemEstoqueServiceImpl implements ItemEstoqueService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    @Override
    public Item findById(Long id) {
        Optional<Item> itemEstoque = itemRepository.findById(id);
        if (itemEstoque.isPresent())
            return itemEstoque.get();
        return null;
    }
}
