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
@Table(name="TB_INVENTARIO_SUCURSAL")
public class inventarioSucursal {


    @Id
    @Column(name="ID_INV")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id_inventario;

    @Column(name="STOC_INV")
    private Integer stockInventario;

    @ManyToOne
    @JoinColumn(name="ID_PRO")
    private productoBase productoBase;

    @ManyToOne
    @JoinColumn(name="ID_SUCURSAL")
    private sucursal sucursal;


}
