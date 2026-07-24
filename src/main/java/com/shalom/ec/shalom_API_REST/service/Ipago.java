package com.shalom.ec.shalom_API_REST.service;

import com.shalom.ec.shalom_API_REST.model.entity.pago;

public interface Ipago {
    pago save(pago pago);
    pago findById(Integer id);
    void delete(pago pago);
}
