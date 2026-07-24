package com.shalom.ec.shalom_API_REST.controller;

import com.shalom.ec.shalom_API_REST.model.entity.insumo;
import com.shalom.ec.shalom_API_REST.service.Iinsumo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/v1")
public class insumoController {
    @Autowired
    private Iinsumo clienteService;
    @PostMapping("insumo")
    public insumo create(@RequestBody insumo insumo){

        return clienteService.save(insumo);
    }
    @PutMapping("insumo")
    public insumo update(@RequestBody insumo insumo){

        return clienteService.save(insumo);
    }
    @DeleteMapping("insumo/{id}")
    public void delete(@PathVariable Integer id) {
        insumo insumoEliminar= clienteService.findById(id);
        clienteService.delete(insumoEliminar);
    }
    @GetMapping("insumo/{id}")
    public insumo showById(@PathVariable Integer id){

        return clienteService.findById(id);

    }
}
