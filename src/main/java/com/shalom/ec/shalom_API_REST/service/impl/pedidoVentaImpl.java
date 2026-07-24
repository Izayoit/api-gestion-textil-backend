package com.shalom.ec.shalom_API_REST.service.impl;

import com.shalom.ec.shalom_API_REST.model.dao.pedidoVentaDAO;
import com.shalom.ec.shalom_API_REST.model.entity.pedidoVenta;
import com.shalom.ec.shalom_API_REST.service.IpedidoVenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class pedidoVentaImpl implements IpedidoVenta {
    @Autowired
    private pedidoVentaDAO pedidoVentaDAO;
    @Transactional
    @Override
    public pedidoVenta save(pedidoVenta pedidoVenta) {
        return pedidoVentaDAO.save(pedidoVenta);
    }
    @Transactional(readOnly = true)
    @Override
    public pedidoVenta findById(Integer id) {
        return pedidoVentaDAO.findById(id).orElse(null);
    }
    @Transactional
    @Override
    public void delete(pedidoVenta pedidoVenta) {
        pedidoVentaDAO.delete(pedidoVenta);
    }
}
