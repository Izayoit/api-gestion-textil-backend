package com.shalom.ec.shalom_API_REST.controller;

import com.shalom.ec.shalom_API_REST.model.entity.comprobante;
import com.shalom.ec.shalom_API_REST.service.Icomprobante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class comprobanteController {
    
    @Autowired
    private Icomprobante clienteService;
    @PostMapping("comprobante")
    public comprobante create(@RequestBody comprobante comprobante){

        return clienteService.save(comprobante);
    }
    @PutMapping("comprobante")
    public comprobante update(@RequestBody comprobante comprobante){

        return clienteService.save(comprobante);
    }
    @DeleteMapping("comprobante/{id}")
    public void delete(@PathVariable Integer id) {
        comprobante comprobanteEliminar= clienteService.findById(id);
        clienteService.delete(comprobanteEliminar);
    }
    @GetMapping("comprobante/{id}")
    public comprobante showById(@PathVariable Integer id){

        return clienteService.findById(id);

    }
}
