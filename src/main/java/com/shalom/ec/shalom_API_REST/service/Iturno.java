package com.shalom.ec.shalom_API_REST.service;

import com.shalom.ec.shalom_API_REST.model.entity.turno;

public interface Iturno {
    turno save(turno turno);
    turno findById(Integer id);
    void delete(turno turno);
}
