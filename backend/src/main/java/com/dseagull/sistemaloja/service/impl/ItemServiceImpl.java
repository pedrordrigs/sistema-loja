package com.dseagull.sistemaloja.service.impl;

import com.dseagull.sistemaloja.entity.Item;
import com.dseagull.sistemaloja.repository.ItemRepository;
import com.dseagull.sistemaloja.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<Item> findAll() {
        return this.itemRepository.findAll();
    }

    @Override
    public Item findById(Long id) {
        Optional<Item> itemEstoque = this.itemRepository.findById(id);
        if (itemEstoque.isPresent())
            return itemEstoque.get();
        return null;
    }

    @Override
    public Item save(String codigo, String nome, Double preco, Integer quantidadeEstoque) {
        Item item = new Item(codigo, nome, preco, quantidadeEstoque);
        return this.itemRepository.save(item);
    }
}
