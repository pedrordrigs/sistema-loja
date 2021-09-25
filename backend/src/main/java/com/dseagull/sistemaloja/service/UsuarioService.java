package com.dseagull.sistemaloja.service;

import com.dseagull.sistemaloja.entity.Usuario;

import java.util.List;

public interface UsuarioService {

    public List<Usuario> findAll();

    public Usuario findById(Long id);
}
