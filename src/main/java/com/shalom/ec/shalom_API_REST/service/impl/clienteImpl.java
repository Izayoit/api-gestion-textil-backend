package com.shalom.ec.shalom_API_REST.service.impl;

import com.shalom.ec.shalom_API_REST.model.dao.clienteDAO;
import com.shalom.ec.shalom_API_REST.model.entity.cliente;
import com.shalom.ec.shalom_API_REST.service.Icliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class clienteImpl implements Icliente {
    @Autowired
    private clienteDAO clienteDAO;
    @Transactional
    @Override
    public cliente save(cliente cliente) {
        return clienteDAO.save(cliente);
    }
    @Transactional(readOnly = true)
    @Override
    public cliente findById(Integer id) {
        return clienteDAO.findById(id).orElse(null);
    }
    @Transactional
    @Override
    public void delete(cliente cliente) {
        clienteDAO.delete(cliente);
    }
}
