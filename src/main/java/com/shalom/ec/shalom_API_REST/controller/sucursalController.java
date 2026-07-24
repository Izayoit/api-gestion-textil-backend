package com.shalom.ec.shalom_API_REST.controller;

import com.shalom.ec.shalom_API_REST.model.entity.sucursal;
import com.shalom.ec.shalom_API_REST.service.Isucursal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class sucursalController {
    @Autowired
    private Isucursal clienteService;
    @PostMapping("sucursal")
    public sucursal create(@RequestBody sucursal sucursal){

        return clienteService.save(sucursal);
    }
    @PutMapping("sucursal")
    public sucursal update(@RequestBody sucursal sucursal){

        return clienteService.save(sucursal);
    }
    @DeleteMapping("sucursal/{id}")
    public void delete(@PathVariable Integer id) {
        sucursal sucursalEliminar= clienteService.findById(id);
        clienteService.delete(sucursalEliminar);
    }
    @GetMapping("sucursal/{id}")
    public sucursal showById(@PathVariable Integer id){

        return clienteService.findById(id);

    }
    
}
