package com.shalom.ec.shalom_API_REST.service.impl;

import com.shalom.ec.shalom_API_REST.model.dao.procesoDisenoDAO;
import com.shalom.ec.shalom_API_REST.model.entity.procesoDiseno;
import com.shalom.ec.shalom_API_REST.service.IprocesoDiseno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class procesoDisenoImpl implements IprocesoDiseno {
    @Autowired
    private procesoDisenoDAO procesoDisenoDAO;
    @Transactional
    @Override
    public procesoDiseno save(procesoDiseno procesoDiseno) {
        return procesoDisenoDAO.save(procesoDiseno);
    }
    @Transactional(readOnly = true)
    @Override
    public procesoDiseno findById(Integer id) {
        return procesoDisenoDAO.findById(id).orElse(null);
    }
    @Transactional
    @Override
    public void delete(procesoDiseno procesoDiseno) {
        procesoDisenoDAO.delete(procesoDiseno);
    }
}
