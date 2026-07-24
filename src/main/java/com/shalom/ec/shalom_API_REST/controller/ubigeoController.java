package com.shalom.ec.shalom_API_REST.controller;


import com.shalom.ec.shalom_API_REST.model.entity.ubigeo;
import com.shalom.ec.shalom_API_REST.service.Iubigeo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ubigeoController {
    @Autowired
    private Iubigeo clienteService;
    @PostMapping("ubigeo")
    public ubigeo create(@RequestBody ubigeo ubigeo){

        return clienteService.save(ubigeo);
    }
    @PutMapping("ubigeo")
    public ubigeo update(@RequestBody ubigeo ubigeo){

        return clienteService.save(ubigeo);
    }
    @DeleteMapping("ubigeo/{id}")
    public void delete(@PathVariable Integer id) {
        ubigeo ubigeoEliminar= clienteService.findById(id);
        clienteService.delete(ubigeoEliminar);
    }
    @GetMapping("ubigeo/{id}")
    public ubigeo showById(@PathVariable Integer id){

        return clienteService.findById(id);

    }
}
