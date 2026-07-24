package com.shalom.ec.shalom_API_REST.model.dao;

import com.shalom.ec.shalom_API_REST.model.entity.cliente;
import org.springframework.data.repository.CrudRepository;

public interface clienteDAO extends CrudRepository<cliente,Integer> {
}
