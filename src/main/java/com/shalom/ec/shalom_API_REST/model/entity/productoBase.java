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
@Table(name="TB_PRODUCTO_BASE")

public class productoBase {
    @Id
    @Column(name="ID_PRO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id_productoBase;

    @Column(name="NOMB_PRO")
    private String nombrePorducto;
    @Column(name="PREC_PRO")
    private BigDecimal precioProducto;
    @ManyToOne
    @JoinColumn(name="ID_CAT")
    private categoria categoria;




}
