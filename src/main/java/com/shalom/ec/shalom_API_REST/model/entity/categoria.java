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
@Table(name="TB_CATEGORIA")
public class categoria {
    @Id
    @Column(name="ID_CAT")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id_categoria;

    @Column(name="NOMB_CAT")
    private String nombreCategoria;


    }

