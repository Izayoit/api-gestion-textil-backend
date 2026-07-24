package com.shalom.ec.shalom_API_REST.controller;

import com.shalom.ec.shalom_API_REST.model.entity.egreso;
import com.shalom.ec.shalom_API_REST.service.Iegreso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class egresoController {
    @Autowired
    private Iegreso clienteService;
    @PostMapping("egreso")
    public egreso create(@RequestBody egreso egreso){

        return clienteService.save(egreso);
    }
    @PutMapping("egreso")
    public egreso update(@RequestBody egreso egreso){

        return clienteService.save(egreso);
    }
    @DeleteMapping("egreso/{id}")
    public void delete(@PathVariable Integer id) {
        egreso egresoEliminar= clienteService.findById(id);
        clienteService.delete(egresoEliminar);
    }
    @GetMapping("egreso/{id}")
    public egreso showById(@PathVariable Integer id){

        return clienteService.findById(id);

    }
}
