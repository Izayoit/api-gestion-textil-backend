package com.shalom.ec.shalom_API_REST.service.impl;

import com.shalom.ec.shalom_API_REST.model.dao.catalogoDisenoDAO;
import com.shalom.ec.shalom_API_REST.model.entity.catalogoDiseno;
import com.shalom.ec.shalom_API_REST.service.IcatalogoDiseno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class catalogoDisenoImpl implements IcatalogoDiseno {
    @Autowired
    private catalogoDisenoDAO catalogoDisenoDAO;
    @Transactional
    @Override
    public catalogoDiseno save(catalogoDiseno maquinaria) {
        return catalogoDisenoDAO.save(maquinaria);
    }
    @Transactional(readOnly = true)
    @Override
    public catalogoDiseno findById(Integer id) {
        return catalogoDisenoDAO.findById(id).orElse(null);
    }
    @Transactional
    @Override
    public void delete(catalogoDiseno maquinaria) {
        catalogoDisenoDAO.delete(maquinaria);
    }
}
