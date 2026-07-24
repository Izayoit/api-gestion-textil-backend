package com.shalom.ec.shalom_API_REST.controller;

import com.shalom.ec.shalom_API_REST.model.entity.usuario;
import com.shalom.ec.shalom_API_REST.service.Iusuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/v1")
public class usuarioController {
    @Autowired
    private Iusuario clienteService;
    @PostMapping("usuario")
    public usuario create(@RequestBody usuario usuario){

        return clienteService.save(usuario);
    }
    @PutMapping("usuario")
    public usuario update(@RequestBody usuario usuario){

        return clienteService.save(usuario);
    }
    @DeleteMapping("usuario/{id}")
    public void delete(@PathVariable Integer id) {
        usuario usuarioEliminar= clienteService.findById(id);
        clienteService.delete(usuarioEliminar);
    }
    @GetMapping("usuario/{id}")
    public usuario showById(@PathVariable Integer id){

        return clienteService.findById(id);

    }
}
