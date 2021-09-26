package com.dseagull.sistemaloja.service;

import com.dseagull.sistemaloja.entity.Item;

import java.util.List;

public interface ItemService {

    public List<Item> findAll();

    public Item findById(Long id);

    public Item save(String codigo, String nome, Double preco, Integer quantidadeEstoque);
}
