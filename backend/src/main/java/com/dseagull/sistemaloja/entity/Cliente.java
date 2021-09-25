package com.dseagull.sistemaloja.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nome;

    private Integer cpf;

    @CreationTimestamp
    private Date dataCriacao;

    public Cliente() {
    }

    public Cliente(String nome, Integer cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
}
