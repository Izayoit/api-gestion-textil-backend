package com.shalom.ec.shalom_API_REST.controller;

import com.shalom.ec.shalom_API_REST.model.entity.pedidoVenta;
import com.shalom.ec.shalom_API_REST.service.IpedidoVenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class pedidoVentaController {
    @Autowired
    private IpedidoVenta clienteService;
    @PostMapping("pedidoVenta")
    public pedidoVenta create(@RequestBody pedidoVenta pedidoVenta){

        return clienteService.save(pedidoVenta);
    }
    @PutMapping("pedidoVenta")
    public pedidoVenta update(@RequestBody pedidoVenta pedidoVenta){

        return clienteService.save(pedidoVenta);
    }
    @DeleteMapping("pedidoVenta/{id}")
    public void delete(@PathVariable Integer id) {
        pedidoVenta pedidoVentaEliminar= clienteService.findById(id);
        clienteService.delete(pedidoVentaEliminar);
    }
    @GetMapping("pedidoVenta/{id}")
    public pedidoVenta showById(@PathVariable Integer id){

        return clienteService.findById(id);

    }
}
