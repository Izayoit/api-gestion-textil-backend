package com.shalom.ec.shalom_API_REST.controller;

import com.shalom.ec.shalom_API_REST.model.entity.consumoInsumo;
import com.shalom.ec.shalom_API_REST.service.IconsumoInsumo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class consumoInsumoController {
    @Autowired
    private IconsumoInsumo clienteService;
    @PostMapping("consumoInsumo")
    public consumoInsumo create(@RequestBody consumoInsumo consumoInsumo){

        return clienteService.save(consumoInsumo);
    }
    @PutMapping("consumoInsumo")
    public consumoInsumo update(@RequestBody consumoInsumo consumoInsumo){

        return clienteService.save(consumoInsumo);
    }
    @DeleteMapping("consumoInsumo/{id}")
    public void delete(@PathVariable Integer id) {
        consumoInsumo consumoInsumoEliminar= clienteService.findById(id);
        clienteService.delete(consumoInsumoEliminar);
    }
    @GetMapping("consumoInsumo/{id}")
    public consumoInsumo showById(@PathVariable Integer id){

        return clienteService.findById(id);

    }
    
}
