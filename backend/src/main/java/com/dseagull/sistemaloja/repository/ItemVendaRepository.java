package com.dseagull.sistemaloja.repository;

import com.dseagull.sistemaloja.entity.ItemVenda;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemVendaRepository extends CrudRepository<ItemVenda, Long> {

    List<ItemVenda> findAll();
}
