package com.shalom.ec.shalom_API_REST.service;

import com.shalom.ec.shalom_API_REST.model.entity.maquinaria;

public interface Imaquinaria {
    maquinaria save(maquinaria maquinaria);
    maquinaria findById(Integer id);
    void delete(maquinaria maquinaria);
}
