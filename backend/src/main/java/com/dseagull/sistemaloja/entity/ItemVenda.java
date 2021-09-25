package com.dseagull.sistemaloja.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class ItemVenda {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private Item item;

    private Integer quantidade;

    private Double precoTotal;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "venda_id", nullable = false)
    private Venda venda;

    public ItemVenda() {
    }

    public ItemVenda(Item item, Integer quantidade, Double precoTotal, Venda venda) {
        this.item = item;
        this.quantidade = quantidade;
        this.precoTotal = precoTotal;
        this.venda = venda;
    }
}
