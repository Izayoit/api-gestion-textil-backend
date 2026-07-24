package com.shalom.ec.shalom_API_REST.service;

import com.shalom.ec.shalom_API_REST.model.entity.colaborador;

public interface Icolaborador {
    colaborador save(colaborador colaborador);
    colaborador findById(Integer id);
    void delete(colaborador colaborador);
}
