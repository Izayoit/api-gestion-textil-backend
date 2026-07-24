package com.shalom.ec.shalom_API_REST.controller;

import com.shalom.ec.shalom_API_REST.model.entity.categoria;

import com.shalom.ec.shalom_API_REST.service.Icategoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1")
public class categoriaController {
    @Autowired
    private Icategoria clienteService;
    @PostMapping("categoria")
    public categoria create(@RequestBody categoria categoria){

        return clienteService.save(categoria);
    }
    @PutMapping("categoria")
    public categoria update(@RequestBody categoria categoria){

        return clienteService.save(categoria);
    }
    @DeleteMapping("categoria/{id}")
    public void delete(@PathVariable Integer id) {
        categoria categoriaEliminar= clienteService.findById(id);
        clienteService.delete(categoriaEliminar);
    }
    @GetMapping("categoria/{id}")
    public categoria showById(@PathVariable Integer id){

        return clienteService.findById(id);

    }
}
