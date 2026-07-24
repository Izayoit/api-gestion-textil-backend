package com.shalom.ec.shalom_API_REST.service.impl;

import com.shalom.ec.shalom_API_REST.model.dao.insumoDAO;
import com.shalom.ec.shalom_API_REST.model.entity.insumo;
import com.shalom.ec.shalom_API_REST.service.Iinsumo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class insumoImpl implements Iinsumo {
    @Autowired
    private insumoDAO insumoDAO;
    @Transactional
    @Override
    public insumo save(insumo maquinaria) {
        return insumoDAO.save(maquinaria);
    }
    @Transactional(readOnly = true)
    @Override
    public insumo findById(Integer id) {
        return insumoDAO.findById(id).orElse(null);
    }
    @Transactional
    @Override
    public void delete(insumo maquinaria) {
        insumoDAO.delete(maquinaria);
    }
}
