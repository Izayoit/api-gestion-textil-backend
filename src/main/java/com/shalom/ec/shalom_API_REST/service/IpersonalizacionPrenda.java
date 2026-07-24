package com.shalom.ec.shalom_API_REST.service;

import com.shalom.ec.shalom_API_REST.model.entity.personalizacionPrenda;

public interface IpersonalizacionPrenda {
    personalizacionPrenda save(personalizacionPrenda personalizacionPrenda);
    personalizacionPrenda findById(Integer id);
    void delete(personalizacionPrenda personalizacionPrenda);
}
