package com.shalom.ec.shalom_API_REST.service.impl;

import com.shalom.ec.shalom_API_REST.model.dao.usuarioDAO;
import com.shalom.ec.shalom_API_REST.model.entity.usuario;
import com.shalom.ec.shalom_API_REST.service.Iusuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class usuarioImpl implements Iusuario {
    @Autowired
    private usuarioDAO usuarioDAO;
    @Transactional
    @Override
    public usuario save(usuario maquinaria) {
        return usuarioDAO.save(maquinaria);
    }
    @Transactional(readOnly = true)
    @Override
    public usuario findById(Integer id) {
        return usuarioDAO.findById(id).orElse(null);
    }
    @Transactional
    @Override
    public void delete(usuario maquinaria) {
        usuarioDAO.delete(maquinaria);
    }
}
