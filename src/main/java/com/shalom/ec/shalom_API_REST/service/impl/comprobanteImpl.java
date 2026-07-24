package com.shalom.ec.shalom_API_REST.service.impl;

import com.shalom.ec.shalom_API_REST.model.dao.comprobanteDAO;
import com.shalom.ec.shalom_API_REST.model.entity.comprobante;
import com.shalom.ec.shalom_API_REST.service.Icomprobante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class comprobanteImpl implements Icomprobante {
    @Autowired
    private comprobanteDAO comprobanteDAO;
    @Transactional
    @Override
    public comprobante save(comprobante comprobante) {

        // obtenemos el monto total que enviaste desde Postman
        BigDecimal montoTotal = comprobante.getMontoComprobante(); // <-- Usa el nombre exacto de tu getter

        if (montoTotal != null) {
            // calculamos la Base imponible (Monto / 1.18)
            // decimos a Java que use 2 decimales y redondee el último dígito (HALF_UP)
            BigDecimal divisor = new BigDecimal("1.18");
            BigDecimal baseImponible = montoTotal.divide(divisor, 2, RoundingMode.HALF_UP);

            // calculamos el IGV (Monto Total - Base Imponible)
            BigDecimal igvCalculado = montoTotal.subtract(baseImponible);

            // asignamos el IGV calculado al objeto comprobante
            comprobante.setIgv_comprobante(igvCalculado); // <-- usa el nombre exacto de tu setter
        }

        // ahora sí, guardamos en la base de datos con el IGV perfecto
        return comprobanteDAO.save(comprobante);
    }
    @Transactional(readOnly = true)
    @Override
    public comprobante findById(Integer id) {
        return comprobanteDAO.findById(id).orElse(null);
    }
    @Transactional
    @Override
    public void delete(comprobante comprobante) {
        comprobanteDAO.delete(comprobante);
    }
}
