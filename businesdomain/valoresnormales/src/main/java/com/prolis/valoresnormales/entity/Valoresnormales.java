package com.prolis.valoresnormales.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tbl_cat_valoresnormales")
@Data
public class Valoresnormales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdValoresNormales")
    private Long idValoresNormales;

    @Column(name = "IdExamen")
    private int idExamen;

    @Column(name = "IdSexo")
    private int idSexo;

    @Column(name = "RangoAlto")
    private int rangoAlto;

    @Column(name = "RangoBajo")
    private int rangoBajo;
}