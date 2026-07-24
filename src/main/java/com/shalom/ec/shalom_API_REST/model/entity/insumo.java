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
@Table(name="TB_INSUMO")
public class insumo {
    @Id
    @Column(name="ID_INS")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_insumo;
    @Column(name="NOMB_INS")
    private String nombreInsumo;
    @Column(name="STOCK_INS")
    private BigDecimal stockInsumo;
    @Column(name="LIM_MIN_INS")
    private BigDecimal limiteMinInsumo;
    @Column(name="UNID_MED_INS")
    private String unidadMedidaInsumo;

}
