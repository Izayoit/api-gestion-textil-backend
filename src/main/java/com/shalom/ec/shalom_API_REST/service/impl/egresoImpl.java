package com.shalom.ec.shalom_API_REST.service.impl;

import com.shalom.ec.shalom_API_REST.model.dao.egresoDAO;
import com.shalom.ec.shalom_API_REST.model.entity.egreso;
import com.shalom.ec.shalom_API_REST.service.Iegreso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class egresoImpl implements Iegreso {

    @Autowired
    private egresoDAO egresoDAO;
    @Transactional
    @Override
    public egreso save(egreso maquinaria) {
        return egresoDAO.save(maquinaria);
    }
    @Transactional(readOnly = true)
    @Override
    public egreso findById(Integer id) {
        return egresoDAO.findById(id).orElse(null);
    }
    @Transactional
    @Override
    public void delete(egreso maquinaria) {
        egresoDAO.delete(maquinaria);
    }
}
