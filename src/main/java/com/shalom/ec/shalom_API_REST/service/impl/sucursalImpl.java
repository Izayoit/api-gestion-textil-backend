package com.shalom.ec.shalom_API_REST.service.impl;

import com.shalom.ec.shalom_API_REST.model.dao.sucursalDAO;
import com.shalom.ec.shalom_API_REST.model.entity.sucursal;
import com.shalom.ec.shalom_API_REST.service.Isucursal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class sucursalImpl implements Isucursal {
    @Autowired
    private sucursalDAO sucursalDAO;
    @Transactional
    @Override
    public sucursal save(sucursal maquinaria) {
        return sucursalDAO.save(maquinaria);
    }
    @Transactional(readOnly = true)
    @Override
    public sucursal findById(Integer id) {
        return sucursalDAO.findById(id).orElse(null);
    }
    @Transactional
    @Override
    public void delete(sucursal maquinaria) {
        sucursalDAO.delete(maquinaria);
    }
}
