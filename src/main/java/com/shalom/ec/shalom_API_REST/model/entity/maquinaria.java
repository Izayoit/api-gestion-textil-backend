package com.shalom.ec.shalom_API_REST.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="TB_MAQUINARIA")
//en el postman colocar los nombres de las variables alamcenadas
public class maquinaria implements Serializable {
    @Id
    @Column(name="ID_MAQ")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_maquinaria;
    @Column(name="NOMB_MAQ")
    private String nombreMaquinaria;
    @Column(name="FEC_MANT")
    private String fechaMantenimiento;
    @Column(name="FEC_PROX_MANT")
    private String fechaProxMatenimiento;
}
