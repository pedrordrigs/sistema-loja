package com.dseagull.sistemaloja.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nome;

    private String email;

    private String perfil;

    public Usuario() {
    }

    public Usuario(String nome, String email, String perfil) {
        this.nome = nome;
        this.email = email;
        this.perfil = perfil;
    }
}
