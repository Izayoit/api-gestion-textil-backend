package com.shalom.ec.shalom_API_REST.controller;

import com.shalom.ec.shalom_API_REST.model.entity.colaborador;
import com.shalom.ec.shalom_API_REST.service.Icolaborador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class colaboradorController {
    @Autowired
    private Icolaborador clienteService;
    @PostMapping("colaborador")
    public colaborador create(@RequestBody colaborador colaborador){

        return clienteService.save(colaborador);
    }
    @PutMapping("colaborador")
    public colaborador update(@RequestBody colaborador colaborador){

        return clienteService.save(colaborador);
    }
    @DeleteMapping("colaborador/{id}")
    public void delete(@PathVariable Integer id) {
        colaborador colaboradorEliminar= clienteService.findById(id);
        clienteService.delete(colaboradorEliminar);
    }
    @GetMapping("colaborador/{id}")
    public colaborador showById(@PathVariable Integer id){

        return clienteService.findById(id);

    }
}
