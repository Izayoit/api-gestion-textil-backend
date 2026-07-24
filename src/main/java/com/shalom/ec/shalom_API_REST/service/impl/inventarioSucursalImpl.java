package com.shalom.ec.shalom_API_REST.service.impl;

import com.shalom.ec.shalom_API_REST.model.dao.inventarioSucursalDAO;
import com.shalom.ec.shalom_API_REST.model.entity.inventarioSucursal;
import com.shalom.ec.shalom_API_REST.service.IinventarioSucursal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class inventarioSucursalImpl implements IinventarioSucursal {
    @Autowired
    private inventarioSucursalDAO inventarioSucursalDAO;
    @Transactional
    @Override
    public inventarioSucursal
 save(inventarioSucursal maquinaria) {
        return inventarioSucursalDAO.save(maquinaria);
    }
    @Transactional(readOnly = true)
    @Override
    public inventarioSucursal findById(Integer id) {
        return inventarioSucursalDAO.findById(id).orElse(null);
    }
    @Transactional
    @Override
    public void delete(inventarioSucursal maquinaria) {
        inventarioSucursalDAO.delete(maquinaria);
    }
}
