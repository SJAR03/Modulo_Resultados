package com.prolis.orden.entity;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tbl_ordenes")
@Data
public class Orden {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdOrden")
    private Long IdOrden;

    @Column(name = "IdTipoOrden")
    private Long idTipoOrden;

    @Column(name = "N_Orden")
    private String N_Orden;


}


