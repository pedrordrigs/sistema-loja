package com.dseagull.sistemaloja.repository;

import com.dseagull.sistemaloja.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    List<Usuario> findAll();
}
