package com.dseagull.sistemaloja.service;

import com.dseagull.sistemaloja.entity.Item;

import java.util.List;

public interface ItemService {

    public List<Item> findAll();

    public Item findById(Long id);
}
