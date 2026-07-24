package com.shalom.ec.shalom_API_REST.controller;

import com.shalom.ec.shalom_API_REST.model.entity.personalizacionPrenda;
import com.shalom.ec.shalom_API_REST.service.IpersonalizacionPrenda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/v1")
public class personalizacionPrendaController {
    @Autowired
    private IpersonalizacionPrenda clienteService;
    @PostMapping("personalizacionPrenda")
    public personalizacionPrenda create(@RequestBody personalizacionPrenda personalizacionPrenda){

        return clienteService.save(personalizacionPrenda);
    }
    @PutMapping("personalizacionPrenda")
    public personalizacionPrenda update(@RequestBody personalizacionPrenda personalizacionPrenda){

        return clienteService.save(personalizacionPrenda);
    }
    @DeleteMapping("personalizacionPrenda/{id}")
    public void delete(@PathVariable Integer id) {
        personalizacionPrenda personalizacionPrendaEliminar= clienteService.findById(id);
        clienteService.delete(personalizacionPrendaEliminar);
    }
    @GetMapping("personalizacionPrenda/{id}")
    public personalizacionPrenda showById(@PathVariable Integer id){

        return clienteService.findById(id);

    }
}
