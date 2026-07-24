package com.shalom.ec.shalom_API_REST.controller;

import com.shalom.ec.shalom_API_REST.model.entity.productoBase;
import com.shalom.ec.shalom_API_REST.service.IproductoBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class productoBaseController {

    @Autowired
    private IproductoBase clienteService;
    @PostMapping("productoBase")
    public productoBase create(@RequestBody productoBase productoBase){

        return clienteService.save(productoBase);
    }
    @PutMapping("productoBase")
    public productoBase update(@RequestBody productoBase productoBase){

        return clienteService.save(productoBase);
    }
    @DeleteMapping("productoBase/{id}")
    public void delete(@PathVariable Integer id) {
        productoBase productoBaseEliminar= clienteService.findById(id);
        clienteService.delete(productoBaseEliminar);
    }
    @GetMapping("productoBase/{id}")
    public productoBase showById(@PathVariable Integer id){

        return clienteService.findById(id);

    }
    
}
