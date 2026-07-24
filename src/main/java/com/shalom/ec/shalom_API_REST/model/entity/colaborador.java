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
@Table(name="TB_COLABORADOR")
public class colaborador {
    @Id
    @Column(name="ID_COL")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_colaborador;

    @Column(name="TIPO_ROL")
    private String tipoRol;

    @Column(name="NOMB_COL")
    private String nombreColaborador;

    @Column(name="DNI_COL")
    private String dniColaborador;

    @ManyToOne
    @JoinColumn(name="ID_SUCURSAL")
    private sucursal sucursal;

    @ManyToOne
    @JoinColumn(name="ID_TUR")
    private turno turno;

    @Column(name="COMI_COL_VEN")
    private BigDecimal comisionColVendedor;

    @Column(name="CERT_COL_DIS")
    private String certificadoColDiseñador;

    @Column(name="EXPE_COL_DIS")
    private String experienciaColDiseñador;

    @Column(name="SOFT_COL_SUB")
    private String softwareColDiseñador;

    @Column(name="ENLA_COL_SUB")
    private String enlanceColSublimador;


}
