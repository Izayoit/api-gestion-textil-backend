package com.shalom.ec.shalom_API_REST.service;

import com.shalom.ec.shalom_API_REST.model.entity.inventarioSucursal;

public interface IinventarioSucursal {
    inventarioSucursal save(inventarioSucursal inventarioSucursal);
    inventarioSucursal findById(Integer id);
    void delete(inventarioSucursal inventarioSucursal);
}
