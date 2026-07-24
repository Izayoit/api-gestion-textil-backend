package com.shalom.ec.shalom_API_REST.service;

import com.shalom.ec.shalom_API_REST.model.entity.sucursal;

public interface Isucursal {
    sucursal save(sucursal sucursal);
    sucursal findById(Integer id);
    void delete(sucursal sucursal);
}
