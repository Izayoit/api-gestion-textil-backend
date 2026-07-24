package com.shalom.ec.shalom_API_REST.service.impl;

import com.shalom.ec.shalom_API_REST.model.dao.maquinariaDAO;
import com.shalom.ec.shalom_API_REST.model.entity.maquinaria;
import com.shalom.ec.shalom_API_REST.service.Imaquinaria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class maquinariaimpl implements Imaquinaria {
    @Autowired
    private maquinariaDAO maquinariaDAO;
    @Transactional
    @Override
    public maquinaria save(maquinaria maquinaria) {
        return maquinariaDAO.save(maquinaria);
    }
    @Transactional(readOnly = true)
    @Override
    public maquinaria findById(Integer id) {
        return maquinariaDAO.findById(id).orElse(null);
    }
    @Transactional
    @Override
    public void delete(maquinaria maquinaria) {
        maquinariaDAO.delete(maquinaria);
    }
}
