package com.shalom.ec.shalom_API_REST.controller;

import com.shalom.ec.shalom_API_REST.model.entity.catalogoDiseno;
import com.shalom.ec.shalom_API_REST.service.IcatalogoDiseno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")

public class catalogoDisenoController {
    @Autowired
    private IcatalogoDiseno clienteService;
    @PostMapping("catalogoDiseno")
    public catalogoDiseno create(@RequestBody catalogoDiseno catalogoDiseno){

        return clienteService.save(catalogoDiseno);
    }
    @PutMapping("catalogoDiseno")
    public catalogoDiseno update(@RequestBody catalogoDiseno catalogoDiseno){

        return clienteService.save(catalogoDiseno);
    }
    @DeleteMapping("catalogoDiseno/{id}")
    public void delete(@PathVariable Integer id) {
        catalogoDiseno catalogoDisenoEliminar= clienteService.findById(id);
        clienteService.delete(catalogoDisenoEliminar);
    }
    @GetMapping("catalogoDiseno/{id}")
    public catalogoDiseno showById(@PathVariable Integer id){

        return clienteService.findById(id);

    }
}
