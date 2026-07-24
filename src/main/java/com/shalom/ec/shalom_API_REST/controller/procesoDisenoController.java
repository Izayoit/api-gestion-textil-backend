package com.shalom.ec.shalom_API_REST.controller;

import com.shalom.ec.shalom_API_REST.model.entity.procesoDiseno;
import com.shalom.ec.shalom_API_REST.service.IprocesoDiseno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class procesoDisenoController {
    @Autowired
    private IprocesoDiseno clienteService;
    @PostMapping("procesoDiseno")
    public procesoDiseno create(@RequestBody procesoDiseno procesoDiseno){

        return clienteService.save(procesoDiseno);
    }
    @PutMapping("procesoDiseno")
    public procesoDiseno update(@RequestBody procesoDiseno procesoDiseno){

        return clienteService.save(procesoDiseno);
    }
    @DeleteMapping("procesoDiseno/{id}")
    public void delete(@PathVariable Integer id) {
        procesoDiseno procesoDisenoEliminar= clienteService.findById(id);
        clienteService.delete(procesoDisenoEliminar);
    }
    @GetMapping("procesoDiseno/{id}")
    public procesoDiseno showById(@PathVariable Integer id){

        return clienteService.findById(id);

    }
}
