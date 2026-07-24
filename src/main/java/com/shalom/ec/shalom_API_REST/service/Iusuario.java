package com.shalom.ec.shalom_API_REST.service;

import com.shalom.ec.shalom_API_REST.model.entity.usuario;

public interface Iusuario {
    usuario save(usuario usuario);
    usuario findById(Integer id);
    void delete(usuario usuario);
}
