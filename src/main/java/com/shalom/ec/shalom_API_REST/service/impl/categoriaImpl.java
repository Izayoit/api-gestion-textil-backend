package com.shalom.ec.shalom_API_REST.service.impl;

import com.shalom.ec.shalom_API_REST.model.dao.categoriaDAO;
import com.shalom.ec.shalom_API_REST.model.entity.categoria;
import com.shalom.ec.shalom_API_REST.service.Icategoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class categoriaImpl implements Icategoria {
    @Autowired
    private categoriaDAO categoriaDAO;
    @Transactional
    @Override
    public categoria save(categoria maquinaria) {
        return categoriaDAO.save(maquinaria);
    }
    @Transactional(readOnly = true)
    @Override
    public categoria findById(Integer id) {
        return categoriaDAO.findById(id).orElse(null);
    }
    @Transactional
    @Override
    public void delete(categoria maquinaria) {
        categoriaDAO.delete(maquinaria);
    }
}
