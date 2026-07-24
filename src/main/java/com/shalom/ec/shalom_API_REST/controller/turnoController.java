package com.shalom.ec.shalom_API_REST.controller;

import com.shalom.ec.shalom_API_REST.model.entity.turno;
import com.shalom.ec.shalom_API_REST.service.Iturno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class turnoController {
    @Autowired
    private Iturno clienteService;
    @PostMapping("turno")
    public turno create(@RequestBody turno turno){

        return clienteService.save(turno);
    }
    @PutMapping("turno")
    public turno update(@RequestBody turno turno){

        return clienteService.save(turno);
    }
    @DeleteMapping("turno/{id}")
    public void delete(@PathVariable Integer id) {
        turno turnoEliminar= clienteService.findById(id);
        clienteService.delete(turnoEliminar);
    }
    @GetMapping("turno/{id}")
    public turno showById(@PathVariable Integer id){

        return clienteService.findById(id);

    }
}
