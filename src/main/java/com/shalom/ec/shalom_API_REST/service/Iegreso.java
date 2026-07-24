package com.shalom.ec.shalom_API_REST.service;

import com.shalom.ec.shalom_API_REST.model.entity.egreso;

public interface Iegreso {
    egreso save(egreso egreso);
    egreso findById(Integer id);
    void delete(egreso egreso);
}
