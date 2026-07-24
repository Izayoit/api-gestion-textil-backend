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
@Table(name="TB_PAGO")
public class pago {
    @Id
    @Column(name="ID_PAG")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id_pago;

    @Column(name="METODO_PAGO")
    private String metodoPago;

    @Column(name="MONT_PAG")
    private BigDecimal montoPago;

    @Column(name="FECH_PAG")
    private String fechaPago;

    @ManyToOne
    @JoinColumn(name="ID_COM")
    private comprobante comprobante;

    @Column(name="VUEL_PAG_EFE")
    private BigDecimal vueltoPagEfe;

    @Column(name="TIPO_PAG_TAR")
    private String tipoPagTarjeta;

    @Column(name="DIGI_PAG_TAR")
    private String digitalPagTarjeta;

    @Column(name="TIPO_PAG_DIG")
    private String tipoPagDigital;

    @Column(name="CODI_PAG_DIG")
    private String codigoPagDigital;

    @Column(name="NTEL_PAG_DIG")
    private String numeroTelefPagDigital;







}
