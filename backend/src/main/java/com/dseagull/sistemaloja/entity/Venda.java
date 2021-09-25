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
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToMany(mappedBy = "venda", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<ItemVenda> itens = new HashSet<>();

    private Double valor;

    private String formaPagamento;

    @CreationTimestamp
    private Date dataCriacao;

    public Venda() {
    }

    public Venda(Set<ItemVenda> itens, Double valor, String formaPagamento) {
        this.itens = itens;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
    }
}
