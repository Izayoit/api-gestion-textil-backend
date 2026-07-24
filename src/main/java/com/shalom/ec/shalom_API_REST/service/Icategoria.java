package com.shalom.ec.shalom_API_REST.service;

import com.shalom.ec.shalom_API_REST.model.entity.categoria;

public interface Icategoria  {
    categoria save(categoria categoria);
    categoria findById(Integer id);
    void delete(categoria categoria);
}
