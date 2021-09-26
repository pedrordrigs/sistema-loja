package com.dseagull.sistemaloja.controller;

import com.dseagull.sistemaloja.entity.Item;
import com.dseagull.sistemaloja.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("item-estoque/")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("{id}")
    public ResponseEntity<Object> getItem(@PathVariable("id") Long id) {
        Item item = this.itemService.findById(id);
        return (item == null) ? ResponseEntity.ok("Item não encontrado") : ResponseEntity.ok(item);
    }

    @GetMapping("list")
    public ResponseEntity<Object> getItens() {
        return ResponseEntity.ok(this.itemService.findAll());
    }

    @PostMapping
    public ResponseEntity<Object> createItem(@RequestParam("codigo") String codigo,
                                             @RequestParam("nome") String nome,
                                             @RequestParam("preco") Double preco,
                                             @RequestParam("quantidade") Integer quantidadeEstoque) {
        Item item = this.itemService.save(codigo, nome, preco, quantidadeEstoque);
        return ResponseEntity.ok(item);
    }
}
