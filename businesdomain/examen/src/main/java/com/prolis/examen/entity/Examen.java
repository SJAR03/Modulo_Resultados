package com.prolis.examen.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tbl_examenes")
@Data
public class Examen {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdExamen")
    private Long IdExamen;

    @Column(name = "IdAreaLabServicio")
    private int idAreaLabServicio;

    @Column(name = "DescripcionCorta")
    private String DescripcionCorta;
}
