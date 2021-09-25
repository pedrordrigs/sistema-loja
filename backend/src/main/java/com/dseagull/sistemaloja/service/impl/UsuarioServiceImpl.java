package com.dseagull.sistemaloja.service.impl;

import com.dseagull.sistemaloja.entity.Usuario;
import com.dseagull.sistemaloja.repository.UsuarioRepository;
import com.dseagull.sistemaloja.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario findById(Long id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        if (usuario.isPresent())
            return usuario.get();
        return null;
    }

}
