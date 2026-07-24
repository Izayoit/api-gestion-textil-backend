package com.shalom.ec.shalom_API_REST.service;

import com.shalom.ec.shalom_API_REST.model.entity.productoBase;

public interface IproductoBase {
    productoBase save(productoBase productoBase);
    productoBase findById(Integer id);
    void delete(productoBase productoBase);
}
