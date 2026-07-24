package com.shalom.ec.shalom_API_REST.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="TB_CLIENTE")
public class cliente {
    @Id
    @Column(name="ID_CLI")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id_cliente;

    @Column(name="TIPO_CLIENTE")
    private String tipocliente;

    @Column(name="NTEL_CLI")
    private String numerotelefcliente;

    @Column(name="FECR_CLI")
    private String fechaRegistroCliente;

    @Column(name="DIRECCION_EXACTA")
    private String direccionExacta;

    @ManyToOne
    @JoinColumn(name="ID_UBI")
    private ubigeo ubigeo;

    @Column(name="NOMB_CLI")
    private String nombreCliente;

    @Column(name="APEL_CLI")
    private String apellidoCliente;

    @Column(name="DNI_CLI")
    private String dnicliente;

    @Column(name="RUC_CLI")
    private String rucCliente;

    @Column(name="RAZO_CLI")
    private String razonSocialcliente;





}
