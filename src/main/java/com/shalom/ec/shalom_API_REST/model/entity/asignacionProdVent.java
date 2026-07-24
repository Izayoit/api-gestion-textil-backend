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
@Table(name="TB_ASIGNACION_PRODUCCION_VENTA")
public class asignacionProdVent {

    @Id
    @Column(name="ID_PRO_VEN")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id_produccionVenta;

    @Column(name="ESTA_PRO_VEN")
    private String estadoProdVenta;
    @ManyToOne
    @JoinColumn(name="ID_DET_PED")
    private detallePedido detallePedido;

    @ManyToOne
    @JoinColumn(name="ID_COL")
    private colaborador colaborador;

}
