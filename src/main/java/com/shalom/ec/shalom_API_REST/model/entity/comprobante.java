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
@Table(name="TB_COMPROBANTE")
public class comprobante {
    @Id
    @Column(name="ID_COM")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_comprobante;

    @Column(name="TIPO_COMPROBANTE")
    private String tipoComprobante;

    @Column(name="FECH_COM")
    private String fechaComprobante;

    @Column(name="MONT_COM")
    private BigDecimal montoComprobante;

    @Column(name="IGV_COM")
    private BigDecimal igv_comprobante;

    @Column(name="ESTA_COM")
    private String estadoComprobante;

    @ManyToOne
    @JoinColumn(name="ID_PED")
    private pedidoVenta pedidoVenta;

    @Column(name="DNI_BOL")
    private String dniBoleta ;

    @Column(name="NOMB_BOL")
    private String nombreBoleta;

    @Column(name="RUC_FAC")
    private String rucFactura;

    @Column(name="RAZO_FAC")
    private String razoFactura;


}
