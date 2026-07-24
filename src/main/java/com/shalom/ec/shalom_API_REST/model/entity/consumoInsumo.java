package com.shalom.ec.shalom_API_REST.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="TB_CONSUMO_INSUMO")
public class consumoInsumo {

    @Id
    @Column(name="ID_CONS")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id_consumoInsumo;



    @ManyToOne
    @JoinColumn(name="ID_DET_PED")
    private detallePedido detallePedido;

    @ManyToOne
    @JoinColumn(name="ID_INS")
    private insumo insumo;

    @Column(name="CANT_CONS")
    private BigDecimal cantidadConsumo;
}
