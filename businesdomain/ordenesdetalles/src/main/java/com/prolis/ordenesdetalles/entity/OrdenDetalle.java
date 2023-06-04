package com.prolis.ordenesdetalles.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tbl_ordenesdetalle")
@Data
public class OrdenDetalle {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdOrdenDetalle")
    private Long idOrdenDetalle;

    @Column(name = "IdOrden")
    private Long idOrden;

    @Column(name = "N_Orden")
    private Long N_Orden;

    @Column(name = "IdExamen")
    private Long idExamen;
}