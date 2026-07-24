package com.shalom.ec.shalom_API_REST.service;


import com.shalom.ec.shalom_API_REST.model.entity.ubigeo;

public interface Iubigeo {
    ubigeo save( ubigeo  ubigeo);
    ubigeo findById(Integer id);
    void delete(ubigeo ubigeo);
}
