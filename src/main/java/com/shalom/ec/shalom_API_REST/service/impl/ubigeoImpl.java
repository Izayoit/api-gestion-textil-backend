package com.shalom.ec.shalom_API_REST.service.impl;

import com.shalom.ec.shalom_API_REST.model.dao.ubigeoDAO;
import com.shalom.ec.shalom_API_REST.model.entity.ubigeo;
import com.shalom.ec.shalom_API_REST.service.Iubigeo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ubigeoImpl implements Iubigeo {
    @Autowired
    private ubigeoDAO ubigeoDAO;
    @Transactional
    @Override
    public ubigeo save(ubigeo ubigeo) {
        return ubigeoDAO.save(ubigeo) ;
    }
    @Transactional(readOnly = true)
    @Override
    public ubigeo findById(Integer id) {
        return ubigeoDAO.findById(id).orElse(null) ;
    }
    @Transactional
    @Override
    public void delete(ubigeo ubigeo) {
        ubigeoDAO.delete(ubigeo);

    }
}
