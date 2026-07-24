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
@Table(name="TB_SUCURSAL")
public class sucursal {
    @Id
    @Column(name="ID_SUCURSAL")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id_sucursal;

    @Column(name="NTEL_SUC")
    private String numeroTelefSucursal;

    @Column(name="HORA_SUC")
    private String horaSucursal;

    @Column(name="NOMB_SUC")
    private String nombreSucursal;

    @ManyToOne
    @JoinColumn(name="ID_UBI")
    private ubigeo ubigeo;

    
    
    
}
