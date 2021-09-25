package com.dseagull.sistemaloja.repository;

import com.dseagull.sistemaloja.entity.ItemEstoque;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemEstoqueRepository extends CrudRepository<ItemEstoque, Long> {

    List<ItemEstoque> findAll();
}
