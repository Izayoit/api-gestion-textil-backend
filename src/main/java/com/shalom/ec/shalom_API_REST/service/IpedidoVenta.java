package com.shalom.ec.shalom_API_REST.service;

import com.shalom.ec.shalom_API_REST.model.entity.pedidoVenta;

public interface IpedidoVenta {
    pedidoVenta save(pedidoVenta pedidoVenta);
    pedidoVenta findById(Integer id);
    void delete(pedidoVenta pedidoVenta);
}
