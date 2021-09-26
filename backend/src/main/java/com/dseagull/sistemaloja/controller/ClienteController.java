package com.dseagull.sistemaloja.controller;

import com.dseagull.sistemaloja.entity.Cliente;
import com.dseagull.sistemaloja.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("cliente/")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("{id}")
    public ResponseEntity<Object> getCliente(@PathVariable("id") Long id) {
        Cliente cliente = this.clienteService.findById(id);
        return (cliente == null) ? ResponseEntity.ok("Cliente não encontrado") : ResponseEntity.ok(cliente);
    }

    @GetMapping("list")
    public ResponseEntity<Object> getClientes() {
        return ResponseEntity.ok(this.clienteService.findAll());
    }

    @PostMapping
    public ResponseEntity<Object> createCliente(@RequestParam("nome") String nome, @RequestParam("cpf") Integer cpf) {
        Cliente cliente = this.clienteService.save(nome, cpf);
        return ResponseEntity.ok(cliente);
    }


}
