package com.prolis.resultado.repository;

import com.prolis.resultado.entity.Resultados;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResultadosRepository extends JpaRepository<Resultados, Long> {
    List<Resultados> findByIdExamen(Long idExamen);
    List<Resultados> findByIdOrden(Long idOrden);
    List<Resultados> findByIdOrdenIn(List<Integer> ids);
    List<Resultados> findByIdExamenIn(List<Integer> ids);
}