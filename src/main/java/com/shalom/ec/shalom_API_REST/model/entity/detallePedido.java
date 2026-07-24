package com.shalom.ec.shalom_API_REST.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="TB_DETALLE_PEDIDO")
public class detallePedido {
    @Id
    @Column(name="ID_DET_PED")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id_detallePedido;

    @Column(name="CANT_DET_PED")
    private Integer cantidaDetPedido;

    @Column(name="SUBT_DET_PED")
    private BigDecimal subttotalDetPedido;

    @Column(name="TALL_DET_PED")
    private String tallaDetPedido;


    @ManyToOne
    @JoinColumn(name="ID_PED")
    private pedidoVenta pedidoVenta;

    @ManyToOne
    @JoinColumn(name="ID_PRO")
    private productoBase productoBase;

    @ManyToOne
    @JoinColumn(name="ID_CAT_DIS")
    private catalogoDiseno catalogoDiseno;


}
