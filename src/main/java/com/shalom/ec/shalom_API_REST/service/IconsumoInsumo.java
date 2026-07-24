package com.shalom.ec.shalom_API_REST.service;

import com.shalom.ec.shalom_API_REST.model.entity.consumoInsumo;

public interface IconsumoInsumo {
    consumoInsumo save(consumoInsumo consumoInsumo);
    consumoInsumo findById(Integer id);
    void delete(consumoInsumo consumoInsumo);
}
