package com.shalom.ec.shalom_API_REST.service;

import com.shalom.ec.shalom_API_REST.model.entity.procesoDiseno;

public interface IprocesoDiseno {
    procesoDiseno save(procesoDiseno procesoDiseno);
    procesoDiseno findById(Integer id);
    void delete(procesoDiseno procesoDiseno);
}
