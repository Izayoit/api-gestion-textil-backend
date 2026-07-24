package com.shalom.ec.shalom_API_REST.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="TB_PROCESO_DISENO")
public class procesoDiseno {
    @Id
    @Column(name="ID_PROC_DIS")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_procesoDiseno;

    @ManyToOne
    @JoinColumn(name="ID_DET_PED")
    private detallePedido detallePedido;

    @Column(name="URL_ARCH_DIS")
    private String urlArchivoDis;

    @Column(name="ESTA_PRUEBA_COL")
    private String estadoPruebaColor;

    @Column(name="ESTA_CONF_CLI")
    private String estadoConfCliente;

}
