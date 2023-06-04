package com.prolis.resultado.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.lang.Nullable;

import java.sql.Timestamp;

@Entity
@Table(name = "tbl_resultados")
@Data
public class Resultados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdResultados")
    private Long idResultados;

    @Column(name = "IdExamen")
    private int idExamen;

    @Column(name = "IdOrden")
    private int idOrden;

    @Column(name = "Resultado", length = 250, nullable = false)
    private String Resultado;

    @Column(name = "Observaciones", length = 1000)
    private String Observaciones;

    @Column(name = "Procesado", length = 1, nullable = false)
    private String Procesado;

    @Column(name = "FechaProcesa")
    private Timestamp FechaProcesa;

    @Column(name = "IdUsuarioProcesa")
    private Integer IdUsuarioProcesa;

    @Nullable
    @Column(name = "Validado", length = 1)
    private String Validado;

    @Nullable
    @Column(name = "FechaValida")
    private Timestamp FechaValida;

    @Nullable
    @Column(name = "IdUsuarioValida")
    private Integer IdUsuarioValida;

    @Nullable
    @Column(name = "Impreso")
    private Integer Impreso;

    @Nullable
    @Column(name = "FechaImprime")
    private Timestamp FechaImprime;

    @Nullable
    @Column(name = "IdUsuarioImprime")
    private Integer IdUsuarioImprime;

    @Nullable
    @Column(name = "Estado")
    private Integer Estado;

}