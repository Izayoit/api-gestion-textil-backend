package com.shalom.ec.shalom_API_REST.service;

import com.shalom.ec.shalom_API_REST.model.entity.catalogoDiseno;

public interface IcatalogoDiseno {
    catalogoDiseno save(catalogoDiseno catalogoDiseno);
    catalogoDiseno findById(Integer id);
    void delete(catalogoDiseno catalogoDiseno);
}
