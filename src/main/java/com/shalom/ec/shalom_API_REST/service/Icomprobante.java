package com.shalom.ec.shalom_API_REST.service;

import com.shalom.ec.shalom_API_REST.model.entity.comprobante;

public interface Icomprobante {
    comprobante save(comprobante comprobante);
    comprobante findById(Integer id);
    void delete(comprobante comprobante);
}
