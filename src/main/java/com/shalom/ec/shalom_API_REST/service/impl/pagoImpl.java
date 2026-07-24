package com.shalom.ec.shalom_API_REST.service.impl;

import com.shalom.ec.shalom_API_REST.model.dao.comprobanteDAO;
import com.shalom.ec.shalom_API_REST.model.dao.pagoDAO;
import com.shalom.ec.shalom_API_REST.model.entity.comprobante;
import com.shalom.ec.shalom_API_REST.model.entity.pago;
import com.shalom.ec.shalom_API_REST.service.Ipago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class pagoImpl implements Ipago {
    @Autowired
    private pagoDAO pagoDAO;
    @Autowired
    private comprobanteDAO comprobanteDAO;
    @Transactional
    @Override
    public pago save(pago pagoNuevo) {

        // 1. Verificamos que el JSON traiga el ID del comprobante que se está pagando
        if (pagoNuevo.getComprobante() != null && pagoNuevo.getComprobante().getId_comprobante() != null) {

            Integer idComprobante = pagoNuevo.getComprobante().getId_comprobante();
            comprobante comprobanteReal = comprobanteDAO.findById(idComprobante).orElse(null);

            if (comprobanteReal != null) {

                // 2. Lógica del Vuelto (Solo si es Efectivo)
                if ("Efectivo".equalsIgnoreCase(pagoNuevo.getMetodoPago())) {
                    BigDecimal montoEntregado = pagoNuevo.getMontoPago(); // Billete que da el cliente
                    BigDecimal costoReal = comprobanteReal.getMontoComprobante(); // Costo de la boleta

                    if (montoEntregado != null && costoReal != null) {
                        BigDecimal vueltoCalculado = montoEntregado.subtract(costoReal);
                        pagoNuevo.setVueltoPagEfe(vueltoCalculado); // <-- Ajusta a tu setter exacto
                    }
                }

                // =================================================================
                // 3. NUEVO: Actualizar el estado del comprobante
                // =================================================================
                comprobanteReal.setEstadoComprobante("Pagado"); // <-- Ajusta a tu setter de ESTA_COM

                // Guardamos el comprobante actualizado en la base de datos
                comprobanteDAO.save(comprobanteReal);
                // =================================================================
            }
        }

        // 4. Finalmente, guardamos el registro del pago
        return pagoDAO.save(pagoNuevo);
    }
    @Transactional(readOnly = true)
    @Override
    public pago findById(Integer id) {
        return pagoDAO.findById(id).orElse(null);
    }
    @Transactional
    @Override
    public void delete(pago pago) {
        pagoDAO.delete(pago);
    }
}
