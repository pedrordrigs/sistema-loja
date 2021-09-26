package com.dseagull.sistemaloja.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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

    @OneToMany(mappedBy = "venda", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<ItemVenda> itens = new HashSet<>();

    public Cliente() {
    }

    public Cliente(String nome, Integer cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
}
