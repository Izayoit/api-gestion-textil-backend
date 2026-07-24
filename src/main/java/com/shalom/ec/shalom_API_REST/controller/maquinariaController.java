package com.shalom.ec.shalom_API_REST.controller;

import com.shalom.ec.shalom_API_REST.model.entity.maquinaria;
import com.shalom.ec.shalom_API_REST.service.Imaquinaria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class maquinariaController {
    @Autowired
private Imaquinaria clienteService;
    @PostMapping("maquinaria")
    public maquinaria create(@RequestBody maquinaria maquinaria){

       return clienteService.save(maquinaria);
    }
    @PutMapping("maquinaria")
    public maquinaria update(@RequestBody maquinaria maquinaria){

        return clienteService.save(maquinaria);
    }
    @DeleteMapping("maquinaria/{id}")
    public void delete(@PathVariable Integer id) {
       maquinaria maquinariaEliminar= clienteService.findById(id);
        clienteService.delete(maquinariaEliminar);
    }
    @GetMapping("maquinaria/{id}")
    public maquinaria showById(@PathVariable Integer id){

       return clienteService.findById(id);

    }
}
