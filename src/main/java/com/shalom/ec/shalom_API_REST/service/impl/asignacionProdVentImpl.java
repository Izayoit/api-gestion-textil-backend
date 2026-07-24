package com.shalom.ec.shalom_API_REST.service.impl;

import com.shalom.ec.shalom_API_REST.model.dao.asignacionProdVentDAO;
import com.shalom.ec.shalom_API_REST.model.entity.asignacionProdVent;
import com.shalom.ec.shalom_API_REST.service.IasignacionProdVent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class asignacionProdVentImpl implements IasignacionProdVent {
    
    @Autowired
    private asignacionProdVentDAO asignacionProdVentDAO;
    @Transactional
    @Override
    public asignacionProdVent save(asignacionProdVent asignacionProdVent) {
        return asignacionProdVentDAO.save(asignacionProdVent);
    }
    @Transactional(readOnly = true)
    @Override
    public asignacionProdVent findById(Integer id) {
        return asignacionProdVentDAO.findById(id).orElse(null);
    }
    @Transactional
    @Override
    public void delete(asignacionProdVent asignacionProdVent) {
        asignacionProdVentDAO.delete(asignacionProdVent);
    }
    
    
}
