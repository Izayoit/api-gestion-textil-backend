package com.shalom.ec.shalom_API_REST.service.impl;

import com.shalom.ec.shalom_API_REST.model.dao.consumoInsumoDAO;
import com.shalom.ec.shalom_API_REST.model.entity.consumoInsumo;
import com.shalom.ec.shalom_API_REST.service.IconsumoInsumo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class consumoInsumoImpl implements IconsumoInsumo {
    @Autowired
    private consumoInsumoDAO consumoInsumoDAO;
    @Transactional
    @Override
    public consumoInsumo save(consumoInsumo maquinaria) {
        return consumoInsumoDAO.save(maquinaria);
    }
    @Transactional(readOnly = true)
    @Override
    public consumoInsumo findById(Integer id) {
        return consumoInsumoDAO.findById(id).orElse(null);
    }
    @Transactional
    @Override
    public void delete(consumoInsumo maquinaria) {
        consumoInsumoDAO.delete(maquinaria);
    }
}
