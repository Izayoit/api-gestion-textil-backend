package com.shalom.ec.shalom_API_REST.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;


import java.time.LocalDateTime;



@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="TB_PEDIDO_VENTA")
public class pedidoVenta {
    @Id
    @Column(name="ID_PED")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_pedido;

    @Column(name="FECH_PED")
    private String fechaPedido;

    @Column(name="TOTA_PED")
    private BigDecimal totalPedido;

    @ManyToOne
    @JoinColumn(name="ID_CLI")
    private cliente cliente;

    @ManyToOne
    @JoinColumn(name="ID_COL")
    private colaborador colaborador;


}
