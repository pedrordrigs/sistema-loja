package com.dseagull.sistemaloja.repository;

import com.dseagull.sistemaloja.entity.Venda;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VendaRepository extends CrudRepository<Venda, Long> {

    List<Venda> findAll();
}
