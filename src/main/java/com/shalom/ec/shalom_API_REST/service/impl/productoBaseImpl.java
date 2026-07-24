package com.shalom.ec.shalom_API_REST.service.impl;

import com.shalom.ec.shalom_API_REST.model.dao.productoBaseDAO;
import com.shalom.ec.shalom_API_REST.model.entity.productoBase;
import com.shalom.ec.shalom_API_REST.service.IproductoBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class productoBaseImpl implements IproductoBase {
    @Autowired
    private productoBaseDAO productoBaseDAO;
    @Transactional
    @Override
    public productoBase save(productoBase productoBase) {
        return productoBaseDAO.save(productoBase);
    }
    @Transactional(readOnly = true)
    @Override
    public productoBase findById(Integer id) {
        return productoBaseDAO.findById(id).orElse(null);
    }
    @Transactional
    @Override
    public void delete(productoBase productoBase) {
        productoBaseDAO.delete(productoBase);
    }
}
