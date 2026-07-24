package com.shalom.ec.shalom_API_REST.service;

import com.shalom.ec.shalom_API_REST.model.entity.insumo;

public interface Iinsumo {
    insumo save(insumo insumo);
    insumo findById(Integer id);
    void delete(insumo insumo);
}
