package com.shalom.ec.shalom_API_REST.service;

import com.shalom.ec.shalom_API_REST.model.entity.cliente;

public interface Icliente {
    cliente save(cliente cliente);
    cliente findById(Integer id);
    void delete(cliente cliente);
}
