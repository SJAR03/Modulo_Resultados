package com.prolis.usuario.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tbl_usuarios")
@Data
public class usuario {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdUsuario")
    private Long IdUsuario;
    @Column(name = "IdEmpleado")
    private int IdEmpleado;
    @Column(name = "Login")
    private String Login;

}
