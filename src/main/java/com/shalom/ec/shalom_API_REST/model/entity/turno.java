package com.shalom.ec.shalom_API_REST.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="TB_TURNO")
public class turno {
    @Id
    @Column(name="ID_TUR")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_turno;
    @Column(name="DESC_TUR")
    private String descripcionTurno;
    @Column(name="HORA_TUR")
    private String horaTurno;


}
