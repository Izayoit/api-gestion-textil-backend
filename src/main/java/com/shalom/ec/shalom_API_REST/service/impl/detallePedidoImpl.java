package com.shalom.ec.shalom_API_REST.service.impl;

import com.shalom.ec.shalom_API_REST.model.dao.*;
import com.shalom.ec.shalom_API_REST.model.entity.*;
import com.shalom.ec.shalom_API_REST.service.IdetallePedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class detallePedidoImpl implements IdetallePedido {

    @Autowired //buscar el detallepedidoDAO que existe y crea uno nuevo
    private detallePedidoDAO detallePedidoDAO;

    // 1. Inyectamos el DAO del producto para poder consultar su precio
    @Autowired
    private productoBaseDAO productoBaseDAO;

    @Autowired
    private catalogoDisenoDAO catalogoDisenoDAO;

    @Autowired
    private pedidoVentaDAO pedidoVentaDAO;

    @Autowired
    private inventarioSucursalDAO inventarioSucursalDAO;



    @Transactional
    @Override
    public detallePedido save(detallePedido detalle) {

        Integer cantidad = detalle.getCantidaDetPedido(); //extrae cantidad pedido
        BigDecimal precioProducto = BigDecimal.ZERO;
        BigDecimal precioDiseno = BigDecimal.ZERO;

        // Búsqueda de precios de producto y diseño
        if (detalle.getProductoBase() != null) {
            Integer idProducto = detalle.getProductoBase().getId_productoBase();
            productoBase productoReal = productoBaseDAO.findById(idProducto).orElse(null);
            if (productoReal != null && productoReal.getPrecioProducto() != null) {
                precioProducto = productoReal.getPrecioProducto();
            }
        }

        if (detalle.getCatalogoDiseno() != null && detalle.getCatalogoDiseno().getId_catalogoDiseno() != null) {
            Integer idDiseno = detalle.getCatalogoDiseno().getId_catalogoDiseno();
            catalogoDiseno disenoReal = catalogoDisenoDAO.findById(idDiseno).orElse(null);
            if (disenoReal != null && disenoReal.getPrecioCatDiseno() != null) {
                precioDiseno = disenoReal.getPrecioCatDiseno();
            }
        }

        BigDecimal precioUnitarioTotal = precioProducto.add(precioDiseno); //suma de ambos atributos
        BigDecimal subtotalCalculado = precioUnitarioTotal.multiply(new BigDecimal(cantidad)); //producto de la suma con la cantidad
        detalle.setSubttotalDetPedido(subtotalCalculado);

        // ====================================================================
        // TB_INVENTARIO_SUCURSAL
        // ====================================================================
        if (detalle.getProductoBase() != null) {
            Integer idProducto = detalle.getProductoBase().getId_productoBase();

            inventarioSucursal inventario = inventarioSucursalDAO.buscarPorIdProducto(idProducto);
            //buscar por id del producto base al inventarioSucursal

            if (inventario != null) {
                Integer stockActual = inventario.getStockInventario(); // <-- Usa tu getter exacto

                // Validación 1: Si el cliente pide más de lo que hay, bloqueamos la transacción
                if (stockActual < cantidad) {
                    throw new RuntimeException("Error: Stock insuficiente. Solo quedan " + stockActual + " unidades disponibles.");
                }

                // Validación 2: Si hay stock, restamos y guardamos la actualización
                Integer nuevoStock = stockActual - cantidad;
                inventario.setStockInventario(nuevoStock); // <-- Usa tu setter exacto
                inventarioSucursalDAO.save(inventario);
            } else {
                // Opcional: Qué pasa si el producto no existe en el inventario aún
                throw new RuntimeException("Error: El producto no tiene un registro de inventario asociado.");
            }
        }
        // ====================================================================

        // Actualizar el total del Pedido Padre (TB_PEDIDO_VENTA)
        if (detalle.getPedidoVenta() != null && detalle.getPedidoVenta().getId_pedido() != null) {
            Integer idPedido = detalle.getPedidoVenta().getId_pedido();
            pedidoVenta pedidoPadre = pedidoVentaDAO.findById(idPedido).orElse(null);

            if (pedidoPadre != null) {
                BigDecimal totalActual = pedidoPadre.getTotalPedido() != null ? pedidoPadre.getTotalPedido() : BigDecimal.ZERO;
                BigDecimal nuevoTotal = totalActual.add(subtotalCalculado);
                pedidoPadre.setTotalPedido(nuevoTotal);
                pedidoVentaDAO.save(pedidoPadre);
            }
        }

        // Finalmente, guardamos el detalle
        return detallePedidoDAO.save(detalle);
    }
    @Transactional(readOnly = true)
    @Override
    public detallePedido findById(Integer id) {
        return detallePedidoDAO.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void delete(detallePedido detalle) {
        detallePedidoDAO.delete(detalle);
    }
}
