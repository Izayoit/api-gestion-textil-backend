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
@Table(name="TB_USUARIO")
public class usuario {
    @Id
    @Column(name="ID_USU")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id_usuario;

    @Column(name="USER_USU")
    private String cuentaUsiario;

    @Column(name="PASS_HASH_USU")
    private String contraseñaEncriptada ;
    @ManyToOne
    @JoinColumn(name="ID_COL")
    private colaborador colaborador;


}
