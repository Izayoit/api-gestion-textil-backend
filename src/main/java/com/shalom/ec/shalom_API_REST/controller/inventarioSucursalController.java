package com.shalom.ec.shalom_API_REST.controller;

import com.shalom.ec.shalom_API_REST.model.entity.inventarioSucursal;
import com.shalom.ec.shalom_API_REST.service.IinventarioSucursal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class inventarioSucursalController {
    @Autowired
    private IinventarioSucursal clienteService;
    @PostMapping("inventarioSucursal")
    public inventarioSucursal create(@RequestBody inventarioSucursal inventarioSucursal){

        return clienteService.save(inventarioSucursal);
    }
    @PutMapping("inventarioSucursal")
    public inventarioSucursal update(@RequestBody inventarioSucursal inventarioSucursal){

        return clienteService.save(inventarioSucursal);
    }
    @DeleteMapping("inventarioSucursal/{id}")
    public void delete(@PathVariable Integer id) {
        inventarioSucursal inventarioSucursalEliminar= clienteService.findById(id);
        clienteService.delete(inventarioSucursalEliminar);
    }
    @GetMapping("inventarioSucursal/{id}")
    public inventarioSucursal showById(@PathVariable Integer id){

        return clienteService.findById(id);

    }
}
