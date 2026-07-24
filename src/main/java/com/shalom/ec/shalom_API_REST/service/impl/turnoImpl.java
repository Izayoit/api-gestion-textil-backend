package com.shalom.ec.shalom_API_REST.service.impl;

import com.shalom.ec.shalom_API_REST.model.dao.turnoDAO;
import com.shalom.ec.shalom_API_REST.model.entity.turno;
import com.shalom.ec.shalom_API_REST.service.Iturno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class turnoImpl implements Iturno {
    @Autowired
    private turnoDAO turnoDAO;
    @Transactional
    @Override
    public turno save(turno turno) {
        return turnoDAO.save(turno);
    }
    @Transactional(readOnly = true)
    @Override
    public turno findById(Integer id) {
        return turnoDAO.findById(id).orElse(null);
    }
    @Transactional
    @Override
    public void delete(turno turno) {
        turnoDAO.delete(turno);
    }
}
