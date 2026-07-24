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
@Table(name="TB_PERSONALIZACION_PRENDA")
public class personalizacionPrenda {
    @Id
    @Column(name="ID_PERS")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_personalizacion;

    @ManyToOne
    @JoinColumn(name="ID_DET_PED")
    private detallePedido detallePedido;

    @Column(name="NOMB_ESTAM")
    private String nombreEstampado;

    @Column(name="NUM_ESTAM")
    private String numeroEstampado;

    @Column(name="TALL_ESP")
    private String talla_especifica;

    @Column(name="ZONA_PRENDA")
    private String zonaPlanchar ;




}
