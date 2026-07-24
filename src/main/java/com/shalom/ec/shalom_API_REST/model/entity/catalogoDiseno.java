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
@Table(name="TB_CATALOGO_DISENOS")
public class catalogoDiseno {
    @Id
    @Column(name="ID_CAT_DIS")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id_catalogoDiseno;

    @Column(name="NOMB_CAT_DIS")
    private String nombreCatDiseno;

    @Column(name="PREC_CAT_DIS")
    private BigDecimal precioCatDiseno;

}
