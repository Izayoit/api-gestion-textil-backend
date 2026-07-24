package com.shalom.ec.shalom_API_REST.service;

import com.shalom.ec.shalom_API_REST.model.entity.asignacionProdVent;

public interface IasignacionProdVent {
    asignacionProdVent save(asignacionProdVent asignacionProdVent);
    asignacionProdVent findById(Integer id);
    void delete(asignacionProdVent asignacionProdVent);

}
