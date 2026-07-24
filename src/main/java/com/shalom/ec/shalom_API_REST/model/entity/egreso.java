package com.shalom.ec.shalom_API_REST.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="TB_EGRESO")
public class egreso {
    @Id
    @Column(name="ID_EGR")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id_egreso;

    @Column(name="CONCEPTO_EGR")
    private String descripcionGasto;

    @Column(name="MONTO_EGR")
    private String montoEgreso;

    @Column(name="METODO_PAG_EGR")
    private String metodoPagEgreso;

    @Column(name="CUENTA_DEST_EGR")
    private String cuentaDestEgreso;

    @Column(name="FECH_EGR")
    private String fechaEgreso;

    @ManyToOne
    @JoinColumn(name="ID_COL")
    private colaborador colaborador;


}
