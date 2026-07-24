package com.shalom.ec.shalom_API_REST.controller;

import com.shalom.ec.shalom_API_REST.model.entity.cliente;
import com.shalom.ec.shalom_API_REST.service.Icliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/v1")
public class clienteController {
    @Autowired
    private Icliente clienteService;
    @PostMapping("cliente")
    public cliente create(@RequestBody cliente cliente){

        return clienteService.save(cliente);
    }
    @PutMapping("cliente")
    public cliente update(@RequestBody cliente cliente){

        return clienteService.save(cliente);
    }
    @DeleteMapping("cliente/{id}")
    public void delete(@PathVariable Integer id) {
        cliente clienteEliminar= clienteService.findById(id);
        clienteService.delete(clienteEliminar);
    }
    @GetMapping("cliente/{id}")
    public cliente showById(@PathVariable Integer id){

        return clienteService.findById(id);

    }
}
