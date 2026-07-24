package com.shalom.ec.shalom_API_REST.model.dao;

import com.shalom.ec.shalom_API_REST.model.entity.usuario;
import org.springframework.data.repository.CrudRepository;

public interface usuarioDAO extends CrudRepository<usuario,Integer> {
}
