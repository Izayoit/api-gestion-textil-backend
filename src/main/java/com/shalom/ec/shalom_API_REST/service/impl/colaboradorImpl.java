package com.shalom.ec.shalom_API_REST.service.impl;

import com.shalom.ec.shalom_API_REST.model.dao.colaboradorDAO;
import com.shalom.ec.shalom_API_REST.model.entity.colaborador;
import com.shalom.ec.shalom_API_REST.service.Icolaborador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class colaboradorImpl implements Icolaborador {
    @Autowired
    private colaboradorDAO colaboradorDAO;
    @Transactional
    @Override
    public colaborador save(colaborador maquinaria) {
        return colaboradorDAO.save(maquinaria);
    }
    @Transactional(readOnly = true)
    @Override
    public colaborador findById(Integer id) {
        return colaboradorDAO.findById(id).orElse(null);
    }
    @Transactional
    @Override
    public void delete(colaborador maquinaria) {
        colaboradorDAO.delete(maquinaria);
    }
}
