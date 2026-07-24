package com.shalom.ec.shalom_API_REST.service.impl;

import com.shalom.ec.shalom_API_REST.model.dao.personalizacionPrendaDAO;
import com.shalom.ec.shalom_API_REST.model.entity.personalizacionPrenda;
import com.shalom.ec.shalom_API_REST.service.IpersonalizacionPrenda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class personalizacionPrendaImpl implements IpersonalizacionPrenda {
    @Autowired
    private personalizacionPrendaDAO personalizacionPrendaDAO;
    @Transactional
    @Override
    public personalizacionPrenda save(personalizacionPrenda personalizacionPrenda) {
        return personalizacionPrendaDAO.save(personalizacionPrenda);
    }
    @Transactional(readOnly = true)
    @Override
    public personalizacionPrenda findById(Integer id) {
        return personalizacionPrendaDAO.findById(id).orElse(null);
    }
    @Transactional
    @Override
    public void delete(personalizacionPrenda personalizacionPrenda) {
        personalizacionPrendaDAO.delete(personalizacionPrenda);
    }
    
}
