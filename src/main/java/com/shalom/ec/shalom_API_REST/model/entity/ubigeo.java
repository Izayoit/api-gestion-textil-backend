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
@Table(name="TB_UBIGEO")
public class ubigeo {

    @Id
    @Column(name="ID_UBI")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_ubigeo;
    @Column(name="DEPA_UBI")
    private String despartamento_ubi;
    @Column(name="PRO_UBI")
    private String provincia_ubi;
    @Column(name="DIST_UBI")
    private String distrito_ubi;

}
