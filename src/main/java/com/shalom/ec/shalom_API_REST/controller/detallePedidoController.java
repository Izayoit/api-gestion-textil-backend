package com.shalom.ec.shalom_API_REST.controller;

import com.shalom.ec.shalom_API_REST.model.entity.detallePedido;
import com.shalom.ec.shalom_API_REST.service.IdetallePedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class detallePedidoController {
    @Autowired
    private IdetallePedido clienteService;
    @PostMapping("detallePedido")
    public detallePedido create(@RequestBody detallePedido detallePedido){

        return clienteService.save(detallePedido);
    }
    @PutMapping("detallePedido")
    public detallePedido update(@RequestBody detallePedido detallePedido){

        return clienteService.save(detallePedido);
    }
    @DeleteMapping("detallePedido/{id}")
    public void delete(@PathVariable Integer id) {
        detallePedido detallePedidoEliminar= clienteService.findById(id);
        clienteService.delete(detallePedidoEliminar);
    }
    @GetMapping("detallePedido/{id}")
    public detallePedido showById(@PathVariable Integer id){

        return clienteService.findById(id);

    }
}
