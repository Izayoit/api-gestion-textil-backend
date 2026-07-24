package com.shalom.ec.shalom_API_REST.controller;

import com.shalom.ec.shalom_API_REST.model.entity.asignacionProdVent;
import com.shalom.ec.shalom_API_REST.service.IasignacionProdVent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class asignacionProdVentController {
    @Autowired
    private IasignacionProdVent clienteService;
    @PostMapping("asignacionProdVent")
    public asignacionProdVent create(@RequestBody asignacionProdVent asignacionProdVent){

        return clienteService.save(asignacionProdVent);
    }
    @PutMapping("asignacionProdVent")
    public asignacionProdVent update(@RequestBody asignacionProdVent asignacionProdVent){

        return clienteService.save(asignacionProdVent);
    }
    @DeleteMapping("asignacionProdVent/{id}")
    public void delete(@PathVariable Integer id) {
        asignacionProdVent asignacionProdVentEliminar= clienteService.findById(id);
        clienteService.delete(asignacionProdVentEliminar);
    }
    @GetMapping("asignacionProdVent/{id}")
    public asignacionProdVent showById(@PathVariable Integer id){

        return clienteService.findById(id);

    }
}
