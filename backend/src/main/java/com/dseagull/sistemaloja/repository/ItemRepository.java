package com.dseagull.sistemaloja.repository;

import com.dseagull.sistemaloja.entity.Item;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemRepository extends CrudRepository<Item, Long> {

    List<Item> findAll();
}
