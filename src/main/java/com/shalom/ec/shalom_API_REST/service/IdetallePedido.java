package com.shalom.ec.shalom_API_REST.service;

import com.shalom.ec.shalom_API_REST.model.entity.detallePedido;

public interface IdetallePedido {
    detallePedido save(detallePedido detallePedido);
    detallePedido findById(Integer id);
    void delete(detallePedido detallePedido);
}
